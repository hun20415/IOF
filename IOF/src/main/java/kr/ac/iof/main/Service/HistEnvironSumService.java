/**                                                                                 	           **/
/**                                File Name   : HistEnvironSumService.java                	               **/  		
/**                                Description : histEnvironSum에 대한 Dao, 쿠리문 처리 		                   **/ 
/**                                Update      : 2015.05.14(옥정윤)	                               **/
/**                                ETC         :                    	                           **/
/**                                                                     	                       **/
package kr.ac.iof.main.Service;

import java.util.List;

import kr.ac.iof.model.Main.HistEnvironSum;
  
public interface HistEnvironSumService {
 
	public void add(HistEnvironSum histEnvironSum);

	public void delete(int histEnvironSumId);

	public void update(HistEnvironSum histEnvironSum);

	public List<HistEnvironSum> getAll();

	public HistEnvironSum getById(int histEnvironSumId);
     
}