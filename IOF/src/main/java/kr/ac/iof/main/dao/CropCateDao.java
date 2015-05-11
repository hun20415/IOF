/**                                                                             				                **/
/**                                File Name   : CropCateDao.java       	    		            		   	**/  		
/**                                Description : CropCate Dao interface			                    			**/ 
/**                                Update      : 2015.05.07(박정훈)                                				**/
/**                                ETC         :                                                                **/
/**					                                                                                            **/
package kr.ac.iof.main.dao;

import java.util.List;

import kr.ac.iof.model.Main.CropCate;

public interface CropCateDao {
	public void add(CropCate cropCate);

	public void delete(int cropCateId);

	public void update(CropCate cropCate);

	public List<CropCate> getAll();

	public CropCate getById(int cropCateId);
}
