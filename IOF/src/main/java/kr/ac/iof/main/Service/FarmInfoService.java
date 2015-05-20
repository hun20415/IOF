/**                                                                                 	           **/
/**                                File Name   : FarmInfoService.java                	               **/  		
/**                                Description : farmInfo에 대한 Dao, 쿠리문 처리 		                   **/ 
/**                                Update      : 2015.05.14(옥정윤)	                               **/
/**                                ETC         :                    	                           **/
/**                                                                     	                       **/
package kr.ac.iof.main.Service;

import java.util.List;

import kr.ac.iof.model.Main.FarmInfo;
  
public interface FarmInfoService {
 
	public void add(FarmInfo farmInfo);

	public void delete(int farmInfoId);

	public void update(FarmInfo farmInfo);

	public List<FarmInfo> getAll();

	public FarmInfo getById(int farmInfoId);
	public List<String> getAllId() ;
}