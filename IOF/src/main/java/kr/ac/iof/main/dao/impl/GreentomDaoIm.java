/**                                                                                 	           **/
/**                                File Name   : GreentomDaoIm.java                	               **/  		
/**                                Description : Greentom에 대한 Dao, 쿠리문 처리 		                   **/ 
/**                                Update      : 2015.05.07(박정훈)	                               **/
/**                                ETC         :                    	                           **/
/**                                                                     	                       **/
package kr.ac.iof.main.dao.impl;

import java.util.ArrayList;
import java.util.List;

import kr.ac.iof.main.dao.GreentomDao;
import kr.ac.iof.model.Main.Greentom;
import kr.ac.iof.util.HibernateUtil;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

@Repository("greentomDao")
public class GreentomDaoIm implements GreentomDao {
	private static final Logger logger = LoggerFactory.getLogger(GreentomDaoIm.class);

	
	@Override
	public List<Greentom> getAll() { // 컬럼에 속해있는 모든 데이터를 불러온다.
		System.out.println("greentomsDaolm");
		List<Greentom> greentoms = new ArrayList<Greentom>();
		
		Transaction trns = null;
		
		Session session = HibernateUtil.getSessionFactoryMain().openSession();
		try {
			trns = session.beginTransaction();
			greentoms = session.createQuery("from Greentom").list();//list로 호출
		} catch (RuntimeException e) {
			e.printStackTrace();
		} finally {
			session.flush();
			session.close();
		}
		return greentoms;//리스트로 반환
	}

}
