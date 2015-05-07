/**                                                                                 	           		**/
/**                                File Name   : CropCateService.java                	               	**/  		
/**                                Description : cropcate에 대한 service controller에서 처리되어야 하는 
 * 								            	 기능은 이곳에 서 처리 (데이터 처리 포함)dao와 메소드의 이름이 같다			     	**/ 
/**                                Update      : 2015.05.07(박정훈)	                               		**/
/**                                ETC         :                    	                           		**/
/**                                                                     	                       		**/
package kr.ac.iof.main.Service;

import java.util.List;


import kr.ac.iof.main.dao.CropCateDao;
import kr.ac.iof.model.Main.CropCate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.annotation.Propagation;  

@Service
@Transactional(propagation = Propagation.SUPPORTS)  
public class CropCateServiceIm implements CropCateService{
	
	@Autowired
	private CropCateDao cropcateDao ;
	 
    public void setCropCateDao(CropCateDao cropcateDao) {
        this.cropcateDao = cropcateDao;
    }
 
    @Override
    @Transactional
    public void add(CropCate p) {
    	System.out.println("addserviceimple");
        this.cropcateDao.add(p);
    }
 
    @Override
    @Transactional
    public void update(CropCate p) {
        this.cropcateDao.update(p);
    }
 
    @Override
    @Transactional
    public List<CropCate> getAll() {
    	System.out.println("cripcateServicelm");
        return this.cropcateDao.getAll();
    }
 
    @Override
    @Transactional
    public CropCate getById(int id) {
        return this.cropcateDao.getById(id);
    }
 
    @Override
    @Transactional
    public void delete(int cropcateid) {
        this.cropcateDao.delete(cropcateid);
    }

}
