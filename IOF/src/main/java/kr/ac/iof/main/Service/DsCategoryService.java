/**                                                                                 	           **/
/**                                File Name   : DsCategoryService.java                	               **/  		
/**                                Description : dsCategory에 대한 Dao, 쿠리문 처리 		                   **/ 
/**                                Update      : 2015.05.14(옥정윤)	                               **/
/**                                ETC         :                    	                           **/
/**                                                                     	                       **/
package kr.ac.iof.main.Service;

import java.util.List;

import kr.ac.iof.model.Main.DsCategory;
  
public interface DsCategoryService {
 
	public void add(DsCategory dsCategory);

	public void delete(int dsCategoryId);

	public void update(DsCategory dsCategory);

	public List<DsCategory> getAll();

	public DsCategory getById(int dsCategoryId);
     
}