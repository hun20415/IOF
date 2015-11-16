/**                                                                                 	           **/
/**                                File Name   : FarmSectionInfoDaoIm.java                	               **/  		
/**                                Description : farmSectionInfo에 대한 Dao, 쿠리문 처리 		                   **/ 
/**                                Update      : 2015.05.14(옥정윤)	                               **/
/**                                ETC         :                    	                           **/
/**                                                                     	                       **/
package kr.ac.iof.main.dao.impl;

import java.util.ArrayList;
import java.util.List;

import kr.ac.iof.main.dao.FarmSectionInfoDao;
import kr.ac.iof.model.Main.FarmSectionInfo;
import kr.ac.iof.util.HibernateUtil;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

@Repository("farmSectionInfoDao")
public class FarmSectionInfoDaoIm implements FarmSectionInfoDao {
	private static final Logger logger = LoggerFactory.getLogger(FarmSectionInfoDaoIm.class);

	
	@Override
	public void add(FarmSectionInfo farmSectionInfo) {//insert
		Transaction trns = null;
		
		Session session = HibernateUtil.getSessionFactoryMain().openSession();//main db에 대한 session 호출
		
		try {
			trns = session.beginTransaction();
			session.save(farmSectionInfo);//farmSectionInfo 객체를 저장(insert 쿼리문)
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
	public void delete(int farmSectionInfoId) {
		System.out.println("farmSectionInfoDaolm");
		Transaction trns = null;
		Session session = HibernateUtil.getSessionFactoryMain().openSession();
		try {
			trns = session.beginTransaction();
			FarmSectionInfo farmSectionInfo = (FarmSectionInfo) session.load(FarmSectionInfo.class,
					new Integer(farmSectionInfoId));//id로 db에서 삭제해야 할 row을 불러온다.
			session.delete(farmSectionInfo);//삭제 쿼리문 
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
	public void update(FarmSectionInfo farmSectionInfo) {
		System.out.println("update");
		Transaction trns = null;
		Session session = HibernateUtil.getSessionFactoryMain().openSession();
		try {
			trns = session.beginTransaction();
			session.update(farmSectionInfo);//update 쿼리문
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
	public List<FarmSectionInfo> getAll() { // 컬럼에 속해있는 모든 데이터를 불러온다.
		System.out.println("farmSectionInfoDaolm");
		List<FarmSectionInfo> farmSectionInfos = new ArrayList<FarmSectionInfo>();
		
		Transaction trns = null;
		
		Session session = HibernateUtil.getSessionFactoryMain().openSession();
		try {
			trns = session.beginTransaction();
			farmSectionInfos = session.createQuery("from FarmSectionInfo").list();//list로 호출
		} catch (RuntimeException e) {
			e.printStackTrace();
		} finally {
			session.flush();
			session.close();
		}
		return farmSectionInfos;//리스트로 반환
	}

	@Override
	public FarmSectionInfo getById(int farmSectionInfoId) {
		System.out.println("farmSectionInfoDaolm");
		FarmSectionInfo farmSectionInfo = null;
		Transaction trns = null;
		Session session = HibernateUtil.getSessionFactoryMain().openSession();
		try {
			trns = session.beginTransaction();
			String queryString = "from FarmSectionInfo where farmSectionInfoId = :id";
			Query query = session.createQuery(queryString);
			query.setInteger("id", farmSectionInfoId);//id로 매칭 특정 행을 불러온다.
			farmSectionInfo = (FarmSectionInfo) query.uniqueResult();
		} catch (RuntimeException e) {
			e.printStackTrace();
		} finally {
			session.flush();
			session.close();
		}
		return farmSectionInfo;
	}
	
}
