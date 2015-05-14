/**                                                                                 	           **/
/**                                File Name   : DsCategoryDaoIm.java                	               **/  		
/**                                Description : dsCategory에 대한 Dao, 쿠리문 처리 		                   **/ 
/**                                Update      : 2015.05.14(옥정윤)	                               **/
/**                                ETC         :                    	                           **/
/**                                                                     	                       **/
package kr.ac.iof.main.dao;

import java.util.ArrayList;
import java.util.List;

import kr.ac.iof.model.Main.DsCategory;
import kr.ac.iof.util.HibernateUtil;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

@Repository("dsCategoryDao")
public class DsCategoryDaoIm implements DsCategoryDao {
	private static final Logger logger = LoggerFactory.getLogger(DsCategoryDaoIm.class);

	
	@Override
	public void add(DsCategory dsCategory) {//insert
		Transaction trns = null;
		
		Session session = HibernateUtil.getSessionFactoryMain().openSession();//main db에 대한 session 호출
		
		try {
			trns = session.beginTransaction();
			session.save(dsCategory);//dsCategory 객체를 저장(insert 쿼리문)
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
	public void delete(int dsCategoryId) {
		System.out.println("dsCategoryDaolm");
		Transaction trns = null;
		Session session = HibernateUtil.getSessionFactoryMain().openSession();
		try {
			trns = session.beginTransaction();
			DsCategory dsCategory = (DsCategory) session.load(DsCategory.class,
					new Integer(dsCategoryId));//id로 db에서 삭제해야 할 row을 불러온다.
			session.delete(dsCategory);//삭제 쿼리문 
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
	public void update(DsCategory dsCategory) {
		System.out.println("update");
		Transaction trns = null;
		Session session = HibernateUtil.getSessionFactoryMain().openSession();
		try {
			trns = session.beginTransaction();
			session.update(dsCategory);//update 쿼리문
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
	public List<DsCategory> getAll() { // 컬럼에 속해있는 모든 데이터를 불러온다.
		System.out.println("dsCategoryDaolm");
		List<DsCategory> dsCategorys = new ArrayList<DsCategory>();
		
		Transaction trns = null;
		
		Session session = HibernateUtil.getSessionFactoryMain().openSession();
		try {
			trns = session.beginTransaction();
			dsCategorys = session.createQuery("from DsCategory").list();//list로 호출
		} catch (RuntimeException e) {
			e.printStackTrace();
		} finally {
			session.flush();
			session.close();
		}
		return dsCategorys;//리스트로 반환
	}

	@Override
	public DsCategory getById(int dsCategoryId) {
		System.out.println("dsCategoryDaolm");
		DsCategory dsCategory = null;
		Transaction trns = null;
		Session session = HibernateUtil.getSessionFactoryMain().openSession();
		try {
			trns = session.beginTransaction();
			String queryString = "from DsCategory where dsCategoryId = :id";
			Query query = session.createQuery(queryString);
			query.setInteger("id", dsCategoryId);//id로 매칭 특정 행을 불러온다.
			dsCategory = (DsCategory) query.uniqueResult();
		} catch (RuntimeException e) {
			e.printStackTrace();
		} finally {
			session.flush();
			session.close();
		}
		return dsCategory;
	}
	
}
