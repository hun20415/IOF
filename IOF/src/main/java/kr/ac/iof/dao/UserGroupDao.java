/**                                                                             				                **/
/**                                File Name   : UserGroupDao.java       	    		            		   	**/  		
/**                                Description : UserGroup Dao interface			                    			**/ 
/**                                Update      : 2015.05.07(박정훈)                                				**/
/**                                ETC         :                                                                **/
/**					                                                                                            **/
package kr.ac.iof.dao;

import java.util.List;

import kr.ac.iof.model.UserGroup;

public interface UserGroupDao {
	public void add(UserGroup userGroup);

	public void delete(int userGroupId);

	public void update(UserGroup userGroup);

	public List<UserGroup> getAll();

	public UserGroup getById(int userGroupId);
}
