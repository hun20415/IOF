/**                                                                                 	           **/
/**                                File Name   : HistWaterService.java                	               **/  		
/**                                Description : histWater에 대한 Dao, 쿠리문 처리 		                   **/ 
/**                                Update      : 2015.05.14(옥정윤)	                               **/
/**                                ETC         :                    	                           **/
/**                                                                     	                       **/
package kr.ac.iof.main.Service;

import java.util.List;

import kr.ac.iof.model.Main.HistWater;
  
public interface HistWaterService {
 
	public void add(HistWater histWater);

	public void delete(int farmId, int seqNo);

	public void update(HistWater histWater);

	public List<HistWater> getAll();

	public HistWater getById(int farmId, int seqNo);
     
}