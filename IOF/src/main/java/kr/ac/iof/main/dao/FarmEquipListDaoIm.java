/**                                                                                 	           **/
/**                                File Name   : FarmEquipListDaoIm.java                	               **/  		
/**                                Description : farmEquipList에 대한 Dao, 쿠리문 처리 		                   **/ 
/**                                Update      : 2015.05.14(옥정윤)	                               **/
/**                                ETC         :                    	                           **/
/**                                                                     	                       **/
package kr.ac.iof.main.dao;

import java.util.ArrayList;
import java.util.List;

import kr.ac.iof.model.User;
import kr.ac.iof.model.Main.FarmEquipList;
import kr.ac.iof.model.Main.FarmEquipType;
import kr.ac.iof.model.Main.FarmInfo;
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

	//songlock: 2015-06-01   
	@Override
	public void add(int m_farmId, int m_eqTypeId, FarmEquipList farmEquipList) {//insert
		Transaction trns = null;
		
		Session session = HibernateUtil.getSessionFactoryMain().openSession();//main db에 대한 session 호출
		
		try {
			trns = session.beginTransaction();
			
			FarmInfo farmInfo = (FarmInfo)session.load(FarmInfo.class, new Integer(m_farmId));
			FarmEquipType farmEquipType = (FarmEquipType)session.load(FarmEquipType.class, new Integer(m_eqTypeId));
			farmEquipList.setFarmInfo(farmInfo);
			farmEquipList.setEqType(farmEquipType);
			
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

	//songlock: 2015-06-01   
	@Override
	public void delete(int m_farmId, int m_eqTypeId) {
		System.out.println("farmEquipListDaolm");
		Transaction trns = null;
		Session session = HibernateUtil.getSessionFactoryMain().openSession();
		FarmEquipList farmEquipList = null;
		try {
			trns = session.beginTransaction();
			/*FarmEquipList farmEquipList = (FarmEquipList) session.load(FarmEquipList.class,
					new Integer(farmEquipListId));//id로 db에서 삭제해야 할 row을 불러온다. */
			String queryString = "from FarmEquipList where (farmId = :fid and eqId = :eid)";
			Query query = session.createQuery(queryString);
			query.setInteger("fid", m_farmId);//id로 매칭 특정 행을 불러온다.
			query.setInteger("eid", m_eqTypeId);//id로 매칭 특정 행을 불러온다.
			farmEquipList = (FarmEquipList) query.uniqueResult();

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

	//songlock: 2015-06-01
	@Override
	public void update(int m_farmId, int m_eqTypeId, FarmEquipList farmEquipList) {
		System.out.println("update");
		Transaction trns = null;
		Session session = HibernateUtil.getSessionFactoryMain().openSession();
		try {
			trns = session.beginTransaction();
			
			FarmInfo farmInfo = (FarmInfo)session.load(FarmInfo.class, new Integer(m_farmId));
			FarmEquipType farmEquipType = (FarmEquipType)session.load(FarmEquipType.class, new Integer(m_eqTypeId));
			farmEquipList.setFarmInfo(farmInfo);
			farmEquipList.setEqType(farmEquipType);
			
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
			System.out.println("Calling SQL~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			farmEquipLists = session.createQuery("from FarmEquipList group by farmInfo, farmSectionId").list();
			//farmEquipLists = session.createQuery("from FarmEquipList").list();//list로 호출
		} catch (RuntimeException e) {
			e.printStackTrace();
		} finally {
			session.flush();
			session.close();
		}
		return farmEquipLists;//리스트로 반환
	}

	//songlock: 2015-06-01
	@Override
	public FarmEquipList getById(int m_farmId, int m_eqTypeId) {
		System.out.println("farmEquipListDaolm");
		FarmEquipList farmEquipList = null;
		Transaction trns = null;
		Session session = HibernateUtil.getSessionFactoryMain().openSession();
		try {
			trns = session.beginTransaction();
			String queryString = "from FarmEquipList where (farmId = :fid and eqId= :eid)";
			Query query = session.createQuery(queryString);
			query.setInteger("fid", m_farmId);//id로 매칭 특정 행을 불러온다.
			query.setInteger("eid", m_eqTypeId);//id로 매칭 특정 행을 불러온다.
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
