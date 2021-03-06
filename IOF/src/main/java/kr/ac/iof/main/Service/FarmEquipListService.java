/**                                                                                 	           **/
/**                                File Name   : FarmEquipListService.java                	               **/  		
/**                                Description : farmEquipList에 대한 Dao, 쿠리문 처리 		                   **/ 
/**                                Update      : 2015.05.14(옥정윤)	                               **/
/**                                ETC         :                    	                           **/
/**                                                                     	                       **/
package kr.ac.iof.main.Service;

import java.util.List;

import kr.ac.iof.model.Main.FarmEquipList;
import kr.ac.iof.model.Main.FarmInfo;
  
public interface FarmEquipListService {
 
	public void add(int m_farmId, int m_eqTypeId, FarmEquipList farmEquipList);

	public void delete(int m_farmId, int eqId); // m_farmId, int m_eqTypeId);

	public void update(int m_farmId, int m_eqTypeId, FarmEquipList farmEquipList);

	public List<FarmEquipList> getAll();

	public FarmEquipList getById(int m_farmId, int m_eqTypeId);
		
	//songlock 2015-06-04
	public FarmEquipList getById(int m_farmId, int farmSectionId, int eqId);
	
	//songlock 2015-06-03
	public List<FarmEquipList> getByFarmIdAndSectionId(int m_farmId, int farmSectionId);
	
	
	public List<FarmEquipList> getAll2(int farmId);
	
	
}