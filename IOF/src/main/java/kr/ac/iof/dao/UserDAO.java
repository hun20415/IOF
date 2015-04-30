package kr.ac.iof.dao;

import java.util.List;

import kr.ac.iof.model.User;

public interface UserDAO {
	User findByUserID(String userid);
	int insert(User user);
	User login(String id, String passwd);
	//요건 한번 확인해 보아ㅑ 할듯 시포요
	List<User> list();
}
