/**                                                                                 	           **/
/**                                File Name   : HarvestInfoDaoIm.java                	               **/  		
/**                                Description : harvestInfo에 대한 Dao, 쿠리문 처리 		                   **/ 
/**                                Update      : 2015.05.14(옥정윤)	                               **/
/**                                ETC         :                    	                           **/
/**                                                                     	                       **/
package kr.ac.iof.main.dao;

import java.util.ArrayList;
import java.util.List;

import kr.ac.iof.model.Main.HarvestInfo;
import kr.ac.iof.util.HibernateUtil;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

@Repository("harvestInfoDao")
public class HarvestInfoDaoIm implements HarvestInfoDao {
	private static final Logger logger = LoggerFactory.getLogger(HarvestInfoDaoIm.class);

	
	@Override
	public void add(HarvestInfo harvestInfo) {//insert
		Transaction trns = null;
		
		Session session = HibernateUtil.getSessionFactoryMain().openSession();//main db에 대한 session 호출
		
		try {
			trns = session.beginTransaction();
			session.save(harvestInfo);//harvestInfo 객체를 저장(insert 쿼리문)
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
	public void delete(int harvestInfoId) {
		System.out.println("harvestInfoDaolm");
		Transaction trns = null;
		Session session = HibernateUtil.getSessionFactoryMain().openSession();
		try {
			trns = session.beginTransaction();
			HarvestInfo harvestInfo = (HarvestInfo) session.load(HarvestInfo.class,
					new Integer(harvestInfoId));//id로 db에서 삭제해야 할 row을 불러온다.
			session.delete(harvestInfo);//삭제 쿼리문 
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
	public void update(HarvestInfo harvestInfo) {
		System.out.println("update");
		Transaction trns = null;
		Session session = HibernateUtil.getSessionFactoryMain().openSession();
		try {
			trns = session.beginTransaction();
			session.update(harvestInfo);//update 쿼리문
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
	public List<HarvestInfo> getAll() { // 컬럼에 속해있는 모든 데이터를 불러온다.
		System.out.println("harvestInfoDaolm");
		List<HarvestInfo> harvestInfos = new ArrayList<HarvestInfo>();
		
		Transaction trns = null;
		
		Session session = HibernateUtil.getSessionFactoryMain().openSession();
		try {
			trns = session.beginTransaction();
			harvestInfos = session.createQuery("from HarvestInfo").list();//list로 호출
		} catch (RuntimeException e) {
			e.printStackTrace();
		} finally {
			session.flush();
			session.close();
		}
		return harvestInfos;//리스트로 반환
	}

	@Override
	public HarvestInfo getById(int harvestInfoId) {
		System.out.println("harvestInfoDaolm");
		HarvestInfo harvestInfo = null;
		Transaction trns = null;
		Session session = HibernateUtil.getSessionFactoryMain().openSession();
		try {
			trns = session.beginTransaction();
			String queryString = "from HarvestInfo where harvestInfoId = :id";
			Query query = session.createQuery(queryString);
			query.setInteger("id", harvestInfoId);//id로 매칭 특정 행을 불러온다.
			harvestInfo = (HarvestInfo) query.uniqueResult();
		} catch (RuntimeException e) {
			e.printStackTrace();
		} finally {
			session.flush();
			session.close();
		}
		return harvestInfo;
	}
	
}
