/**                                                                             				                **/
/**                                File Name   : FarmEquipListDao.java       	    		            		   	**/  		
/**                                Description : FarmEquipList Dao interface			                    			**/ 
/**                                Update      : 2015.05.14(옥정윤)                                				**/
/**                                ETC         :                                                                **/
/**					                                                                                            **/
package kr.ac.iof.main.dao;

import java.util.List;

import kr.ac.iof.model.Main.FarmEquipList;
import kr.ac.iof.model.Main.FarmInfo;

public interface FarmEquipListDao {
	public void add(int m_farmId, int m_eqTypeId, FarmEquipList farmEquipList);

	public void delete(int m_farmId, int eqId);

	public void update(int m_farmId, int m_eqTypeId, FarmEquipList farmEquipList);
	
	public List<FarmEquipList> getAll();

	public FarmEquipList getById(int m_farmId, int m_eqTypeId);
	
	public FarmEquipList getById(int m_farmId, int farmSectionId, int eqId);
	
	//songlock 2015-06-03
	public List<FarmEquipList> getByFarmIdAndSectionId(int m_farmId, int farmSectionId);

	public List<FarmEquipList> getAll2(int farmId);
}
