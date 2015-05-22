/**                                                                                 	           		**/
/**                                File Name   : UserService.java                	               	**/  		
/**                                Description : user에 대한 service controller에서 처리되어야 하는 
 * 								            	 기능은 이곳에 서 처리 (데이터 처리 포함)dao와 메소드의 이름이 같다			     	**/ 
/**                                Update      : 2015.05.07(박정훈)	                               		**/
/**                                ETC         :                    	                           		**/
/**                                                                     	                       		**/
package kr.ac.iof.service;

import java.util.List;



import kr.ac.iof.dao.UserDao;
import kr.ac.iof.model.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.annotation.Propagation;  

@Service
@Transactional(propagation = Propagation.SUPPORTS)  
public class UserServiceIm implements UserService{
	
	@Autowired
	private UserDao userDao ;
	 
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
 
    @Override
    @Transactional
    public void add(int userGroupId, User p) {
    	System.out.println("addserviceimple");
        this.userDao.add(userGroupId, p);
    }
 
    @Override
    @Transactional
    public void update(int userGroupId, User p) {
        this.userDao.update(userGroupId, p);
    }
 
    @Override
    @Transactional
    public List<User> getAll() {
    	System.out.println("userServicelm");
        return this.userDao.getAll();
    }
 
    @Override
    @Transactional
    public User getById(String id) {
        return this.userDao.getById(id);
    }
 
    @Override
    @Transactional
    public void delete(String userId) {
        this.userDao.delete(userId);
    }
    @Override
    @Transactional
    public User login(String userId, String passWd){
    	 return this.userDao.login(userId, passWd);
    }
}
