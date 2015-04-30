package kr.ac.iof.controller;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import kr.ac.iof.DBUser;
import kr.ac.iof.action.user.UserService;
import kr.ac.iof.action.user.UserServiceImpl;
import kr.ac.iof.model.User;
import kr.ac.iof.util.HibernateUtil;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.beans.factory.annotation.Autowired;


/**
 * Handles requests for the application user page.
 */
@Controller
public class UserController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	//@Resource(name="userService") 
	//@Autowired
	private UserService userService;//현재 에러 발생 수정 해야함
	
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login() {
		logger.info("login");		
		return "login";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(String id, String passwd, HttpSession session) throws Exception {
		logger.info("login");	
		
		logger.info(id);
		logger.info(passwd);
		Session session1 = null;
		
		//userService.login(id, passwd);
		
		/*List<User> loginUser = new ArrayList<User>();
		
		String hql = "SELECT USER_ID, USER_PASSWD FROM SYS_USER_INFO where USER_ID=? and USER_PASSWD=?";
		session1 = HibernateUtil.getSessionFactory().openSession();
		Query query = session1.createQuery(hql);
		query.setParameter(0, id);
		query.setParameter(0, passwd);
		
		loginUser =  (User) query.list();*/
		List<User> users = new ArrayList<User>();
		 
		users = HibernateUtil.getCurrentSession()
			.createQuery("from User where userid=?")
			.setParameter(0, id)
			.list();
		session.setAttribute("user", users);
		logger.info("finish?");
		
		return "main";		
	}
	@RequestMapping(value = "/signUp", method = RequestMethod.GET)
	public String signUp(){
		logger.info("sigh up(회원 가입 양식 불러옴)");
		return "signUp";
	}
	
	@RequestMapping(value = "/signUp", method = RequestMethod.POST)
	public String signUp(User user) throws Exception{
		logger.info("sigh up(회원 정보 입력)");
		
		//userService.insert(user);
		/*test code*/
		Session session = null;
		
		
		try {
	        // 세션 열기
			session = HibernateUtil.getSessionFactory().openSession();
			 
			session.beginTransaction();
			session.save(user);
			session.getTransaction().commit();
	    } 
	    catch (HibernateException e) {
	        e.printStackTrace();
	    } 
	    finally {
	        // 세션 닫기
	        HibernateUtil.closeSession();
	    }
		/*test code finish*/
		
		return "welcome";
	}
	
	@RequestMapping(value = "/notLoginUsers-menu", method = RequestMethod.GET)
	public String notLoginUsersmenu(){
		logger.info("notLoginUsersmenu");
		
		
		return "notLoginUsers-menu";
		
	}
	@RequestMapping(value = "/loginUsers-menu", method = RequestMethod.GET)
	public String loginUsersmenu(){
		logger.info("loginUsersmenu");
		
		
		
		return "loginUsers-menu";	
	}
	@RequestMapping(value = "/welcome", method = RequestMethod.GET)
	public String welcome(){
		logger.info("welcome");
		
		return "welcome";
		
	}
	
	
}
