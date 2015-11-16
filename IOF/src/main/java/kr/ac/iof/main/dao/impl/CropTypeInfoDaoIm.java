/**                                                                                 	           **/
/**                                File Name   : CropTypeInfoDaoIm.java                	               **/  		
/**                                Description : cropTypeInfo에 대한 Dao, 쿠리문 처리 		                   **/ 
/**                                Update      : 2015.05.14(옥정윤)	                               **/
/**                                ETC         :                    	                           **/
/**                                                                     	                       **/
package kr.ac.iof.main.dao.impl;

import java.util.ArrayList;
import java.util.List;

import kr.ac.iof.main.dao.CropTypeInfoDao;
import kr.ac.iof.model.Main.CropTypeInfo;
import kr.ac.iof.util.HibernateUtil;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

@Repository("cropTypeInfoDao")
public class CropTypeInfoDaoIm implements CropTypeInfoDao {
	private static final Logger logger = LoggerFactory.getLogger(CropTypeInfoDaoIm.class);

	
	@Override
	public void add(CropTypeInfo cropTypeInfo) {//insert
		Transaction trns = null;
		
		Session session = HibernateUtil.getSessionFactoryMain().openSession();//main db에 대한 session 호출
		
		try {
			trns = session.beginTransaction();
			session.save(cropTypeInfo);//cropTypeInfo 객체를 저장(insert 쿼리문)
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
	public void delete(int cropTypeInfoId) {
		System.out.println("cropTypeInfoDaolm");
		Transaction trns = null;
		Session session = HibernateUtil.getSessionFactoryMain().openSession();
		try {
			trns = session.beginTransaction();
			CropTypeInfo cropTypeInfo = (CropTypeInfo) session.load(CropTypeInfo.class,
					new Integer(cropTypeInfoId));//id로 db에서 삭제해야 할 row을 불러온다.
			session.delete(cropTypeInfo);//삭제 쿼리문 
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
	public void update(CropTypeInfo cropTypeInfo) {
		System.out.println("update");
		Transaction trns = null;
		Session session = HibernateUtil.getSessionFactoryMain().openSession();
		try {
			trns = session.beginTransaction();
			session.update(cropTypeInfo);//update 쿼리문
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
	public List<CropTypeInfo> getAll() { // 컬럼에 속해있는 모든 데이터를 불러온다.
		System.out.println("cropTypeInfoDaolm");
		List<CropTypeInfo> cropTypeInfos = new ArrayList<CropTypeInfo>();
		
		Transaction trns = null;
		
		Session session = HibernateUtil.getSessionFactoryMain().openSession();
		try {
			trns = session.beginTransaction();
			cropTypeInfos = session.createQuery("from CropTypeInfo").list();//list로 호출
		} catch (RuntimeException e) {
			e.printStackTrace();
		} finally {
			session.flush();
			session.close();
		}
		return cropTypeInfos;//리스트로 반환
	}

	@Override
	public CropTypeInfo getById(int cropTypeInfoId) {
		System.out.println("CropTypeInfoDaolm");
		CropTypeInfo cropTypeInfo = null;
		Transaction trns = null;
		Session session = HibernateUtil.getSessionFactoryMain().openSession();
		try {
			trns = session.beginTransaction();
			String queryString = "from CropTypeInfo where cropTypeInfoId = :id";
			Query query = session.createQuery(queryString);
			query.setInteger("id", cropTypeInfoId);//id로 매칭 특정 행을 불러온다.
			cropTypeInfo = (CropTypeInfo) query.uniqueResult();
		} catch (RuntimeException e) {
			e.printStackTrace();
		} finally {
			session.flush();
			session.close();
		}
		return cropTypeInfo;
	}
	
}
