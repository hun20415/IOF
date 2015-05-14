/**                                                                             				                **/
/**                                File Name   : DsCategoryDao.java       	    		            		   	**/  		
/**                                Description : DsCategory Dao interface			                    			**/ 
/**                                Update      : 2015.05.14(옥정윤)                                				**/
/**                                ETC         :                                                                **/
/**					                                                                                            **/
package kr.ac.iof.main.dao;

import java.util.List;

import kr.ac.iof.model.Main.DsCategory;

public interface DsCategoryDao {
	public void add(DsCategory dsCategory);

	public void delete(int dsCategoryId);

	public void update(DsCategory dsCategory);

	public List<DsCategory> getAll();

	public DsCategory getById(int dsCategoryId);
}
