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
    public void add(int m_farmId, int m_eqTypeId, FarmEquipList p) {
    	System.out.println("addserviceimple");
        this.farmEquipListDao.add(m_farmId, m_eqTypeId, p);
    }
 
    @Override
    @Transactional
    public void update(int m_farmId, int m_eqTypeId, FarmEquipList p) {
        this.farmEquipListDao.update(m_farmId, m_eqTypeId, p);
    }
 
    @Override
    @Transactional
    public List<FarmEquipList> getAll() {
    	System.out.println("farmEquipListServicelm");
        return this.farmEquipListDao.getAll();
    }
    
    @Override
    @Transactional
    public List<FarmEquipList> getAll2(int farmId) {
    	System.out.println("farmEquipListServicelm2");
        return this.farmEquipListDao.getAll2(farmId);
    }
 
    @Override
    @Transactional
    public FarmEquipList getById(int m_farmId, int m_eqTypeId) {
        return this.farmEquipListDao.getById(m_farmId, m_eqTypeId);
    }
 
    @Override
    @Transactional
    public void delete(int m_farmId, int eqId) {
        this.farmEquipListDao.delete(m_farmId, eqId);
    }

    //songlock 2015-06-03
	@Override
	public List<FarmEquipList> getByFarmIdAndSectionId(int m_farmId, int farmSectionId) {
		// TODO Auto-generated method stub
		return this.farmEquipListDao.getByFarmIdAndSectionId(m_farmId, farmSectionId);
	}

	//songlock 2015-06-04
	@Override
	public FarmEquipList getById(int m_farmId, int farmSectionId, int eqId) {
		// TODO Auto-generated method stub
		return this.farmEquipListDao.getById(m_farmId, farmSectionId, eqId);
	}
}
