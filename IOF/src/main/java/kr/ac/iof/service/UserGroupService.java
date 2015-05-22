/**                                                                                 	           **/
/**                                File Name   : UserGroupService.java                	               **/  		
/**                                Description : userGroup에 대한 Dao, 쿠리문 처리 		                   **/ 
/**                                Update      : 2015.05.07(박정훈)	                               **/
/**                                ETC         :                    	                           **/
/**                                                                     	                       **/
package kr.ac.iof.service;

import java.util.List;

import kr.ac.iof.model.UserGroup;
  
public interface UserGroupService {
 
	public void add(UserGroup userGroup);

	public void delete(int userGroupId);

	public void update(UserGroup userGroup);

	public List<UserGroup> getAll();

	public UserGroup getById(int userGroupId);
     
}