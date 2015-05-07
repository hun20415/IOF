/**                                                                             				                **/
/**                                File Name   : CropInfoDao.java       	    		            		   	**/  		
/**                                Description : CropInfo Dao interface			                    			**/ 
/**                                Update      : 2015.05.07(박정훈)                                				**/
/**                                ETC         :                                                                **/
/**					                                                                                            **/
package kr.ac.iof.main.dao;

import java.util.List;

import kr.ac.iof.model.Main.CropInfo;

public interface CropInfoDao {
	public void add(CropInfo cropInfo);

	public void delete(int cropId);

	public void update(CropInfo cropInfo);

	public List<CropInfo> getAll();

	public CropInfo getById(int cropId);
}
