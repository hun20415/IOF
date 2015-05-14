/**                                                                                 	           **/
/**                                File Name   : FarmEquipTypeService.java                	               **/  		
/**                                Description : farmEquipType에 대한 Dao, 쿠리문 처리 		                   **/ 
/**                                Update      : 2015.05.14(옥정윤)	                               **/
/**                                ETC         :                    	                           **/
/**                                                                     	                       **/
package kr.ac.iof.main.Service;

import java.util.List;

import kr.ac.iof.model.Main.FarmEquipType;
  
public interface FarmEquipTypeService {
 
	public void add(FarmEquipType farmEquipType);

	public void delete(int farmEquipTypeId);

	public void update(FarmEquipType farmEquipType);

	public List<FarmEquipType> getAll();

	public FarmEquipType getById(int farmEquipTypeId);
     
}