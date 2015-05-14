/**                                                                                 	           **/
/**                                File Name   : FarmEquipTypeDaoIm.java                	               **/  		
/**                                Description : farmEquipType에 대한 Dao, 쿠리문 처리 		                   **/ 
/**                                Update      : 2015.05.14(옥정윤)	                               **/
/**                                ETC         :                    	                           **/
/**                                                                     	                       **/
package kr.ac.iof.main.dao;

import java.util.ArrayList;
import java.util.List;

import kr.ac.iof.model.Main.FarmEquipType;
import kr.ac.iof.util.HibernateUtil;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

@Repository("farmEquipTypeDao")
public class FarmEquipTypeDaoIm implements FarmEquipTypeDao {
	private static final Logger logger = LoggerFactory.getLogger(FarmEquipTypeDaoIm.class);

	
	@Override
	public void add(FarmEquipType farmEquipType) {//insert
		Transaction trns = null;
		
		Session session = HibernateUtil.getSessionFactoryMain().openSession();//main db에 대한 session 호출
		
		try {
			trns = session.beginTransaction();
			session.save(farmEquipType);//farmEquipType 객체를 저장(insert 쿼리문)
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
	public void delete(int farmEquipTypeId) {
		System.out.println("farmEquipTypeDaolm");
		Transaction trns = null;
		Session session = HibernateUtil.getSessionFactoryMain().openSession();
		try {
			trns = session.beginTransaction();
			FarmEquipType farmEquipType = (FarmEquipType) session.load(FarmEquipType.class,
					new Integer(farmEquipTypeId));//id로 db에서 삭제해야 할 row을 불러온다.
			session.delete(farmEquipType);//삭제 쿼리문 
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
	public void update(FarmEquipType farmEquipType) {
		System.out.println("update");
		Transaction trns = null;
		Session session = HibernateUtil.getSessionFactoryMain().openSession();
		try {
			trns = session.beginTransaction();
			session.update(farmEquipType);//update 쿼리문
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
	public List<FarmEquipType> getAll() { // 컬럼에 속해있는 모든 데이터를 불러온다.
		System.out.println("farmEquipTypeDaolm");
		List<FarmEquipType> farmEquipTypes = new ArrayList<FarmEquipType>();
		
		Transaction trns = null;
		
		Session session = HibernateUtil.getSessionFactoryMain().openSession();
		try {
			trns = session.beginTransaction();
			farmEquipTypes = session.createQuery("from FarmEquipType").list();//list로 호출
		} catch (RuntimeException e) {
			e.printStackTrace();
		} finally {
			session.flush();
			session.close();
		}
		return farmEquipTypes;//리스트로 반환
	}

	@Override
	public FarmEquipType getById(int farmEquipTypeId) {
		System.out.println("farmEquipTypeDaolm");
		FarmEquipType farmEquipType = null;
		Transaction trns = null;
		Session session = HibernateUtil.getSessionFactoryMain().openSession();
		try {
			trns = session.beginTransaction();
			String queryString = "from FarmEquipType where farmEquipTypeId = :id";
			Query query = session.createQuery(queryString);
			query.setInteger("id", farmEquipTypeId);//id로 매칭 특정 행을 불러온다.
			farmEquipType = (FarmEquipType) query.uniqueResult();
		} catch (RuntimeException e) {
			e.printStackTrace();
		} finally {
			session.flush();
			session.close();
		}
		return farmEquipType;
	}
	
}
