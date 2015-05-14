/**                                                                                 	           **/
/**                                File Name   : BuyerInfoDaoIm.java                	               **/  		
/**                                Description : buyerInfo에 대한 Dao, 쿠리문 처리 		                   **/ 
/**                                Update      : 2015.05.07(박정훈)	                               **/
/**                                ETC         :                    	                           **/
/**                                                                     	                       **/
package kr.ac.iof.main.dao;

import java.util.ArrayList;
import java.util.List;

import kr.ac.iof.model.Main.BuyerInfo;
import kr.ac.iof.util.HibernateUtil;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

@Repository("buyerInfoDao")
public class BuyerInfoDaoIm implements BuyerInfoDao {
	private static final Logger logger = LoggerFactory
			.getLogger(BuyerInfoDaoIm.class);

	
	@Override
	public void add(BuyerInfo buyerInfo) {//insert
		Transaction trns = null;
		
		Session session = HibernateUtil.getSessionFactoryMain().openSession();//main db에 대한 session 호출
		
		try {
			trns = session.beginTransaction();
			session.save(buyerInfo);//buyerInfo 객체를 저장(insert 쿼리문)
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
	public void delete(int buyerInfoId) {
		System.out.println("cripCateDaolm");
		Transaction trns = null;
		Session session = HibernateUtil.getSessionFactoryMain().openSession();
		try {
			trns = session.beginTransaction();
			BuyerInfo buyerInfo = (BuyerInfo) session.load(BuyerInfo.class,
					new Integer(buyerInfoId));//id로 db에서 삭제해야 할 row을 불러온다.
			session.delete(buyerInfo);//삭제 쿼리문 
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
	public void update(BuyerInfo buyerInfo) {
		System.out.println("update");
		Transaction trns = null;
		Session session = HibernateUtil.getSessionFactoryMain().openSession();
		try {
			trns = session.beginTransaction();
			session.update(buyerInfo);//update 쿼리문
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
	public List<BuyerInfo> getAll() { // 컬럼에 속해있는 모든 데이터를 불러온다.
		System.out.println("cripCateDaolm");
		List<BuyerInfo> buyerInfos = new ArrayList<BuyerInfo>();
		
		Transaction trns = null;
		
		Session session = HibernateUtil.getSessionFactoryMain().openSession();
		try {
			trns = session.beginTransaction();
			buyerInfos = session.createQuery("from BuyerInfo").list();//list로 호출
		} catch (RuntimeException e) {
			e.printStackTrace();
		} finally {
			session.flush();
			session.close();
		}
		return buyerInfos;//리스트로 반환
	}

	@Override
	public BuyerInfo getById(int buyerInfoId) {
		System.out.println("cripCateDaolm");
		BuyerInfo buyerInfo = null;
		Transaction trns = null;
		Session session = HibernateUtil.getSessionFactoryMain().openSession();
		try {
			trns = session.beginTransaction();
			String queryString = "from BuyerInfo where buyerInfoId = :id";
			Query query = session.createQuery(queryString);
			query.setInteger("id", buyerInfoId);//id로 매칭 특정 행을 불러온다.
			buyerInfo = (BuyerInfo) query.uniqueResult();
		} catch (RuntimeException e) {
			e.printStackTrace();
		} finally {
			session.flush();
			session.close();
		}
		return buyerInfo;
	}
	
}
