/**                                                                             				                **/
/**                                File Name   :CropTypeInfoDao.java       	    		            		   	**/  		
/**                                Description :CropTypeInfo Dao interface			                    			**/ 
/**                                Update      : 2015.05.14(옥정윤)                                				**/
/**                                ETC         :                                                                **/
/**					                                                                                            **/
package kr.ac.iof.main.dao;

import java.util.List;

import kr.ac.iof.model.Main.CropTypeInfo;

public interface CropTypeInfoDao {
	public void add(CropTypeInfo cropTypeInfo);

	public void delete(int cropTypeInfoId);

	public void update(CropTypeInfo cropTypeInfo);

	public List<CropTypeInfo> getAll();

	public CropTypeInfo getById(int cropTypeInfoId);
}
