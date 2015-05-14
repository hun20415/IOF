/**                                                                                 	           **/
/**                                File Name   : BuyerInfoService.java                	               **/  		
/**                                Description : buyerInfo에 대한 Dao, 쿠리문 처리 		                   **/ 
/**                                Update      : 2015.05.07(박정훈)	                               **/
/**                                ETC         :                    	                           **/
/**                                                                     	                       **/
package kr.ac.iof.main.Service;

import java.util.List;

import kr.ac.iof.model.Main.BuyerInfo;
  
public interface FarmInfoService {
 
	public void add(BuyerInfo buyerInfo);

	public void delete(int buyerInfoId);

	public void update(BuyerInfo buyerInfo);

	public List<BuyerInfo> getAll();

	public BuyerInfo getById(int buyerInfoId);
     
}