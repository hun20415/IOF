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

	public void delete(int m_farmId, int m_eqTypeId);

	public void update(int m_farmId, int m_eqTypeId, FarmEquipList farmEquipList);

	public List<FarmEquipList> getAll(int m_farmId);

	public FarmEquipList getById(int m_farmId, int m_eqTypeId);
	
}