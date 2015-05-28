/**                                                                                 	           **/
/**                                File Name   : FarmInfoDaoIm.java                	               **/  		
/**                                Description : farmInfo에 대한 Dao, 쿠리문 처리 		                   **/ 
/**                                Update      : 2015.05.14(옥정윤)	                               **/
/**                                ETC         :                    	                           **/
/**                                                                     	                       **/
package kr.ac.iof.main.dao;

import java.util.ArrayList;
import java.util.List;

import kr.ac.iof.model.User;
import kr.ac.iof.model.UserGroup;
import kr.ac.iof.model.Main.FarmInfo;
import kr.ac.iof.util.HibernateUtil;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

@Repository("farmInfoDao")
public class FarmInfoDaoIm implements FarmInfoDao {
	private static final Logger logger = LoggerFactory.getLogger(FarmInfoDaoIm.class);

	//songlock: 2015-05-28
	@Override
	public void add(String m_owner, String m_employee, FarmInfo farmInfo) {//insert
		Transaction trns = null;
		
		Session session = HibernateUtil.getSessionFactoryMain().openSession();//main db에 대한 session 호출
		
		try {
			trns = session.beginTransaction();
			
			User owner = (User)session.load(User.class, new Integer(m_owner));
			User employee = (User)session.load(User.class, new Integer(m_employee));
			farmInfo.setOwner(owner);
			farmInfo.setEmployee(employee);
			
			session.save(farmInfo);//farmInfo 객체를 저장(insert 쿼리문)
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
	public void delete(int farmInfoId) {
		System.out.println("farmInfoDaolm");
		Transaction trns = null;
		Session session = HibernateUtil.getSessionFactoryMain().openSession();
		try {
			trns = session.beginTransaction();
			FarmInfo farmInfo = (FarmInfo) session.load(FarmInfo.class,
					new Integer(farmInfoId));//id로 db에서 삭제해야 할 row을 불러온다.
			session.delete(farmInfo);//삭제 쿼리문 
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

	//songlock: 2015-05-28
	@Override
	public void update(String m_owner, String m_employee, FarmInfo farmInfo) {
		System.out.println("update");
		Transaction trns = null;
		Session session = HibernateUtil.getSessionFactoryMain().openSession();
		try {
			trns = session.beginTransaction();
			
			User owner = (User)session.load(User.class, new Integer(m_owner));
			User employee = (User)session.load(User.class, new Integer(m_employee));
			farmInfo.setOwner(owner);
			farmInfo.setEmployee(employee);
			
			session.update(farmInfo);//update 쿼리문
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
	public List<FarmInfo> getAll() { // 컬럼에 속해있는 모든 데이터를 불러온다.
		System.out.println("farmInfoDaolm");
		List<FarmInfo> farmInfos = new ArrayList<FarmInfo>();
		
		Transaction trns = null;
		
		Session session = HibernateUtil.getSessionFactoryMain().openSession();
		try {
			trns = session.beginTransaction();
			farmInfos = session.createQuery("from FarmInfo").list();//list로 호출
		} catch (RuntimeException e) {
			e.printStackTrace();
		} finally {
			session.flush();
			session.close();
		}
		return farmInfos;//리스트로 반환
	}
	//$$$$$$$$$$$$$$$$$$$$$$$$$$$$>>>>>>>
	@Override
	public List<String> getAllId() { // 컬럼에 속해있는 모든 데이터를 불러온다.
		System.out.println("farmInfoDaolm");
		List<String> farmInfos = new ArrayList<String>();
		
		Transaction trns = null;
		
		Session session = HibernateUtil.getSessionFactoryMain().openSession();
		try {
			trns = session.beginTransaction();
			farmInfos = session.createQuery("from FarmInfo where owner").list();//list로 호출
		} catch (RuntimeException e) {
			e.printStackTrace();
		} finally {
			session.flush();
			session.close();
		}
		return farmInfos;//리스트로 반환
	}
	//$$$$$$$$$$$$$$$$$$$$$$$$$$$$<<<<<지워야됨, 연관성 있는 코드 확인해서 고쳐줘야함
	
	
	// 오너 아이디 검색 DAO
	@Override
	public List<FarmInfo> getOwnerIdList(String ownerId) { // 컬럼에 속해있는 모든 데이터를 불러온다.
		List<FarmInfo> farmInfos = new ArrayList<FarmInfo>();
		
		Transaction trns = null;
		
		Session session = HibernateUtil.getSessionFactoryMain().openSession();
		
		try {
			trns = session.beginTransaction();
			String queryString = "from FarmInfo where owner= :id";
			Query query = session.createQuery(queryString);
			query.setString("id", ownerId);//id로 매칭 특정 행을 불러온다.
			farmInfos = query.list();
			
		} catch (RuntimeException e) {
			e.printStackTrace();
		} finally {
			session.flush();
			session.close();
		}
		return farmInfos;//리스트로 반환
	}
	//오너 아이디 검색 DAO 끝
	@Override
	public FarmInfo getById(int farmInfoId) {
		System.out.println("farmInfoDaolm");
		FarmInfo farmInfo = null;
		Transaction trns = null;
		Session session = HibernateUtil.getSessionFactoryMain().openSession();
		try {
			trns = session.beginTransaction();
			String queryString = "from FarmInfo where farmId = :id";
			Query query = session.createQuery(queryString);
			query.setInteger("id", farmInfoId);//id로 매칭 특정 행을 불러온다.
			farmInfo = (FarmInfo) query.uniqueResult();
		} catch (RuntimeException e) {
			e.printStackTrace();
		} finally {
			session.flush();
			session.close();
		}
		return farmInfo;
	}
	
}
