/**                                                                                 	           **/
/**                                File Name   : FarmCultivateInfoDaoIm.java                	               **/  		
/**                                Description : farmCultivateInfo에 대한 Dao, 쿠리문 처리 		                   **/ 
/**                                Update      : 2015.05.14(옥정윤)                                  **/
/**                                ETC         :                    	                           **/
/**                                                                     	                       **/
package kr.ac.iof.main.dao;

import java.util.ArrayList;
import java.util.List;

import kr.ac.iof.model.User;
import kr.ac.iof.model.Main.CropSpeciesInfo;
import kr.ac.iof.model.Main.FarmCultivateInfo;
import kr.ac.iof.model.Main.FarmInfo;
import kr.ac.iof.util.HibernateUtil;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

@Repository("farmCultivateInfoDao")
public class FarmCultivateInfoDaoIm implements FarmCultivateInfoDao {
	private static final Logger logger = LoggerFactory.getLogger(FarmCultivateInfoDaoIm.class);

	//songlock: 2015-05-28
	@Override
	public void add(Integer m_farmId, String m_userId, Integer m_cropSpeciesId, FarmCultivateInfo farmCultivateInfo) {//insert
		Transaction trns = null;
		
		Session session = HibernateUtil.getSessionFactoryMain().openSession();//main db에 대한 session 호출
		
		try {
			trns = session.beginTransaction();
			
			FarmInfo farmInfo = (FarmInfo)session.load(FarmInfo.class, new Integer(m_farmId));
			User user = (User)session.load(User.class, new Integer(m_userId));
			CropSpeciesInfo cropSpeciesInfo = (CropSpeciesInfo)session.load(CropSpeciesInfo.class, new Integer(m_cropSpeciesId));
			farmCultivateInfo.setFarmInfo(farmInfo);
			farmCultivateInfo.setUser(user);
			farmCultivateInfo.setCropSpeciesInfo(cropSpeciesInfo);
			
			session.save(farmCultivateInfo);//farmCultivateInfo 객체를 저장(insert 쿼리문)
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
	public void delete(int farmCultivateInfoId) {
		System.out.println("farmCultivateInfoDaolm");
		Transaction trns = null;
		Session session = HibernateUtil.getSessionFactoryMain().openSession();
		try {
			trns = session.beginTransaction();
			FarmCultivateInfo farmCultivateInfo = (FarmCultivateInfo) session.load(FarmCultivateInfo.class,
					new Integer(farmCultivateInfoId));//id로 db에서 삭제해야 할 row을 불러온다.
			session.delete(farmCultivateInfo);//삭제 쿼리문 
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
	public void update(Integer m_farmId, String m_userId, Integer m_cropSpeciesId, FarmCultivateInfo farmCultivateInfo) {
		System.out.println("update");
		Transaction trns = null;
		Session session = HibernateUtil.getSessionFactoryMain().openSession();
		try {
			trns = session.beginTransaction();
			
			FarmInfo farmInfo = (FarmInfo)session.load(FarmInfo.class, new Integer(m_farmId));
			User user = (User)session.load(User.class, new Integer(m_userId));
			CropSpeciesInfo cropSpeciesInfo = (CropSpeciesInfo)session.load(CropSpeciesInfo.class, new Integer(m_cropSpeciesId));
			farmCultivateInfo.setFarmInfo(farmInfo);
			farmCultivateInfo.setUser(user);
			farmCultivateInfo.setCropSpeciesInfo(cropSpeciesInfo);
			
			session.update(farmCultivateInfo);//update 쿼리문
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
	public List<FarmCultivateInfo> getAll() { // 컬럼에 속해있는 모든 데이터를 불러온다.
		System.out.println("farmCultivateInfoDaolm");
		List<FarmCultivateInfo> farmCultivateInfos = new ArrayList<FarmCultivateInfo>();
		
		Transaction trns = null;
		
		Session session = HibernateUtil.getSessionFactoryMain().openSession();
		try {
			trns = session.beginTransaction();
			farmCultivateInfos = session.createQuery("from FarmCultivateInfo").list();//list로 호출
		} catch (RuntimeException e) {
			e.printStackTrace();
		} finally {
			session.flush();
			session.close();
		}
		return farmCultivateInfos;//리스트로 반환
	}

	@Override
	public FarmCultivateInfo getById(int farmCultivateInfoId) {
		System.out.println("farmCultivateInfoDaolm");
		FarmCultivateInfo farmCultivateInfo = null;
		Transaction trns = null;
		Session session = HibernateUtil.getSessionFactoryMain().openSession();
		try {
			trns = session.beginTransaction();
			String queryString = "from FarmCultivateInfo where tno = :id";
			Query query = session.createQuery(queryString);
			query.setInteger("id", farmCultivateInfoId);//id로 매칭 특정 행을 불러온다.
			farmCultivateInfo = (FarmCultivateInfo) query.uniqueResult();
		} catch (RuntimeException e) {
			e.printStackTrace();
		} finally {
			session.flush();
			session.close();
		}
		return farmCultivateInfo;
	}
	
}
