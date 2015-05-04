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
	public void addCropCate(CropCate cropcate) {
		Transaction trns = null;
		
		Session session = HibernateUtil.getSessionFactoryMain().openSession();
		try {
			trns = session.beginTransaction();
			session.save(cropcate);
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
	public void deleteUser(int cropcateid) {
		System.out.println("cripcateDaolm");
		Transaction trns = null;
		Session session = HibernateUtil.getSessionFactoryMain().openSession();
		try {
			trns = session.beginTransaction();
			CropCate cropcate = (CropCate) session.load(CropCate.class,
					new Integer(cropcateid));
			session.delete(cropcate);
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
	public void updateUser(CropCate cropcate) {
		System.out.println("update");
		Transaction trns = null;
		Session session = HibernateUtil.getSessionFactoryMain().openSession();
		try {
			trns = session.beginTransaction();
			session.update(cropcate);
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
	public List<CropCate> getAllUsers() {
		System.out.println("cripcateDaolm");
		List<CropCate> cropcates = new ArrayList<CropCate>();
		
		Transaction trns = null;
		
		Session session = HibernateUtil.getSessionFactoryMain().openSession();
		try {
			trns = session.beginTransaction();
			cropcates = session.createQuery("from CropCate").list();
		} catch (RuntimeException e) {
			e.printStackTrace();
		} finally {
			session.flush();
			session.close();
		}
		return cropcates;
	}

	@Override
	public CropCate getUserById(int cropcateid) {
		System.out.println("cripcateDaolm");
		CropCate cropcate = null;
		Transaction trns = null;
		Session session = HibernateUtil.getSessionFactoryMain().openSession();
		try {
			trns = session.beginTransaction();
			String queryString = "from CropCate where cropcateid = :id";
			Query query = session.createQuery(queryString);
			query.setInteger("id", cropcateid);
			cropcate = (CropCate) query.uniqueResult();
		} catch (RuntimeException e) {
			e.printStackTrace();
		} finally {
			session.flush();
			session.close();
		}
		return cropcate;
	}

	
	/*private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sf) {
		this.sessionFactory = sf;
	}*/
/*
	 @Override
	    public void addCropCate(CropCate cropcate){
	        Session session = this.sessionFactory.getCurrentSession();
	        session.persist(cropcate);
	        logger.info("CropCate saved successfully, CropCate Details="+cropcate);
	    }
	 
	    @Override
	    public void updateUser(CropCate p) {
	        Session session = this.sessionFactory.getCurrentSession();
	        session.update(p);
	        logger.info("CropCate updated successfully, CropCate Details="+p);
	    }
	 
	    @SuppressWarnings("unchecked")
	    @Override
	    public List<CropCate> getAllUsers() {
	        Session session = this.sessionFactory.getCurrentSession();
	        List<CropCate> personsList = session.createQuery("from Person").list();
	        for(CropCate p : personsList){
	            logger.info("Person List::"+p);
	        }
	        return personsList;
	    }
	 
	    @Override
	    public CropCate getUserById(int id) {
	        Session session = this.sessionFactory.getCurrentSession();      
	        CropCate p = (CropCate) session.load(CropCate.class, new Integer(id));
	        logger.info("Person loaded successfully, Person details="+p);
	        return p;
	    }
	 
	    @Override
	    public void deleteUser(int id) {
	        Session session = this.sessionFactory.getCurrentSession();
	        CropCate p = (CropCate) session.load(CropCate.class, new Integer(id));
	        if(null != p){
	            session.delete(p);
	        }
	        logger.info("Person deleted successfully, person details="+p);
	    }*/
	
	
	
}
