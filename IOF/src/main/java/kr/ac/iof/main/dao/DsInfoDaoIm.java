/**                                                                                 	           **/
/**                                File Name   : DsInfoDaoIm.java                	               **/  		
/**                                Description : dsInfo에 대한 Dao, 쿠리문 처리 		                   **/ 
/**                                Update      : 2015.05.14(옥정윤)	                               **/
/**                                ETC         :                    	                           **/
/**                                                                     	                       **/
package kr.ac.iof.main.dao;

import java.util.ArrayList;
import java.util.List;

import kr.ac.iof.model.Main.DsInfo;
import kr.ac.iof.util.HibernateUtil;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

@Repository("dsInfoDao")
public class DsInfoDaoIm implements DsInfoDao {
	private static final Logger logger = LoggerFactory.getLogger(DsInfoDaoIm.class);

	
	@Override
	public void add(DsInfo dsInfo) {//insert
		Transaction trns = null;
		
		Session session = HibernateUtil.getSessionFactoryMain().openSession();//main db에 대한 session 호출
		
		try {
			trns = session.beginTransaction();
			session.save(dsInfo);//dsInfo 객체를 저장(insert 쿼리문)
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
	public void delete(int dsInfoId) {
		System.out.println("dsInfoDaolm");
		Transaction trns = null;
		Session session = HibernateUtil.getSessionFactoryMain().openSession();
		try {
			trns = session.beginTransaction();
			DsInfo dsInfo = (DsInfo) session.load(DsInfo.class,
					new Integer(dsInfoId));//id로 db에서 삭제해야 할 row을 불러온다.
			session.delete(dsInfo);//삭제 쿼리문 
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
	public void update(DsInfo dsInfo) {
		System.out.println("update");
		Transaction trns = null;
		Session session = HibernateUtil.getSessionFactoryMain().openSession();
		try {
			trns = session.beginTransaction();
			session.update(dsInfo);//update 쿼리문
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
	public List<DsInfo> getAll() { // 컬럼에 속해있는 모든 데이터를 불러온다.
		System.out.println("dsInfoDaolm");
		List<DsInfo> dsInfos = new ArrayList<DsInfo>();
		
		Transaction trns = null;
		
		Session session = HibernateUtil.getSessionFactoryMain().openSession();
		try {
			trns = session.beginTransaction();
			dsInfos = session.createQuery("from DsInfo").list();//list로 호출
		} catch (RuntimeException e) {
			e.printStackTrace();
		} finally {
			session.flush();
			session.close();
		}
		return dsInfos;//리스트로 반환
	}

	@Override
	public DsInfo getById(int dsInfoId) {
		System.out.println("dsInfoDaolm");
		DsInfo dsInfo = null;
		Transaction trns = null;
		Session session = HibernateUtil.getSessionFactoryMain().openSession();
		try {
			trns = session.beginTransaction();
			String queryString = "from DsInfo where dsInfoId = :id";
			Query query = session.createQuery(queryString);
			query.setInteger("id", dsInfoId);//id로 매칭 특정 행을 불러온다.
			dsInfo = (DsInfo) query.uniqueResult();
		} catch (RuntimeException e) {
			e.printStackTrace();
		} finally {
			session.flush();
			session.close();
		}
		return dsInfo;
	}
	
}
