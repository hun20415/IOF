/*********************************************************************************************************/
/*************************cropcate에 대한 Dao, 쿠리문 처리 *********************************************************/
/*************************2015-05-06 박정훈 *****************************************************************/
/*********************************************************************************************************/
package kr.ac.iof.main.dao;

import java.util.ArrayList;
import java.util.List;

import kr.ac.iof.model.Main.CropCate;
import kr.ac.iof.util.HibernateUtil;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

@Repository("cropcateDao")
public class CropCateDaoIm implements CropCateDao {
	private static final Logger logger = LoggerFactory
			.getLogger(CropCateDaoIm.class);

	
	@Override
	public void add(CropCate cropcate) {//insert
		Transaction trns = null;
		
		Session session = HibernateUtil.getSessionFactoryMain().openSession();//main db에 대한 session 호출
		
		try {
			trns = session.beginTransaction();
			session.save(cropcate);//cropcate 객체를 저장(insert 쿼리문)
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
	public void delete(int cropcateid) {
		System.out.println("cripcateDaolm");
		Transaction trns = null;
		Session session = HibernateUtil.getSessionFactoryMain().openSession();
		try {
			trns = session.beginTransaction();
			CropCate cropcate = (CropCate) session.load(CropCate.class,
					new Integer(cropcateid));//id로 db에서 삭제해야 할 row을 불러온다.
			session.delete(cropcate);//삭제 쿼리문 
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
	public void update(CropCate cropcate) {
		System.out.println("update");
		Transaction trns = null;
		Session session = HibernateUtil.getSessionFactoryMain().openSession();
		try {
			trns = session.beginTransaction();
			session.update(cropcate);//update 쿼리문
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
	public List<CropCate> getAll() { // 컬럼에 속해있는 모든 데이터를 불러온다.
		System.out.println("cripcateDaolm");
		List<CropCate> cropcates = new ArrayList<CropCate>();
		
		Transaction trns = null;
		
		Session session = HibernateUtil.getSessionFactoryMain().openSession();
		try {
			trns = session.beginTransaction();
			cropcates = session.createQuery("from CropCate").list();//list로 호출
		} catch (RuntimeException e) {
			e.printStackTrace();
		} finally {
			session.flush();
			session.close();
		}
		return cropcates;//리스트로 반환
	}

	@Override
	public CropCate getById(int cropcateid) {
		System.out.println("cripcateDaolm");
		CropCate cropcate = null;
		Transaction trns = null;
		Session session = HibernateUtil.getSessionFactoryMain().openSession();
		try {
			trns = session.beginTransaction();
			String queryString = "from CropCate where cropcateid = :id";
			Query query = session.createQuery(queryString);
			query.setInteger("id", cropcateid);//id로 매칭 특정 행을 불러온다.
			cropcate = (CropCate) query.uniqueResult();
		} catch (RuntimeException e) {
			e.printStackTrace();
		} finally {
			session.flush();
			session.close();
		}
		return cropcate;
	}
	
}
