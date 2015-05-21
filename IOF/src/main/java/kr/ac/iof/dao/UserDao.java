/**                                                                             				                **/
/**                                File Name   : UserDao.java       	    		            		   	**/  		
/**                                Description : User Dao interface			                    			**/ 
/**                                Update      : 2015.05.07(박정훈)                                				**/
/**                                ETC         :                                                                **/
/**					                                                                                            **/
package kr.ac.iof.dao;

import java.util.List;

import kr.ac.iof.model.User;

public interface UserDao {
	public void add(int userGroupId, User user);

	public void delete(String userId);

	public void update(User user);

	public List<User> getAll();

	public User getById(String userId);
	
	public User login(String userId, String passWd);
}
