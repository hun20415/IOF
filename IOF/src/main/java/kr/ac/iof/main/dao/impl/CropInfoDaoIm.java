/**                                                                                 	           **/
/**                                File Name   : CropInfoDaoIm.java                	               **/  		
/**                                Description : cropCate에 대한 Dao, 쿠리문 처리 		                   **/ 
/**                                Update      : 2015.05.07(박정훈)	                               **/
/**                                ETC         :                    	                           **/
/**                                                                     	                       **/
package kr.ac.iof.main.dao.impl;

import java.util.ArrayList;
import java.util.List;

import kr.ac.iof.main.dao.CropInfoDao;
import kr.ac.iof.model.Main.CropInfo;
import kr.ac.iof.util.HibernateUtil;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

@Repository("cropInfoDao")
public class CropInfoDaoIm implements CropInfoDao {
	private static final Logger logger = LoggerFactory
			.getLogger(CropInfoDaoIm.class);

	
	@Override
	public void add(CropInfo cropInfo) {
		Transaction trns = null;
		
		Session session = HibernateUtil.getSessionFactoryMain().openSession();
		try {
			trns = session.beginTransaction();
			session.save(cropInfo);
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
	public void delete (int cropInfoId) {
		Transaction trns = null;
		Session session = HibernateUtil.getSessionFactoryMain().openSession();
		try {
			trns = session.beginTransaction();
			CropInfo cropInfo = (CropInfo) session.load(CropInfo.class,
					new Integer(cropInfoId));
			session.delete(cropInfo);
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
	public void update(CropInfo cropInfo) {
		
		Transaction trns = null;
		Session session = HibernateUtil.getSessionFactoryMain().openSession();
		try {
			trns = session.beginTransaction();
			session.update(cropInfo);
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
	public List<CropInfo> getAll() {
		System.out.println("cropInfoDaolm");
		List<CropInfo> cropInfos = new ArrayList<CropInfo>();
		
		Transaction trns = null;
		
		Session session = HibernateUtil.getSessionFactoryMain().openSession();
		try {
			trns = session.beginTransaction();
			cropInfos = session.createQuery("from CropInfo").list();
		} catch (RuntimeException e) {
			e.printStackTrace();
		} finally {
			session.flush();
			session.close();
		}
		return cropInfos;
	}

	@Override
	public CropInfo getById(int cropInfoId) {
		
		CropInfo cropInfo = null;
		Transaction trns = null;
		Session session = HibernateUtil.getSessionFactoryMain().openSession();
		try {
			trns = session.beginTransaction();
			String queryString = "from CropInfo where cropInfoId = :id";
			Query query = session.createQuery(queryString);
			query.setInteger("id", cropInfoId);
			cropInfo = (CropInfo) query.uniqueResult();
		} catch (RuntimeException e) {
			e.printStackTrace();
		} finally {
			session.flush();
			session.close();
		}
		return cropInfo;
	}

}
