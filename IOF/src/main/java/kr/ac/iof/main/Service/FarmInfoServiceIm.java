/**                                                                                 	           		**/
/**                                File Name   : FarmInfoService.java                	               	**/  		
/**                                Description : farmInfo에 대한 service controller에서 처리되어야 하는 
 * 								            	 기능은 이곳에 서 처리 (데이터 처리 포함)dao와 메소드의 이름이 같다			     	**/ 
/**                                Update      : 2015.05.14(옥정윤)	                               		**/
/**                                ETC         :                    	                           		**/
/**                                                                     	                       		**/
package kr.ac.iof.main.Service;

import java.util.List;







import kr.ac.iof.main.dao.FarmInfoDao;
import kr.ac.iof.model.Main.FarmInfo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.annotation.Propagation;  

@Service
@Transactional(propagation = Propagation.SUPPORTS)  
public class FarmInfoServiceIm implements FarmInfoService{
	
	@Autowired
	private FarmInfoDao farmInfoDao ;
	 
    public void setFarmInfoDao(FarmInfoDao farmInfoDao) {
        this.farmInfoDao = farmInfoDao;
    }
 
    @Override
    @Transactional
    public void add(String m_owner, String m_employee, FarmInfo p) {
    	System.out.println("addserviceimple");
        this.farmInfoDao.add(m_owner, m_employee, p);
    }
 
    @Override
    @Transactional
    public void update(String m_owner, String m_employee, FarmInfo p) {
        this.farmInfoDao.update(m_owner, m_employee, p);
    }
 
    @Override
    @Transactional
    public List<FarmInfo> getAll() {
    	System.out.println("farmInfoServicelm");
        return this.farmInfoDao.getAll();
    }
 
    @Override
    @Transactional
    public FarmInfo getById(int id) {
        return this.farmInfoDao.getById(id);
    }
 
    @Override
    @Transactional
    public void delete(int farmId) {
        this.farmInfoDao.delete(farmId);
    }
    @Override
    @Transactional
    public List<String> getAllId() { 
    	 return this.farmInfoDao.getAllId();
    }
}
