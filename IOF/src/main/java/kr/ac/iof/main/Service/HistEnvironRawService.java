/**                                                                                 	           **/
/**                                File Name   : HistEnvironRawService.java                	               **/  		
/**                                Description : histEnvironRaw에 대한 Dao, 쿠리문 처리 		                   **/ 
/**                                Update      : 2015.05.14(옥정윤)	                               **/
/**                                ETC         :                    	                           **/
/**                                                                     	                       **/
package kr.ac.iof.main.Service;

import java.util.List;

import kr.ac.iof.model.Main.HistEnvironRaw;
  
public interface HistEnvironRawService {
 
	public void add(HistEnvironRaw histEnvironRaw);

	public void delete(int histEnvironRawId);

	public void update(HistEnvironRaw histEnvironRaw);

	public List<HistEnvironRaw> getAll();

	public HistEnvironRaw getById(int histEnvironRawId);
	
	public List<HistEnvironRaw> getSelectEq(String farmId, String sectionId, String eqId);
     
}