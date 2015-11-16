/**                                                                                 	           		**/
/**                                File Name   : HarvestInfoService.java                	               	**/  		
/**                                Description : harvestInfo에 대한 service controller에서 처리되어야 하는 
 * 								            	 기능은 이곳에 서 처리 (데이터 처리 포함)dao와 메소드의 이름이 같다			     	**/ 
/**                                Update      : 2015.05.14(옥정윤)                               		**/
/**                                ETC         :                    	                           		**/
/**                                                                     	                       		**/
package kr.ac.iof.main.Service.impl;

import java.util.List;



import kr.ac.iof.main.Service.HarvestInfoService;
import kr.ac.iof.main.dao.HarvestInfoDao;
import kr.ac.iof.model.Main.HarvestInfo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.annotation.Propagation;  

@Service
@Transactional(propagation = Propagation.SUPPORTS)  
public class HarvestInfoServiceIm implements HarvestInfoService{
	
	@Autowired
	private HarvestInfoDao harvestInfoDao ;
	 
    public void setHarvestInfoDao(HarvestInfoDao harvestInfoDao) {
        this.harvestInfoDao = harvestInfoDao;
    }
 
    @Override
    @Transactional
    public void add(HarvestInfo p) {
    	System.out.println("addserviceimple");
        this.harvestInfoDao.add(p);
    }
 
    @Override
    @Transactional
    public void update(HarvestInfo p) {
        this.harvestInfoDao.update(p);
    }
 
    @Override
    @Transactional
    public List<HarvestInfo> getAll() {
    	System.out.println("harvestInfoServicelm");
        return this.harvestInfoDao.getAll();
    }
 
    @Override
    @Transactional
    public HarvestInfo getById(int id) {
        return this.harvestInfoDao.getById(id);
    }
 
    @Override
    @Transactional
    public void delete(int harvestInfoId) {
        this.harvestInfoDao.delete(harvestInfoId);
    }

}
