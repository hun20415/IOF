/**                                                                                 	           **/
/**                                File Name   : HarvestShipmentDaoIm.java                	               **/  		
/**                                Description : harvestShipment에 대한 Dao, 쿠리문 처리 		                   **/ 
/**                                Update      : 2015.05.14(옥정윤)	                               **/
/**                                ETC         :                    	                           **/
/**                                                                     	                       **/
package kr.ac.iof.main.dao.impl;

import java.util.ArrayList;
import java.util.List;

import kr.ac.iof.main.dao.HarvestShipmentDao;
import kr.ac.iof.model.Main.HarvestShipment;
import kr.ac.iof.util.HibernateUtil;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

@Repository("harvestShipmentDao")
public class HarvestShipmentDaoIm implements HarvestShipmentDao {
	private static final Logger logger = LoggerFactory.getLogger(HarvestShipmentDaoIm.class);

	
	@Override
	public void add(HarvestShipment harvestShipment) {//insert
		Transaction trns = null;
		
		Session session = HibernateUtil.getSessionFactoryMain().openSession();//main db에 대한 session 호출
		
		try {
			trns = session.beginTransaction();
			session.save(harvestShipment);//harvestShipment 객체를 저장(insert 쿼리문)
			session.getTransaction().commit();
		} catch (RuntimeException e) {
			if (trns != null) {
				trns.rollback();
			}
			e.printStackTrace();
		} finally {
			session.flush();
			session.close();
		}
	}

	@Override
	public void delete(int harvestShipmentId) {
		System.out.println("harvestShipmentDaolm");
		Transaction trns = null;
		Session session = HibernateUtil.getSessionFactoryMain().openSession();
		try {
			trns = session.beginTransaction();
			HarvestShipment harvestShipment = (HarvestShipment) session.load(HarvestShipment.class,
					new Integer(harvestShipmentId));//id로 db에서 삭제해야 할 row을 불러온다.
			session.delete(harvestShipment);//삭제 쿼리문 
			session.getTransaction().commit();
		} catch (RuntimeException e) {
			if (trns != null) {
				trns.rollback();
			}
			e.printStackTrace();
		} finally {
			session.flush();
			session.close();
		}
	}

	@Override
	public void update(HarvestShipment harvestShipment) {
		System.out.println("update");
		Transaction trns = null;
		Session session = HibernateUtil.getSessionFactoryMain().openSession();
		try {
			trns = session.beginTransaction();
			session.update(harvestShipment);//update 쿼리문
			session.getTransaction().commit();
		} catch (RuntimeException e) {
			if (trns != null) {
				trns.rollback();
			}
			e.printStackTrace();
		} finally {
			session.flush();
			session.close();
		}
	}
	@Override
	public List<HarvestShipment> getAll() { // 컬럼에 속해있는 모든 데이터를 불러온다.
		System.out.println("harvestShipmentDaolm");
		List<HarvestShipment> harvestShipments = new ArrayList<HarvestShipment>();
		
		Transaction trns = null;
		
		Session session = HibernateUtil.getSessionFactoryMain().openSession();
		try {
			trns = session.beginTransaction();
			harvestShipments = session.createQuery("from HarvestShipment").list();//list로 호출
		} catch (RuntimeException e) {
			e.printStackTrace();
		} finally {
			session.flush();
			session.close();
		}
		return harvestShipments;//리스트로 반환
	}

	@Override
	public HarvestShipment getById(int harvestShipmentId) {
		System.out.println("harvestShipmentDaolm");
		HarvestShipment harvestShipment = null;
		Transaction trns = null;
		Session session = HibernateUtil.getSessionFactoryMain().openSession();
		try {
			trns = session.beginTransaction();
			String queryString = "from HarvestShipment where harvestShipmentId = :id";
			Query query = session.createQuery(queryString);
			query.setInteger("id", harvestShipmentId);//id로 매칭 특정 행을 불러온다.
			harvestShipment = (HarvestShipment) query.uniqueResult();
		} catch (RuntimeException e) {
			e.printStackTrace();
		} finally {
			session.flush();
			session.close();
		}
		return harvestShipment;
	}
	
}
