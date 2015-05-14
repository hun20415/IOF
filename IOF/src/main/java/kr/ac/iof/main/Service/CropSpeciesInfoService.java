/**                                                                                 	           **/
/**                                File Name   : CropSpeciesInfoService.java                	               **/  		
/**                                Description : CropSpeciesInfo에 대한 Dao, 쿠리문 처리 		                   **/ 
/**                                Update      : 2015.05.14 (옥정윤)	                               **/
/**                                ETC         :                    	                           **/
/**                                                                     	                       **/
package kr.ac.iof.main.Service;

import java.util.List;

import kr.ac.iof.model.Main.CropSpeciesInfo;
  
public interface CropSpeciesInfoService {
 
	public void add(CropSpeciesInfo cropSpeciesInfo);

	public void delete(int cropSpeciesInfoId);

	public void update(CropSpeciesInfo cropSpeciesInfo);

	public List<CropSpeciesInfo> getAll();

	public CropSpeciesInfo getById(int cropSpeciesInfoId);
     
}