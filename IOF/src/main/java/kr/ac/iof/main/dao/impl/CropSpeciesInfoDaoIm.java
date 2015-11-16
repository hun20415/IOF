/**                                                                                 	           **/
/**                                File Name   : CropSpeciesInfoDaoIm.java                	               **/  		
/**                                Description : cropSpeciesInfo에 대한 Dao, 쿠리문 처리 		                   **/ 
/**                                Update      : 2015.05.14(옥정윤)	                               **/
/**                                ETC         :                    	                           **/
/**                                                                     	                       **/
package kr.ac.iof.main.dao.impl;

import java.util.ArrayList;
import java.util.List;

import kr.ac.iof.main.dao.CropSpeciesInfoDao;
import kr.ac.iof.model.Main.CropSpeciesInfo;
import kr.ac.iof.util.HibernateUtil;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

@Repository("cropSpeciesInfoDao")
public class CropSpeciesInfoDaoIm implements CropSpeciesInfoDao {
	private static final Logger logger = LoggerFactory.getLogger(CropSpeciesInfoDaoIm.class);

	
	@Override
	public void add(CropSpeciesInfo cropSpeciesInfo) {//insert
		Transaction trns = null;
		
		Session session = HibernateUtil.getSessionFactoryMain().openSession();//main db에 대한 session 호출
		
		try {
			trns = session.beginTransaction();
			session.save(cropSpeciesInfo);//cropSpeciesInfo 객체를 저장(insert 쿼리문)
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
	public void delete(int cropSpeciesInfoId) {
		System.out.println("cropSpeciesInfoDaolm");
		Transaction trns = null;
		Session session = HibernateUtil.getSessionFactoryMain().openSession();
		try {
			trns = session.beginTransaction();
			CropSpeciesInfo cropSpeciesInfo = (CropSpeciesInfo) session.load(CropSpeciesInfo.class,
					new Integer(cropSpeciesInfoId));//id로 db에서 삭제해야 할 row을 불러온다.
			session.delete(cropSpeciesInfo);//삭제 쿼리문 
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
	public void update(CropSpeciesInfo cropSpeciesInfo) {
		System.out.println("update");
		Transaction trns = null;
		Session session = HibernateUtil.getSessionFactoryMain().openSession();
		try {
			trns = session.beginTransaction();
			session.update(cropSpeciesInfo);//update 쿼리문
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
	public List<CropSpeciesInfo> getAll() { // 컬럼에 속해있는 모든 데이터를 불러온다.
		System.out.println("cropSpeciesInfoDaolm");
		List<CropSpeciesInfo> cropSpeciesInfos = new ArrayList<CropSpeciesInfo>();
		
		Transaction trns = null;
		
		Session session = HibernateUtil.getSessionFactoryMain().openSession();
		try {
			trns = session.beginTransaction();
			cropSpeciesInfos = session.createQuery("from CropSpeciesInfo").list();//list로 호출
		} catch (RuntimeException e) {
			e.printStackTrace();
		} finally {
			session.flush();
			session.close();
		}
		return cropSpeciesInfos;//리스트로 반환
	}

	@Override
	public CropSpeciesInfo getById(int cropSpeciesInfoId) {
		System.out.println("CropSpeciesInfoDaolm");
		CropSpeciesInfo cropSpeciesInfo = null;
		Transaction trns = null;
		Session session = HibernateUtil.getSessionFactoryMain().openSession();
		try {
			trns = session.beginTransaction();
			String queryString = "from CropSpeciesInfo where cropSpeciesInfoId = :id";
			Query query = session.createQuery(queryString);
			query.setInteger("id", cropSpeciesInfoId);//id로 매칭 특정 행을 불러온다.
			cropSpeciesInfo = (CropSpeciesInfo) query.uniqueResult();
		} catch (RuntimeException e) {
			e.printStackTrace();
		} finally {
			session.flush();
			session.close();
		}
		return cropSpeciesInfo;
	}
	
}
