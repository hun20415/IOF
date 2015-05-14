/**                                                                                 	           **/
/**                                File Name   : DsInfoService.java                	               **/  		
/**                                Description : dsInfo에 대한 Dao, 쿠리문 처리 		                   **/ 
/**                                Update      : 2015.05.14(옥정윤)	                               **/
/**                                ETC         :                    	                           **/
/**                                                                     	                       **/
package kr.ac.iof.main.Service;

import java.util.List;

import kr.ac.iof.model.Main.DsInfo;
  
public interface DsInfoService {
 
	public void add(DsInfo dsInfo);

	public void delete(int dsInfoId);

	public void update(DsInfo dsInfo);

	public List<DsInfo> getAll();

	public DsInfo getById(int dsInfoId);
     
}