/**                                                                                 	           **/
/**                                File Name   : HistWaterDaoIm.java                	               **/  		
/**                                Description : histWater?? ???? Dao, �?리문 �?�? 		                   **/ 
/**                                Update      : 2015.05.14(?��????)                               **/
/**                                ETC         :                    	                           **/
/**                                                                     	                       **/
package kr.ac.iof.main.dao.impl;

import java.util.ArrayList;
import java.util.List;

import kr.ac.iof.main.dao.SetTomatoTemperatureDao;
import kr.ac.iof.model.Main.SetTomatoTemperature;
import kr.ac.iof.util.HibernateUtil;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

@Repository("setTomatoTemperatureDao")
public class SetTomatoTemperatureDaoIm implements SetTomatoTemperatureDao {
	private static final Logger logger = LoggerFactory.getLogger(SetTomatoTemperatureDaoIm.class);

	
	@Override
	public void add(SetTomatoTemperature setTomatoTemperature) {//insert
		Transaction trns = null;
		
		Session session = HibernateUtil.getSessionFactoryMain().openSession();//main db?? ???? session ?��?
		
		try {
			trns = session.beginTransaction();
			session.save(setTomatoTemperature);//histWater �?체�?? ????(insert 쿼리�?)
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
	public void delete(int farmId, int seqNo) {
		//System.out.println("histWaterDaolm");
		Transaction trns = null;
		Session session = HibernateUtil.getSessionFactoryMain().openSession();
		SetTomatoTemperature setTomatoTemperature = null;
		try {
			trns = session.beginTransaction();
			
			/*HistWater histWater = (HistWater) session.load(HistWater.class,
					new Integer(int farmId, int seqNo));//id�? db???? ?????��?? ?? row?? �??��?��??.
			*/
			String queryString = "from HistWater where (farmId = :id and seqNo = :id2)";
			Query query = session.createQuery(queryString);
			query.setInteger("id", farmId);//id�? 매칭 ?��?? ???? �??��?��??.
			query.setInteger("id2", seqNo);//id�? 매칭 ?��?? ???? �??��?��??.
			setTomatoTemperature = (SetTomatoTemperature) query.uniqueResult();
			
			session.delete(setTomatoTemperature);//???? 쿼리�? 
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
/*
	@Override
	public void update(HistWater histWater) {
		System.out.println("update");
		Transaction trns = null;
		Session session = HibernateUtil.getSessionFactoryMain().openSession();
		try {
			trns = session.beginTransaction();
			session.update(histWater);//update 쿼리�?
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
	*/
	@Override
	public List<SetTomatoTemperature> getAll() { // 컬�?��?? ???��???? 모�?? ?��?��?��?? �??��?��??.
		System.out.println("histWaterDaolm");
		List<SetTomatoTemperature> histWaters = new ArrayList<SetTomatoTemperature>();
		
		Transaction trns = null;
		
		Session session = HibernateUtil.getSessionFactoryMain().openSession();
		try {
			trns = session.beginTransaction();
			
			histWaters = session.createQuery("from HistWater").list();//list�? ?��?
			
		} catch (RuntimeException e) {
			e.printStackTrace();
		} finally {
			session.flush();
			session.close();
		}
		return histWaters;//리�?��?��? �???
	}
/*
	@Override
	public HistWater getById(int farmId, int seqNo) {
		System.out.println("histWaterDaolm");
		HistWater histWater = null;
		Transaction trns = null;
		Session session = HibernateUtil.getSessionFactoryMain().openSession();
		try {
			trns = session.beginTransaction();
			String queryString = "from HistWater where (farmId = :id and seqNo = :id2)";
			Query query = session.createQuery(queryString);
			query.setInteger("id", farmId);//id�? 매칭 ?��?? ???? �??��?��??.
			query.setInteger("id2", seqNo);//id�? 매칭 ?��?? ???? �??��?��??.
			histWater = (HistWater) query.uniqueResult();
		} catch (RuntimeException e) {
			e.printStackTrace();
		} finally {
			session.flush();
			session.close();
		}
		return histWater;
	}
*/
	@Override
	public void update(SetTomatoTemperature setTomatoTemperature) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public SetTomatoTemperature getById(int farmId, int seqNo) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
