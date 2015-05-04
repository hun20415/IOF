package kr.ac.iof.controller;

import java.text.DateFormat;
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
import kr.ac.iof.main.Service.CropCateService;
import kr.ac.iof.main.dao.CropCateDaoIm;
import kr.ac.iof.model.User;
import kr.ac.iof.model.UserGroup;
import kr.ac.iof.model.Main.CropCate;
import kr.ac.iof.util.HibernateUtil;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * Handles requests for the application user page.
 */
@Controller
public class CropController {

	private static final Logger logger = LoggerFactory
			.getLogger(CropController.class);
	@Autowired
	/* @Qualifier(value="cropcateService") */
	private CropCateService cropcateService;// 이거 나중에 service로 바꿔줘야 한다.

	public void setCropCateService(CropCateService ps) {
		this.cropcateService = ps;
	}

	@RequestMapping(value = "/cropcateC", method = RequestMethod.GET)
	public String cropcateC() throws Exception {
		logger.info("cropcate 입력 View");

		return "cropcateC";
	}

	@RequestMapping(value = "/cropcateC", method = RequestMethod.POST)
	public String cropcateC(@ModelAttribute("cropcate") CropCate cropcate) throws Exception {
		logger.info("cropcate 입력  C ");
		this.cropcateService.addCropCate(cropcate);
        
		return "redirect:/cropcateR";
	}
	
	@RequestMapping(value = "/cropcateM", method = RequestMethod.POST)
	public String cropcateM(@ModelAttribute("cropcate")CropCate cropcate) throws Exception {
		logger.info("cropcate 입력  M ");
		 this.cropcateService.updateUser(cropcate);
       return "redirect:/cropcateR";
	}

	@RequestMapping(value = "/cropcateR", method = RequestMethod.GET)
	public String cropcateR(Model model) throws Exception {
		logger.info("cropcate 리스트");

		model.addAttribute("cropcate", new CropCate());
		model.addAttribute("listcrop", this.cropcateService.getAllUsers());

		return "cropcateR";
	}

	@RequestMapping("/remove/{id}")
	public String removePerson(@PathVariable("id") int id) {

		this.cropcateService.deleteUser(id);
		return "redirect:/cropcateR";
	}

	@RequestMapping("/{id}")
	public String editcrop(@PathVariable("id") int id, Model model) {
		model.addAttribute("cropcate", this.cropcateService.getUserById(id));
		model.addAttribute("listPersons", this.cropcateService.getAllUsers());	
		
		return "cropcateM";
	}

}
