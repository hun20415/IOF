/**                                                                                 	           **/
/**                                File Name   : HistWaterDaoIm.java                	               **/  		
/**                                Description : histWater?? ???? Dao, ì¿?ë¦¬ë¬¸ ì²?ë¦? 		                   **/ 
/**                                Update      : 2015.05.14(?¥ì????)                               **/
/**                                ETC         :                    	                           **/
/**                                                                     	                       **/
package kr.ac.iof.main.dao;

import java.util.ArrayList;
import java.util.List;

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
		
		Session session = HibernateUtil.getSessionFactoryMain().openSession();//main db?? ???? session ?¸ì?
		
		try {
			trns = session.beginTransaction();
			session.save(setTomatoTemperature);//histWater ê°?ì²´ë?? ????(insert ì¿¼ë¦¬ë¬?)
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
					new Integer(int farmId, int seqNo));//idë¡? db???? ?????´ì?? ?? row?? ë¶??¬ì?¨ë??.
			*/
			String queryString = "from HistWater where (farmId = :id and seqNo = :id2)";
			Query query = session.createQuery(queryString);
			query.setInteger("id", farmId);//idë¡? ë§¤ì¹­ ?¹ì?? ???? ë¶??¬ì?¨ë??.
			query.setInteger("id2", seqNo);//idë¡? ë§¤ì¹­ ?¹ì?? ???? ë¶??¬ì?¨ë??.
			setTomatoTemperature = (SetTomatoTemperature) query.uniqueResult();
			
			session.delete(setTomatoTemperature);//???? ì¿¼ë¦¬ë¬? 
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
			session.update(histWater);//update ì¿¼ë¦¬ë¬?
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
	public List<SetTomatoTemperature> getAll() { // ì»¬ë?¼ì?? ???´ì???? ëª¨ë?? ?°ì?´í?°ë?? ë¶??¬ì?¨ë??.
		System.out.println("histWaterDaolm");
		List<SetTomatoTemperature> histWaters = new ArrayList<SetTomatoTemperature>();
		
		Transaction trns = null;
		
		Session session = HibernateUtil.getSessionFactoryMain().openSession();
		try {
			trns = session.beginTransaction();
			
			histWaters = session.createQuery("from HistWater").list();//listë¡? ?¸ì?
			
		} catch (RuntimeException e) {
			e.printStackTrace();
		} finally {
			session.flush();
			session.close();
		}
		return histWaters;//ë¦¬ì?¤í?¸ë? ë°???
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
			query.setInteger("id", farmId);//idë¡? ë§¤ì¹­ ?¹ì?? ???? ë¶??¬ì?¨ë??.
			query.setInteger("id2", seqNo);//idë¡? ë§¤ì¹­ ?¹ì?? ???? ë¶??¬ì?¨ë??.
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
