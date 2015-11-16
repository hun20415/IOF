/**                                                                                 	           		**/
/**                                File Name   : DsCategoryService.java                	               	**/  		
/**                                Description : dsCategory에 대한 service controller에서 처리되어야 하는 
 * 								            	 기능은 이곳에 서 처리 (데이터 처리 포함)dao와 메소드의 이름이 같다			     	**/ 
/**                                Update      : 2015.05.14(옥정윤)	                               		**/
/**                                ETC         :                    	                           		**/
/**                                                                     	                       		**/
package kr.ac.iof.main.Service.impl;

import java.util.List;



import kr.ac.iof.main.Service.DsCategoryService;
import kr.ac.iof.main.dao.DsCategoryDao;
import kr.ac.iof.model.Main.DsCategory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.annotation.Propagation;  

@Service
@Transactional(propagation = Propagation.SUPPORTS)  
public class DsCategoryServiceIm implements DsCategoryService{
	
	@Autowired
	private DsCategoryDao dsCategoryDao ;
	 
    public void setDsCategoryDao(DsCategoryDao dsCategoryDao) {
        this.dsCategoryDao = dsCategoryDao;
    }
 
    @Override
    @Transactional
    public void add(DsCategory p) {
    	System.out.println("addserviceimple");
        this.dsCategoryDao.add(p);
    }
 
    @Override
    @Transactional
    public void update(DsCategory p) {
        this.dsCategoryDao.update(p);
    }
 
    @Override
    @Transactional
    public List<DsCategory> getAll() {
    	System.out.println("dsCategoryServicelm");
        return this.dsCategoryDao.getAll();
    }
 
    @Override
    @Transactional
    public DsCategory getById(int id) {
        return this.dsCategoryDao.getById(id);
    }
 
    @Override
    @Transactional
    public void delete(int dsCategoryId) {
        this.dsCategoryDao.delete(dsCategoryId);
    }

}
