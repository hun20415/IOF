package kr.ac.iof.action.user;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import kr.ac.iof.model.User;


public interface UserService {
	
	public int insert(User user);
	
	public User login(String id, String passwd);
	
	public int modify(User user);
	
	public void changePasswd(User user);
	
	public void bye(User user);

	public List<User> getAllUsers();
	
	public User getUserByid(String id);
	
	public List<User> getUsersByKeyword(String keyword);
	
}
