/**                                                                                             **/
/**                                File Name   : UserServiceIm.java                               **/  		
/**                                Description : userservice implement	                         **/ 
/**                                Update      : 2015.05.07(박정훈)                                **/
/**                                ETC         :                                                **/
/**                                                                                             **/
package kr.ac.iof.action.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;






/*
 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.security.core.GrantedAuthority;
 import org.springframework.security.core.authority.SimpleGrantedAuthority;
 import org.springframework.security.core.userdetails.User;
 import org.springframework.security.core.userdetails.UserDetails;
 import org.springframework.security.core.userdetails.UserDetailsService;
 import org.springframework.security.core.userdetails.UsernameNotFoundException;
 import org.springframework.stereotype.Service;
 import org.springframework.transaction.annotation.Transactional;
 */
import kr.ac.iof.dao.UserDAO;
import kr.ac.iof.model.User;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDAO userDao;
	
	@Override
	public int insert(User user) {
		//회원 정보 입력
		return userDao.insert(user);
		
	}

	@Override
	public User login(String id, String passwd) {
		// TODO Auto-generated method stub
		return userDao.login(id, passwd);
	}

	@Override
	public int modify(User user) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void changePasswd(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void bye(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getUserByid(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getUsersByKeyword(String keyword) {
		// TODO Auto-generated method stub
		return null;
	}// implements
		


}
