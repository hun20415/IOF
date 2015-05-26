/**                                                                                 	           		**/
/**                                File Name   : UserGroupService.java                	               	**/  		
/**                                Description : userGroup에 대한 service controller에서 처리되어야 하는 
 * 								            	 기능은 이곳에 서 처리 (데이터 처리 포함)dao와 메소드의 이름이 같다			     	**/ 
/**                                Update      : 2015.05.07(박정훈)	                               		**/
/**                                ETC         :                    	                           		**/
/**                                                                     	                       		**/
package kr.ac.iof.service;

import java.util.List;

import kr.ac.iof.dao.UserGroupDao;
import kr.ac.iof.model.UserGroup;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(propagation = Propagation.SUPPORTS)  
public class UserGroupServiceIm implements UserGroupService{
	
	@Autowired
	private UserGroupDao userGroupDao ;
	 
    public void setUserGroupDao(UserGroupDao userGroupDao) {
        this.userGroupDao = userGroupDao;
    } 
 
    @Override
    @Transactional
    public void add(UserGroup p) {
    	System.out.println("addserviceimple");
        this.userGroupDao.add(p);
    }
 
    @Override
    @Transactional
    public void update(UserGroup p) {
        this.userGroupDao.update(p);
    }
 
    @Override
    @Transactional
    public List<UserGroup> getAll() {
    	System.out.println("userGroupServicelm");
        return this.userGroupDao.getAll();
    }
 
    @Override
    @Transactional
    public UserGroup getById(int id) {
        return this.userGroupDao.getById(id);
    }
 
    @Override
    @Transactional
    public void delete(int userGroupId) {
        this.userGroupDao.delete(userGroupId);
    }

}
