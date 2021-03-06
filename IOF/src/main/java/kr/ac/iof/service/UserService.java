/**                                                                                 	           **/
/**                                File Name   : UserService.java                	               **/  		
/**                                Description : user에 대한 Dao, 쿠리문 처리 		                   **/ 
/**                                Update      : 2015.05.07(박정훈)	                               **/
/**                                ETC         :                    	                           **/
/**                                                                     	                       **/
package kr.ac.iof.service;

import java.util.List;

import kr.ac.iof.model.User;
  
public interface UserService {
 
	public void add(int m_userGroupId, User user);

	public void delete(String userId);

	public void update(int m_userGroupId, User user);

	public List<User> getAll();

	public User getById(String userId);
	
	public User login(String userId, String passWd);
     
}