package kr.ac.iof.controller ;

import java.text.DateFormat ;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import kr.ac.iof.DBUser;
import kr.ac.iof.action.user.UserService;
import kr.ac.iof.action.user.UserServiceImpl;
import kr.ac.iof.model.User;
import kr.ac.iof.model.UserGroup;
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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.beans.factory.annotation.Autowired;


/**
 * Handles requests for the application user page.
 */
@Controller
public class cultivationController  {
	
	private static final Logger logger = LoggerFactory.getLogger(cultivationController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */

	@RequestMapping(value = "/cultivationList", method = RequestMethod.GET)//서비스 호출
	public String cultivationList() throws Exception {
		logger.info("cultivationList");

		return "cultivationList";
	}
	
	@RequestMapping(value = "/cultivationAdd", method = RequestMethod.GET)//서비스 호출
	public String cultivationAdd() throws Exception {
		logger.info("cultivationAdd");

		return "cultivationAdd";
	}
	
	@RequestMapping(value = "/cultivationInfo", method = RequestMethod.GET)//서비스 호출
	public String cultivationInfo() throws Exception {
		logger.info("cultivationInfo");

		return "cultivationInfo";
	} 
	
}
