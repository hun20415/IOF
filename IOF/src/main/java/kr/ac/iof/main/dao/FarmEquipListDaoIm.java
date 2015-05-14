/**                                                                                 	           **/
/**                                File Name   : FarmEquipListDaoIm.java                	               **/  		
/**                                Description : farmEquipList에 대한 Dao, 쿠리문 처리 		                   **/ 
/**                                Update      : 2015.05.14(옥정윤)	                               **/
/**                                ETC         :                    	                           **/
/**                                                                     	                       **/
package kr.ac.iof.main.dao;

import java.util.ArrayList;
import java.util.List;

import kr.ac.iof.model.Main.FarmEquipList;
import kr.ac.iof.util.HibernateUtil;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

@Repository("farmEquipListDao")
public class FarmEquipListDaoIm implements FarmEquipListDao {
	private static final Logger logger = LoggerFactory.getLogger(FarmEquipListDaoIm.class);

	
	@Override
	public void add(FarmEquipList farmEquipList) {//insert
		Transaction trns = null;
		
		Session session = HibernateUtil.getSessionFactoryMain().openSession();//main db에 대한 session 호출
		
		try {
			trns = session.beginTransaction();
			session.save(farmEquipList);//farmEquipList 객체를 저장(insert 쿼리문)
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
	public void delete(int farmEquipListId) {
		System.out.println("farmEquipListDaolm");
		Transaction trns = null;
		Session session = HibernateUtil.getSessionFactoryMain().openSession();
		try {
			trns = session.beginTransaction();
			FarmEquipList farmEquipList = (FarmEquipList) session.load(FarmEquipList.class,
					new Integer(farmEquipListId));//id로 db에서 삭제해야 할 row을 불러온다.
			session.delete(farmEquipList);//삭제 쿼리문 
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
	public void update(FarmEquipList farmEquipList) {
		System.out.println("update");
		Transaction trns = null;
		Session session = HibernateUtil.getSessionFactoryMain().openSession();
		try {
			trns = session.beginTransaction();
			session.update(farmEquipList);//update 쿼리문
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
	public List<FarmEquipList> getAll() { // 컬럼에 속해있는 모든 데이터를 불러온다.
		System.out.println("farmEquipListDaolm");
		List<FarmEquipList> farmEquipLists = new ArrayList<FarmEquipList>();
		
		Transaction trns = null;
		
		Session session = HibernateUtil.getSessionFactoryMain().openSession();
		try {
			trns = session.beginTransaction();
			farmEquipLists = session.createQuery("from FarmEquipList").list();//list로 호출
		} catch (RuntimeException e) {
			e.printStackTrace();
		} finally {
			session.flush();
			session.close();
		}
		return farmEquipLists;//리스트로 반환
	}

	@Override
	public FarmEquipList getById(int farmEquipListId) {
		System.out.println("farmEquipListDaolm");
		FarmEquipList farmEquipList = null;
		Transaction trns = null;
		Session session = HibernateUtil.getSessionFactoryMain().openSession();
		try {
			trns = session.beginTransaction();
			String queryString = "from FarmEquipList where farmEquipListId = :id";
			Query query = session.createQuery(queryString);
			query.setInteger("id", farmEquipListId);//id로 매칭 특정 행을 불러온다.
			farmEquipList = (FarmEquipList) query.uniqueResult();
		} catch (RuntimeException e) {
			e.printStackTrace();
		} finally {
			session.flush();
			session.close();
		}
		return farmEquipList;
	}
	
}
