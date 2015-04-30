package kr.ac.iof;

import java.util.Date;
import org.hibernate.Session;
import kr.ac.iof.util.HibernateUtil;
import kr.ac.iof.DBUser;
 
public class AppBAK {
	public static void main(String[] args) {
		System.out.println("Maven + Hibernate + Oracle");
		Session session = HibernateUtil.getSessionFactory().openSession();
		System.out.println("222");
		session.beginTransaction();
		DBUser user = new DBUser();
 
		user.setUserId(121);
		user.setUsername("superman");
		user.setCreatedBy("system");
		user.setCreatedDate(new Date());
 
		session.save(user);
		session.getTransaction().commit();
	}
}
