/**                                                                                 	           		**/
/**                                File Name   : BuyerInfoService.java                	               	**/  		
/**                                Description : buyerInfo에 대한 service controller에서 처리되어야 하는 
 * 								            	 기능은 이곳에 서 처리 (데이터 처리 포함)dao와 메소드의 이름이 같다			     	**/ 
/**                                Update      : 2015.05.07(박정훈)	                               		**/
/**                                ETC         :                    	                           		**/
/**                                                                     	                       		**/
package kr.ac.iof.main.Service;

import java.util.List;





import kr.ac.iof.main.dao.BuyerInfoDao;
import kr.ac.iof.main.dao.FarmSectionInfoDao;
import kr.ac.iof.main.dao.GreentomDao;
import kr.ac.iof.model.Main.BuyerInfo;
import kr.ac.iof.model.Main.Greentom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.annotation.Propagation;  

@Service
@Transactional(propagation = Propagation.SUPPORTS)  
public class GreentomServiceIm implements GreentomService{
	
	@Autowired
	private GreentomDao greentomDao ;
	
    @Override
    @Transactional
    public List<Greentom> getAll() {
    	System.out.println("greentomServicelm");
        return this.greentomDao.getAll();
    }
 

}
