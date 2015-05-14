/**                                                                                 	           **/
/**                                File Name   : FarmSectionInfoService.java                	               **/  		
/**                                Description : farmSectionInfo에 대한 Dao, 쿠리문 처리 		                   **/ 
/**                                Update      : 2015.05.14(옥정윤)	                               **/
/**                                ETC         :                    	                           **/
/**                                                                     	                       **/
package kr.ac.iof.main.Service;

import java.util.List;

import kr.ac.iof.model.Main.FarmSectionInfo;
  
public interface FarmSectionInfoService {
 
	public void add(FarmSectionInfo farmSectionInfo);

	public void delete(int farmSectionInfoId);

	public void update(FarmSectionInfo farmSectionInfo);

	public List<FarmSectionInfo> getAll();

	public FarmSectionInfo getById(int farmSectionInfoId);
     
}