/**                                                                                 	           **/
/**                                File Name   : FarmEquipListService.java                	               **/  		
/**                                Description : farmEquipList에 대한 Dao, 쿠리문 처리 		                   **/ 
/**                                Update      : 2015.05.14(옥정윤)	                               **/
/**                                ETC         :                    	                           **/
/**                                                                     	                       **/
package kr.ac.iof.main.Service;

import java.util.List;

import kr.ac.iof.model.Main.FarmEquipList;
  
public interface FarmEquipListService {
 
	public void add(FarmEquipList farmEquipList);

	public void delete(int farmEquipListId);

	public void update(FarmEquipList farmEquipList);

	public List<FarmEquipList> getAll();

	public FarmEquipList getById(int farmEquipListId);
     
}