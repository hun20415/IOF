/**                                                                                 	           		**/
/**                                File Name   : HarvestShipmentService.java                	               	**/  		
/**                                Description : harvestShipment에 대한 service controller에서 처리되어야 하는 
 * 								            	 기능은 이곳에 서 처리 (데이터 처리 포함)dao와 메소드의 이름이 같다			     	**/ 
/**                                Update      : 2015.05.14(옥정윤)	                               		**/
/**                                ETC         :                    	                           		**/
/**                                                                     	                       		**/
package kr.ac.iof.main.Service;

import java.util.List;


import kr.ac.iof.main.dao.HarvestShipmentDao;
import kr.ac.iof.model.Main.HarvestShipment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.annotation.Propagation;  

@Service
@Transactional(propagation = Propagation.SUPPORTS)  
public class HarvestShipmentServiceIm implements HarvestShipmentService{
	
	@Autowired
	private HarvestShipmentDao harvestShipmentDao ;
	 
    public void setHarvestShipmentDao(HarvestShipmentDao harvestShipmentDao) {
        this.harvestShipmentDao = harvestShipmentDao;
    }
 
    @Override
    @Transactional
    public void add(HarvestShipment p) {
    	System.out.println("addserviceimple");
        this.harvestShipmentDao.add(p);
    }
 
    @Override
    @Transactional
    public void update(HarvestShipment p) {
        this.harvestShipmentDao.update(p);
    }
 
    @Override
    @Transactional
    public List<HarvestShipment> getAll() {
    	System.out.println("harvestShipmentServicelm");
        return this.harvestShipmentDao.getAll();
    }
 
    @Override
    @Transactional
    public HarvestShipment getById(int id) {
        return this.harvestShipmentDao.getById(id);
    }
 
    @Override
    @Transactional
    public void delete(int harvestShipmentId) {
        this.harvestShipmentDao.delete(harvestShipmentId);
    }

}
