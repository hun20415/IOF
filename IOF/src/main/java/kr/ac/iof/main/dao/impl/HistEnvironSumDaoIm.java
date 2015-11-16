/**                                                                                 	           **/
/**                                File Name   : HistEnvironSumDaoIm.java                	               **/  		
/**                                Description : histEnvironSum에 대한 Dao, 쿠리문 처리 		                   **/ 
/**                                Update      : 2015.05.14(옥정윤)	                               **/
/**                                ETC         :                    	                           **/
/**                                                                     	                       **/
package kr.ac.iof.main.dao.impl;

import java.util.ArrayList;
import java.util.List;

import kr.ac.iof.main.dao.HistEnvironSumDao;
import kr.ac.iof.model.Main.HistEnvironSum;
import kr.ac.iof.util.HibernateUtil;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

@Repository("histEnvironSumDao")
public class HistEnvironSumDaoIm implements HistEnvironSumDao {
	private static final Logger logger = LoggerFactory.getLogger(HistEnvironSumDaoIm.class);

	
	@Override
	public void add(HistEnvironSum histEnvironSum) {//insert
		Transaction trns = null;
		
		Session session = HibernateUtil.getSessionFactoryMain().openSession();//main db에 대한 session 호출
		
		try {
			trns = session.beginTransaction();
			session.save(histEnvironSum);//histEnvironSum 객체를 저장(insert 쿼리문)
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
	public void delete(int histEnvironSumId) {
		System.out.println("histEnvironSumDaolm");
		Transaction trns = null;
		Session session = HibernateUtil.getSessionFactoryMain().openSession();
		try {
			trns = session.beginTransaction();
			HistEnvironSum histEnvironSum = (HistEnvironSum) session.load(HistEnvironSum.class,
					new Integer(histEnvironSumId));//id로 db에서 삭제해야 할 row을 불러온다.
			session.delete(histEnvironSum);//삭제 쿼리문 
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
	public void update(HistEnvironSum histEnvironSum) {
		System.out.println("update");
		Transaction trns = null;
		Session session = HibernateUtil.getSessionFactoryMain().openSession();
		try {
			trns = session.beginTransaction();
			session.update(histEnvironSum);//update 쿼리문
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
	public List<HistEnvironSum> getAll() { // 컬럼에 속해있는 모든 데이터를 불러온다.
		System.out.println("histEnvironSumDaolm");
		List<HistEnvironSum> histEnvironSums = new ArrayList<HistEnvironSum>();
		
		Transaction trns = null;
		
		Session session = HibernateUtil.getSessionFactoryMain().openSession();
		try {
			trns = session.beginTransaction();
			histEnvironSums = session.createQuery("from HistEnvironSum").list();//list로 호출
		} catch (RuntimeException e) {
			e.printStackTrace();
		} finally {
			session.flush();
			session.close();
		}
		return histEnvironSums;//리스트로 반환
	}

	@Override
	public HistEnvironSum getById(int histEnvironSumId) {
		System.out.println("histEnvironSumDaolm");
		HistEnvironSum histEnvironSum = null;
		Transaction trns = null;
		Session session = HibernateUtil.getSessionFactoryMain().openSession();
		try {
			trns = session.beginTransaction();
			String queryString = "from HistEnvironSum where histEnvironSumId = :id";
			Query query = session.createQuery(queryString);
			query.setInteger("id", histEnvironSumId);//id로 매칭 특정 행을 불러온다.
			histEnvironSum = (HistEnvironSum) query.uniqueResult();
		} catch (RuntimeException e) {
			e.printStackTrace();
		} finally {
			session.flush();
			session.close();
		}
		return histEnvironSum;
	}
	
}
