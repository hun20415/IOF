/**                                                                                 	           **/
/**                                File Name   : HarvestInfoService.java                	               **/  		
/**                                Description : harvestInfo에 대한 Dao, 쿠리문 처리 		                   **/ 
/**                                Update      : 2015.05.14(옥정윤)	                               **/
/**                                ETC         :                    	                           **/
/**                                                                     	                       **/
package kr.ac.iof.main.Service;

import java.util.List;

import kr.ac.iof.model.Main.HarvestInfo;
  
public interface HarvestInfoService {
 
	public void add(HarvestInfo harvestInfo);

	public void delete(int harvestInfoId);

	public void update(HarvestInfo harvestInfo);

	public List<HarvestInfo> getAll();

	public HarvestInfo getById(int harvestInfoId);
     
}