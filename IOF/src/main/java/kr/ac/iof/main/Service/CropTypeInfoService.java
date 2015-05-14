/**                                                                                 	           **/
/**                                File Name   : CropTypeInfoService.java                	               **/  		
/**                                Description : cropTypeInfo에 대한 Dao, 쿠리문 처리 		                   **/ 
/**                                Update      : 2015.05.14(옥정윤)	                               **/
/**                                ETC         :                    	                           **/
/**                                                                     	                       **/
package kr.ac.iof.main.Service;

import java.util.List;

import kr.ac.iof.model.Main.CropTypeInfo;
  
public interface CropTypeInfoService {
 
	public void add(CropTypeInfo cropTypeInfo);

	public void delete(int cropTypeInfoId);

	public void update(CropTypeInfo cropTypeInfo);

	public List<CropTypeInfo> getAll();

	public CropTypeInfo getById(int cropTypeInfoId);
     
}