package kr.ac.iof.dao;

import java.util.Date;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import kr.ac.iof.model.User;

@Repository("userDao")
public class UserDAOImpl implements UserDAO {

	@Autowired
	private SessionFactory sessionFactory;

	public UserDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@SuppressWarnings("unchecked")
	public User findByUserID(String userid) {

		List<User> users = new ArrayList<User>();

		users = sessionFactory.getCurrentSession()
				.createQuery("from SYS_USER_INFO where USER_ID=?")
				.setParameter(0, userid).list();

		if (users.size() > 0) {
			return users.get(0);
		} else {
			return null;
		}

	}
	@Override
	@Transactional
	public List<User> list() {
		@SuppressWarnings("unchecked")
		List<User> list = (List<User>) sessionFactory.getCurrentSession()
				.createCriteria(User.class)
				.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		return list;
	}

	@Override
	public int insert(User user) {
		System.out.print("aa");
		return 0;
	}

	@Override
	public User login(String id, String passwd) {
		// TODO Auto-generated method stub
		return null;
	}

}
