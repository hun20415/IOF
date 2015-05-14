/**                                                                             				                **/
/**                                File Name   : HarvestInfoDao.java       	    		            		   	**/  		
/**                                Description : HarvestInfo Dao interface			                    			**/ 
/**                                Update      : 2015.05.14(옥정윤)                                				**/
/**                                ETC         :                                                                **/
/**					                                                                                            **/
package kr.ac.iof.main.dao;

import java.util.List;

import kr.ac.iof.model.Main.HarvestInfo;

public interface HarvestInfoDao {
	public void add(HarvestInfo harvestInfo);

	public void delete(int harvestInfoId);

	public void update(HarvestInfo harvestInfo);

	public List<HarvestInfo> getAll();

	public HarvestInfo getById(int harvestInfoId);
}
