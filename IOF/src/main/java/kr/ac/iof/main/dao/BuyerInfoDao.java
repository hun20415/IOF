/**                                                                             				                **/
/**                                File Name   : BuyerInfoDao.java       	    		            		   	**/  		
/**                                Description : BuyerInfo Dao interface			                    			**/ 
/**                                Update      : 2015.05.07(박정훈)                                				**/
/**                                ETC         :                                                                **/
/**					                                                                                            **/
package kr.ac.iof.main.dao;

import java.util.List;

import kr.ac.iof.model.Main.BuyerInfo;

public interface BuyerInfoDao {
	public void add(BuyerInfo buyerInfo);

	public void delete(int buyerInfoId);

	public void update(BuyerInfo buyerInfo);

	public List<BuyerInfo> getAll();

	public BuyerInfo getById(int buyerInfoId);
}
