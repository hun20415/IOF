/**                                                                                 	           **/
/**                                File Name   : UserGroupDaoIm.java                	               **/  		
/**                                Description : userGroup에 대한 Dao, 쿠리문 처리 		                   **/ 
/**                                Update      : 2015.05.07(박정훈)	                               **/
/**                                ETC         :                    	                           **/
/**                                                                     	                       **/
package kr.ac.iof.dao;

import java.util.ArrayList;
import java.util.List;

import kr.ac.iof.model.UserGroup;
import kr.ac.iof.util.HibernateUtil;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

@Repository("userGroupDao")
public class UserGroupDaoIm implements UserGroupDao {
	private static final Logger logger = LoggerFactory.getLogger(UserGroupDaoIm.class);

	
	@Override
	public void add(UserGroup userGroup) {//insert
		Transaction trns = null;
		
		Session session = HibernateUtil.getSessionFactory().openSession();//main db에 대한 session 호출
		
		try {
			trns = session.beginTransaction();
			session.save(userGroup);//userGroup 객체를 저장(insert 쿼리문)
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
	public void delete(int userGroupId) {
		System.out.println("userGroupDaolm");
		Transaction trns = null;
		Session session = HibernateUtil.getSessionFactory().openSession();
		try {
			trns = session.beginTransaction();
			UserGroup userGroup = (UserGroup) session.load(UserGroup.class,
					new Integer(userGroupId));//id로 db에서 삭제해야 할 row을 불러온다.
			session.delete(userGroup);//삭제 쿼리문 
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
	public void update(UserGroup userGroup) {
		System.out.println("update");
		Transaction trns = null;
		Session session = HibernateUtil.getSessionFactory().openSession();
		try {
			trns = session.beginTransaction();
			session.update(userGroup);//update 쿼리문
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
	public List<UserGroup> getAll() { // 컬럼에 속해있는 모든 데이터를 불러온다.
		System.out.println("userGroupDaolm");
		List<UserGroup> userGroups = new ArrayList<UserGroup>();
		
		Transaction trns = null;
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		try {
			trns = session.beginTransaction();
			userGroups = session.createQuery("from UserGroup").list();//list로 호출
		} catch (RuntimeException e) {
			e.printStackTrace();
		} finally {
			session.flush();
			session.close();
		}
		return userGroups;//리스트로 반환
	}

	@Override
	public UserGroup getById(int userGroupId) {
		System.out.println("userGroupDaolm");
		UserGroup userGroup = null;
		Transaction trns = null;
		Session session = HibernateUtil.getSessionFactory().openSession();
		try {
			trns = session.beginTransaction();
			String queryString = "from UserGroup where userGroup = :id";
			Query query = session.createQuery(queryString);
			query.setInteger("id", userGroupId);//id로 매칭 특정 행을 불러온다.
			userGroup = (UserGroup) query.uniqueResult();
		} catch (RuntimeException e) {
			e.printStackTrace();
		} finally {
			session.flush();
			session.close();
		}
		return userGroup;
	}
	
}
