package kr.ac.iof.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import kr.ac.iof.main.Service.CropCateService;
import kr.ac.iof.main.Service.FarmInfoService;
import kr.ac.iof.model.User;
import kr.ac.iof.model.UserGroup;
import kr.ac.iof.model.Main.FarmEquipType;
import kr.ac.iof.model.Main.FarmSectionInfo;
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
public class TestController {

	private static final Logger logger = LoggerFactory.getLogger(TestController.class);
	
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public String welcome() {
		logger.info("test");

		return "test";

	}
	@RequestMapping(value = "/gT", method = RequestMethod.GET)
	public String gT() {
		logger.info("gt");

		return "gT";

	}
}
