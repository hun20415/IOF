/**                                                                             				                **/
/**                                File Name   : FarmEquipListDao.java       	    		            		   	**/  		
/**                                Description : FarmEquipList Dao interface			                    			**/ 
/**                                Update      : 2015.05.14(옥정윤)                                				**/
/**                                ETC         :                                                                **/
/**					                                                                                            **/
package kr.ac.iof.main.dao;

import java.util.List;

import kr.ac.iof.model.Main.FarmEquipList;

public interface FarmEquipListDao {
	public void add(FarmEquipList farmEquipList);

	public void delete(int farmId, int eqId);

	public void update(FarmEquipList farmEquipList);

	public List<FarmEquipList> getAll();

	public FarmEquipList getById(int farmId, int eqId);
}
