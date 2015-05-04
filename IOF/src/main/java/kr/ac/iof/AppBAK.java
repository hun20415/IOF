package kr.ac.iof;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import kr.ac.iof.main.Service.CropInfoService;
import kr.ac.iof.model.Main.CropCate;
import kr.ac.iof.model.Main.CropInfo;
import kr.ac.iof.util.HibernateUtil;
 
public class AppBAK {
	public static void main(String[] args) {
		
		SessionFactory sf = HibernateUtil.getSessionFactoryMain();
        Session session = sf.openSession();
        session.beginTransaction();
 
        CropCate department = new CropCate();
        department.setCropcateid(1);
        session.save(department);
         
        CropInfo emp1 = new CropInfo();
        emp1.setCrop_info_html("html");
        emp1.setCropname("name");
        emp1.setCropcate(department);
        
         
        session.save(emp1);
        
        session.getTransaction().commit();
        session.close();
        
        
		 
	}
}
