/**                                                                                 	           		**/
/**                                File Name   : FarmEquipListService.java                	               	**/  		
/**                                Description : farmEquipList에 대한 service controller에서 처리되어야 하는 
 * 								            	 기능은 이곳에 서 처리 (데이터 처리 포함)dao와 메소드의 이름이 같다			     	**/ 
/**                                Update      : 2015.05.14(옥정윤)	                               		**/
/**                                ETC         :                    	                           		**/
/**                                                                     	                       		**/
package kr.ac.iof.main.Service;

import java.util.List;



import kr.ac.iof.main.dao.FarmEquipListDao;
import kr.ac.iof.model.Main.FarmEquipList;
import kr.ac.iof.model.Main.FarmInfo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.annotation.Propagation;  

@Service
@Transactional(propagation = Propagation.SUPPORTS)  
public class FarmEquipListServiceIm implements FarmEquipListService{
	
	@Autowired
	private FarmEquipListDao farmEquipListDao ;
	 
    public void setFarmEquipListDao(FarmEquipListDao farmEquipListDao) {
        this.farmEquipListDao = farmEquipListDao;
    }
 
    @Override
    @Transactional
    public void add(FarmEquipList p) {
    	System.out.println("addserviceimple");
        this.farmEquipListDao.add(p);
    }
 
    @Override
    @Transactional
    public void update(FarmEquipList p) {
        this.farmEquipListDao.update(p);
    }
 
    @Override
    @Transactional
    public List<FarmEquipList> getAll() {
    	System.out.println("farmEquipListServicelm");
        return this.farmEquipListDao.getAll();
    }
 
    @Override
    @Transactional
    public FarmEquipList getById(int farmId, int eqId) {
        return this.farmEquipListDao.getById(farmId, eqId);
    }
 
    @Override
    @Transactional
    public void delete(int farmId, int eqId) {
        this.farmEquipListDao.delete(farmId, eqId);
    }

}
