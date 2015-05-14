/**                                                                             				                **/
/**                                File Name   : FarmEquipTypeDao.java       	    		            		   	**/  		
/**                                Description : FarmEquipType Dao interface			                    			**/ 
/**                                Update      : 2015.05.14(옥정윤)                                				**/
/**                                ETC         :                                                                **/
/**					                                                                                            **/
package kr.ac.iof.main.dao;

import java.util.List;

import kr.ac.iof.model.Main.FarmEquipType;

public interface FarmEquipTypeDao {
	public void add(FarmEquipType farmEquipType);

	public void delete(int farmEquipTypeId);

	public void update(FarmEquipType farmEquipType);

	public List<FarmEquipType> getAll();

	public FarmEquipType getById(int farmEquipTypeId);
}
