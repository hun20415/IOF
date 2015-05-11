package kr.ac.iof;

import java.util.Date;
import java.util.List;

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
        
        CropCate cat = new CropCate();
        
        List<CropCate> cropcateList = session.createQuery("from CropCate").list();
        for(CropCate p : cropcateList){
        	if(p.getCropCateId() == 1){
        		System.out.println(p.getCropCateName());
        		cat = p;
        		break;
        	}
        }
       
        
        	
        CropInfo emp1 = new CropInfo();
        emp1.setCropInfoHtml("html");
        emp1.setCropName("name");
        emp1.setCropCate(cat);
        
         
        session.save(emp1);
        
        session.getTransaction().commit();
        session.close();
        
        
		 
	}
}
