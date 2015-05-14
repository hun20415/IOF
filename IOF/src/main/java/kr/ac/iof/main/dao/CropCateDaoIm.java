/**                                                                                 	           **/
/**                                File Name   : CropCateDaoIm.java                	               **/  		
/**                                Description : cropCate에 대한 Dao, 쿠리문 처리 		                   **/ 
/**                                Update      : 2015.05.07(박정훈)	                               **/
/**                                ETC         :                    	                           **/
/**                                                                     	                       **/
package kr.ac.iof.main.dao;

import java.util.ArrayList;
import java.util.List;

import kr.ac.iof.model.Main.CropCate;
import kr.ac.iof.util.HibernateUtil;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

@Repository("cropCateDao")
public class CropCateDaoIm implements CropCateDao {
	private static final Logger logger = LoggerFactory.getLogger(CropCateDaoIm.class);

	
	@Override
	public void add(CropCate cropCate) {//insert
		Transaction trns = null;
		
		Session session = HibernateUtil.getSessionFactoryMain().openSession();//main db에 대한 session 호출
		
		try {
			trns = session.beginTransaction();
			session.save(cropCate);//cropCate 객체를 저장(insert 쿼리문)
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
	public void delete(int cropCateId) {
		System.out.println("cropCateDaolm");
		Transaction trns = null;
		Session session = HibernateUtil.getSessionFactoryMain().openSession();
		try {
			trns = session.beginTransaction();
			CropCate cropCate = (CropCate) session.load(CropCate.class,
					new Integer(cropCateId));//id로 db에서 삭제해야 할 row을 불러온다.
			session.delete(cropCate);//삭제 쿼리문 
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
	public void update(CropCate cropCate) {
		System.out.println("update");
		Transaction trns = null;
		Session session = HibernateUtil.getSessionFactoryMain().openSession();
		try {
			trns = session.beginTransaction();
			session.update(cropCate);//update 쿼리문
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
	public List<CropCate> getAll() { // 컬럼에 속해있는 모든 데이터를 불러온다.
		System.out.println("cropCateDaolm");
		List<CropCate> cropCates = new ArrayList<CropCate>();
		
		Transaction trns = null;
		
		Session session = HibernateUtil.getSessionFactoryMain().openSession();
		try {
			trns = session.beginTransaction();
			cropCates = session.createQuery("from CropCate").list();//list로 호출
		} catch (RuntimeException e) {
			e.printStackTrace();
		} finally {
			session.flush();
			session.close();
		}
		return cropCates;//리스트로 반환
	}

	@Override
	public CropCate getById(int cropCateId) {
		System.out.println("cropCateDaolm");
		CropCate cropCate = null;
		Transaction trns = null;
		Session session = HibernateUtil.getSessionFactoryMain().openSession();
		try {
			trns = session.beginTransaction();
			String queryString = "from CropCate where cropCateId = :id";
			Query query = session.createQuery(queryString);
			query.setInteger("id", cropCateId);//id로 매칭 특정 행을 불러온다.
			cropCate = (CropCate) query.uniqueResult();
		} catch (RuntimeException e) {
			e.printStackTrace();
		} finally {
			session.flush();
			session.close();
		}
		return cropCate;
	}
	
}
