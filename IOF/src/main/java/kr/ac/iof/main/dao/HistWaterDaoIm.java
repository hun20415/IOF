/**                                                                                 	           **/
/**                                File Name   : HistWaterDaoIm.java                	               **/  		
/**                                Description : histWater에 대한 Dao, 쿠리문 처리 		                   **/ 
/**                                Update      : 2015.05.14(옥정윤)                               **/
/**                                ETC         :                    	                           **/
/**                                                                     	                       **/
package kr.ac.iof.main.dao;

import java.util.ArrayList;
import java.util.List;

import kr.ac.iof.model.Main.HistWater;
import kr.ac.iof.util.HibernateUtil;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

@Repository("histWaterDao")
public class HistWaterDaoIm implements HistWaterDao {
	private static final Logger logger = LoggerFactory.getLogger(HistWaterDaoIm.class);

	
	@Override
	public void add(HistWater histWater) {//insert
		Transaction trns = null;
		
		Session session = HibernateUtil.getSessionFactoryMain().openSession();//main db에 대한 session 호출
		
		try {
			trns = session.beginTransaction();
			session.save(histWater);//histWater 객체를 저장(insert 쿼리문)
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
	public void delete(int histWaterId) {
		System.out.println("histWaterDaolm");
		Transaction trns = null;
		Session session = HibernateUtil.getSessionFactoryMain().openSession();
		try {
			trns = session.beginTransaction();
			HistWater histWater = (HistWater) session.load(HistWater.class,
					new Integer(histWaterId));//id로 db에서 삭제해야 할 row을 불러온다.
			session.delete(histWater);//삭제 쿼리문 
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
	public void update(HistWater histWater) {
		System.out.println("update");
		Transaction trns = null;
		Session session = HibernateUtil.getSessionFactoryMain().openSession();
		try {
			trns = session.beginTransaction();
			session.update(histWater);//update 쿼리문
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
	public List<HistWater> getAll() { // 컬럼에 속해있는 모든 데이터를 불러온다.
		System.out.println("histWaterDaolm");
		List<HistWater> histWaters = new ArrayList<HistWater>();
		
		Transaction trns = null;
		
		Session session = HibernateUtil.getSessionFactoryMain().openSession();
		try {
			trns = session.beginTransaction();
			histWaters = session.createQuery("from HistWater").list();//list로 호출
		} catch (RuntimeException e) {
			e.printStackTrace();
		} finally {
			session.flush();
			session.close();
		}
		return histWaters;//리스트로 반환
	}

	@Override
	public HistWater getById(int histWaterId) {
		System.out.println("histWaterDaolm");
		HistWater histWater = null;
		Transaction trns = null;
		Session session = HibernateUtil.getSessionFactoryMain().openSession();
		try {
			trns = session.beginTransaction();
			String queryString = "from HistWater where histWaterId = :id";
			Query query = session.createQuery(queryString);
			query.setInteger("id", histWaterId);//id로 매칭 특정 행을 불러온다.
			histWater = (HistWater) query.uniqueResult();
		} catch (RuntimeException e) {
			e.printStackTrace();
		} finally {
			session.flush();
			session.close();
		}
		return histWater;
	}
	
}
