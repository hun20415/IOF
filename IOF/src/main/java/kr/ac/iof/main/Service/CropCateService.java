/**                                                                                 	           **/
/**                                File Name   : CropCateService.java                	               **/  		
/**                                Description : cropCate에 대한 Dao, 쿠리문 처리 		                   **/ 
/**                                Update      : 2015.05.07(박정훈)	                               **/
/**                                ETC         :                    	                           **/
/**                                                                     	                       **/
package kr.ac.iof.main.Service;

import java.util.List;

import kr.ac.iof.model.Main.CropCate;
  
public interface CropCateService {
 
	public void add(CropCate cropCate);

	public void delete(int cropCateid);

	public void update(CropCate cropCate);

	public List<CropCate> getAll();

	public CropCate getById(int cropCateid);
     
}