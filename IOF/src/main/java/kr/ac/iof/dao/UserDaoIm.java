/**                                                                                 	           **/
/**                                File Name   : UserDaoIm.java                	               **/  		
/**                                Description : user에 대한 Dao, 쿠리문 처리 		                   **/ 
/**                                Update      : 2015.05.14(박정훈)	                               **/
/**                                ETC         :                    	                           **/
/**                                                                     	                       **/
package kr.ac.iof.dao;

import java.util.ArrayList;
import java.util.List;

import kr.ac.iof.model.User;
import kr.ac.iof.util.HibernateUtil;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

@Repository("userDao")
public class UserDaoIm implements UserDao {
	private static final Logger logger = LoggerFactory.getLogger(UserDaoIm.class);

	
	@Override
	public void add(User user) {//insert
		Transaction trns = null;
		
		Session session = HibernateUtil.getSessionFactory().openSession();//sys db에 대한 session 호출
		
		try {
			trns = session.beginTransaction();
			session.save(user);//user 객체를 저장(insert 쿼리문)
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
	public void delete(String userId) {
		System.out.println("userDaolm");
		Transaction trns = null;
		Session session = HibernateUtil.getSessionFactory().openSession();
		try {
			trns = session.beginTransaction();
			User user = (User) session.load(User.class,
					new String(userId));//id로 db에서 삭제해야 할 row을 불러온다.
			session.delete(user);//삭제 쿼리문 
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
	public void update(User user) {
		System.out.println("update");
		Transaction trns = null;
		Session session = HibernateUtil.getSessionFactory().openSession();
		try {
			trns = session.beginTransaction();
			session.update(user);//update 쿼리문
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
	public List<User> getAll() { // 컬럼에 속해있는 모든 데이터를 불러온다.
		System.out.println("userDaolm");
		List<User> users = new ArrayList<User>();
		
		Transaction trns = null;
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		try {
			trns = session.beginTransaction();
			users = session.createQuery("from User").list();//list로 호출
		} catch (RuntimeException e) {
			e.printStackTrace();
		} finally {
			session.flush();
			session.close();
		}
		return users;//리스트로 반환
	}

	@Override
	public User getById(String userId) {
		System.out.println("userDaolm");
		User user = null;
		Transaction trns = null;
		Session session = HibernateUtil.getSessionFactory().openSession();
		try {
			trns = session.beginTransaction();
			String queryString = "from User where userId = :id";
			Query query = session.createQuery(queryString);
			query.setString("id", userId);//id로 매칭 특정 행을 불러온다.
			user = (User) query.uniqueResult();
		} catch (RuntimeException e) {
			e.printStackTrace();
		} finally {
			session.flush();
			session.close();
		}
		return user;
	}
	
	public User login(String userId, String passWd){
		System.out.println("userDaolm");
		User user = null;
		Transaction trns = null;
		Session session = HibernateUtil.getSessionFactory().openSession();
		try {
			trns = session.beginTransaction();
			String queryString = "from User where (userId = :id and userPasswd = :passWd)";
			Query query = session.createQuery(queryString);
			query.setString("id", userId);//id로 매칭 특정 행을 불러온다.
			query.setString("passWd", passWd);
			user = (User) query.uniqueResult();
		} catch (RuntimeException e) {
			e.printStackTrace();
		} finally {
			session.flush();
			session.close();
		}
		return user;
	}
	
}
