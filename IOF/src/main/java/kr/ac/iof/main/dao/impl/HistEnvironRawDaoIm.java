/**                                                                                 	           **/
/**                                File Name   : HistEnvironRawDaoIm.java                	               **/  		
/**                                Description : histEnvironRaw에 대한 Dao, 쿠리문 처리 		                   **/ 
/**                                Update      : 2015.05.14(옥정윤)	                               **/
/**                                ETC         :                    	                           **/
/**                                                                     	                       **/
package kr.ac.iof.main.dao.impl;

import java.util.ArrayList;
import java.util.List;

import kr.ac.iof.main.dao.HistEnvironRawDao;
import kr.ac.iof.model.Main.FarmInfo;
import kr.ac.iof.model.Main.HistEnvironRaw;
import kr.ac.iof.util.HibernateUtil;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

@Repository("histEnvironRawDao")
public class HistEnvironRawDaoIm implements HistEnvironRawDao {
	private static final Logger logger = LoggerFactory.getLogger(HistEnvironRawDaoIm.class);

	
	@Override
	public void add(HistEnvironRaw histEnvironRaw) {//insert
		Transaction trns = null;
		
		Session session = HibernateUtil.getSessionFactoryMain().openSession();//main db에 대한 session 호출
		
		try {
			trns = session.beginTransaction();
			session.save(histEnvironRaw);//histEnvironRaw 객체를 저장(insert 쿼리문)
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
	public void delete(int histEnvironRawId) {
		System.out.println("histEnvironRawDaolm");
		Transaction trns = null;
		Session session = HibernateUtil.getSessionFactoryMain().openSession();
		try {
			trns = session.beginTransaction();
			HistEnvironRaw histEnvironRaw = (HistEnvironRaw) session.load(HistEnvironRaw.class,
					new Integer(histEnvironRawId));//id로 db에서 삭제해야 할 row을 불러온다.
			session.delete(histEnvironRaw);//삭제 쿼리문 
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
	public void update(HistEnvironRaw histEnvironRaw) {
		System.out.println("update");
		Transaction trns = null;
		Session session = HibernateUtil.getSessionFactoryMain().openSession();
		try {
			trns = session.beginTransaction();
			session.update(histEnvironRaw);//update 쿼리문
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
	public List<HistEnvironRaw> getAll() { // 컬럼에 속해있는 모든 데이터를 불러온다.
		System.out.println("histEnvironRawDaolm");
		List<HistEnvironRaw> histEnvironRaws = new ArrayList<HistEnvironRaw>();
		
		Transaction trns = null;
		
		Session session = HibernateUtil.getSessionFactoryMain().openSession();
		try {
			trns = session.beginTransaction();
			histEnvironRaws = session.createQuery("from HistEnvironRaw").list();//list로 호출
		} catch (RuntimeException e) {
			e.printStackTrace();
		} finally {
			session.flush();
			session.close();
		}
		return histEnvironRaws;//리스트로 반환
	}

	@Override
	public HistEnvironRaw getById(int histEnvironRawId) {
		System.out.println("histEnvironRawDaolm");
		HistEnvironRaw histEnvironRaw = null;
		Transaction trns = null;
		Session session = HibernateUtil.getSessionFactoryMain().openSession();
		try {
			trns = session.beginTransaction();
			String queryString = "from HistEnvironRaw where farm_id = :id";
			Query query = session.createQuery(queryString);
			query.setInteger("id", histEnvironRawId);//id로 매칭 특정 행을 불러온다.
			histEnvironRaw = (HistEnvironRaw) query.uniqueResult();
		} catch (RuntimeException e) {
			e.printStackTrace();
		} finally {
			session.flush();
			session.close();
		}
		return histEnvironRaw;
	}
	
	public List<HistEnvironRaw> getSelectEq(String farmId, String sectionId, String eqId){
		System.out.println("histEnvironRawDaolm, select eq");
		
		
		List<HistEnvironRaw> histEnvironRaws = new ArrayList<HistEnvironRaw>();
		
		Transaction trns = null;		
		Session session = HibernateUtil.getSessionFactoryMain().openSession();
		
		try {
			trns = session.beginTransaction();
			String queryString = "from HistEnvironRaw envir where farm_id=:farmId and farm_section_id = :sectionId and eq_id=:eqId order by envir.seqNo desc";
			Query query = session.createQuery(queryString);
			query.setString("farmId", farmId);//id로 매칭 특정 행을 불러온다.
			query.setString("sectionId", sectionId);//id로 매칭 특정 행을 불러온다.
			query.setString("eqId", eqId);//id로 매칭 특정 행을 불러온다.
			query.setMaxResults(1440);
			histEnvironRaws = query.list();
			
		} catch (RuntimeException e) {
			e.printStackTrace();
		} finally {
			session.flush();
			session.close();
		}
		return histEnvironRaws;//리스트로 반환
		
		
	}
	
}
