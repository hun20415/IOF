/**                                                                                 	           		**/
/**                                File Name   : FarmSectionInfoService.java                	               	**/  		
/**                                Description : farmSectionInfo에 대한 service controller에서 처리되어야 하는 
 * 								            	 기능은 이곳에 서 처리 (데이터 처리 포함)dao와 메소드의 이름이 같다			     	**/ 
/**                                Update      : 2015.05.14(옥정윤)	                               		**/
/**                                ETC         :                    	                           		**/
/**                                                                     	                       		**/
package kr.ac.iof.main.Service;

import java.util.List;


import kr.ac.iof.main.dao.FarmSectionInfoDao;
import kr.ac.iof.model.Main.FarmSectionInfo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.annotation.Propagation;  

@Service
@Transactional(propagation = Propagation.SUPPORTS)  
public class FarmSectionInfoServiceIm implements FarmSectionInfoService{
	
	@Autowired
	private FarmSectionInfoDao farmSectionInfoDao ;
	 
    public void setFarmSectionInfoDao(FarmSectionInfoDao farmSectionInfoDao) {
        this.farmSectionInfoDao = farmSectionInfoDao;
    }
 
    @Override
    @Transactional
    public void add(FarmSectionInfo p) {
    	System.out.println("addserviceimple");
        this.farmSectionInfoDao.add(p);
    }
 
    @Override
    @Transactional
    public void update(FarmSectionInfo p) {
        this.farmSectionInfoDao.update(p);
    }
 
    @Override
    @Transactional
    public List<FarmSectionInfo> getAll() {
    	System.out.println("farmSectionInfoServicelm");
        return this.farmSectionInfoDao.getAll();
    }
 
    @Override
    @Transactional
    public FarmSectionInfo getById(int id) {
        return this.farmSectionInfoDao.getById(id);
    }
 
    @Override
    @Transactional
    public void delete(int farmSectionInfoId) {
        this.farmSectionInfoDao.delete(farmSectionInfoId);
    }

}
