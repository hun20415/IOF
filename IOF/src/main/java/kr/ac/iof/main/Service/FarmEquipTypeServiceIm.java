/**                                                                                 	           		**/
/**                                File Name   : FarmEquipTypeService.java                	               	**/  		
/**                                Description : farmEquipType에 대한 service controller에서 처리되어야 하는 
 * 								            	 기능은 이곳에 서 처리 (데이터 처리 포함)dao와 메소드의 이름이 같다			     	**/ 
/**                                Update      : 2015.05.14(옥정윤)	                               		**/
/**                                ETC         :                    	                           		**/
/**                                                                     	                       		**/
package kr.ac.iof.main.Service;

import java.util.List;


import kr.ac.iof.main.dao.FarmEquipTypeDao;
import kr.ac.iof.model.Main.FarmEquipType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.annotation.Propagation;  

@Service
@Transactional(propagation = Propagation.SUPPORTS)  
public class FarmEquipTypeServiceIm implements FarmEquipTypeService{
	
	@Autowired
	private FarmEquipTypeDao farmEquipTypeDao ;
	 
    public void setFarmEquipTypeDao(FarmEquipTypeDao farmEquipTypeDao) {
        this.farmEquipTypeDao = farmEquipTypeDao;
    }
 
    @Override
    @Transactional
    public void add(FarmEquipType p) {
    	System.out.println("addserviceimple");
        this.farmEquipTypeDao.add(p);
    }
 
    @Override
    @Transactional
    public void update(FarmEquipType p) {
        this.farmEquipTypeDao.update(p);
    }
 
    @Override
    @Transactional
    public List<FarmEquipType> getAll() {
    	System.out.println("farmEquipTypeServicelm");
        return this.farmEquipTypeDao.getAll();
    }
 
    @Override
    @Transactional
    public FarmEquipType getById(int id) {
        return this.farmEquipTypeDao.getById(id);
    }
 
    @Override
    @Transactional
    public void delete(int farmEquipTypeId) {
        this.farmEquipTypeDao.delete(farmEquipTypeId);
    }

}
