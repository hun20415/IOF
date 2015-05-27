package kr.ac.iof.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import kr.ac.iof.main.Service.CropCateService;
import kr.ac.iof.model.User;
import kr.ac.iof.model.UserGroup;
import kr.ac.iof.service.UserService;
import kr.ac.iof.service.UserGroupService;
import kr.ac.iof.util.HibernateUtil;

import org.hibernate.Session;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Handles requests for the application user page.
 */
@Controller
public class UserController {

	private static final Logger logger = LoggerFactory
			.getLogger(UserController.class);

	
	@Autowired
	private UserService userService;// 현재 에러 발생 수정 해야함
	@Autowired
	private UserGroupService userGroupService;// 현재 에러 발생 수정 해야함

	public void setUserService(UserService ps) {
		this.userService = ps;
	} 
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login() {
		logger.info("login");
		return "login";
	}

	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logout() {
		logger.info("logout");
		return "logout";
	}

	@RequestMapping(value = "/logoutResult", method = RequestMethod.GET)
	public String logoutResult() {
		logger.info("logoutResult");
		return "logoutResult";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(String id, String passwd, HttpSession session,
			HttpServletRequest request) throws Exception {
		logger.info("login");

		logger.info(id);
		logger.info(passwd);

		Session session1 = null;

		User user = new User();

		user = this.userService.login(id, passwd);
		request.getSession().setAttribute("user", user);

		return "home";
	}

	@RequestMapping(value = "/signUp", method = RequestMethod.GET)
	public String signUp(Model model) {
		logger.info("sigh up(회원 가입 양식 불러옴)");
		model.addAttribute("userGroup", new UserGroup());
		model.addAttribute("userGroupList", userGroupService.getAll());
		return "signUp";
	}

	@RequestMapping(value = "/notLoginUsers-menu", method = RequestMethod.GET)
	public String notLoginUsersmenu() {
		logger.info("notLoginUsersmenu");

		return "notLoginUsers-menu";

	}

	@RequestMapping(value = "/loginUsers-menu", method = RequestMethod.GET)
	public String loginUsersmenu() {
		logger.info("loginUsersmenu");

		return "loginUsers-menu";
	}

	@RequestMapping(value = "/welcome", method = RequestMethod.GET)
	public String welcome() {
		logger.info("welcome");

		return "welcome";

	}

	//회원정보 수정
	@RequestMapping(value = "/userInfo", method = RequestMethod.GET)
	public String userInfo(@RequestParam("id") String id, Model model) {

		model.addAttribute("user", this.userService.getById(id));
		
		return "userInfo";
	}

	@RequestMapping(value = "/signUp", method = { RequestMethod.POST })
	public String userAdd(@RequestParam("groupId") Integer groupId, @ModelAttribute("user") User user)
			throws Exception {

		this.userService.add(groupId ,user);

		return "redirect:/closeWindows";
	}
	@RequestMapping(value = "/closeWindows")
	public void closeWindows() throws Exception {

	}

	@RequestMapping(value = "/userList", method = RequestMethod.GET)
	public String userList(Model model) throws Exception {
		logger.info("user 리스트");
		// 리스트 출력
		model.addAttribute("user", new User());
		model.addAttribute("listUser", this.userService.getAll());
		// jsp 페이지에 model를 받아 리스트를 페이지로 뿌려준다.
		return "userList";
	}

	@RequestMapping("/userRemove/{id}")
	public String userDelete(@PathVariable("id") String id) {

		this.userService.delete(id);// id로 검색해서 삭제
		return "redirect:/userList";// list 페이지를 부르면서 새로고침
	}

	@RequestMapping(value = "/userModify", method = RequestMethod.POST)
	public String userModify(@RequestParam("groupId") Integer groupId, @ModelAttribute("user") User user)
			throws Exception {
		
		this.userService.update(groupId, user);
		return "redirect:/closeWindows";
	}
	@RequestMapping("/userModify")
	public String userModify(@RequestParam("id") String id, @RequestParam("groupId") Integer groupId, Model model) {
		
		model.addAttribute("user", this.userService.getById(id));
		model.addAttribute("groupId", new Integer(groupId));
		model.addAttribute("userGroup", new UserGroup());
		model.addAttribute("userGroupList", userGroupService.getAll());

		return "userModify";
	}

}
