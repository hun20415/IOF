/*********************************************************************************************************/
/*************************service 호출 및 각 jps를 호출하는 기능을 한다. 데이터를 jsp와 송 수신한다.(get, post)*****************/
/*************************service를 불러와서 각 페이지의 url 호출하는 기능을 한다. 데이터를 jsp와 송 수신한다.(get, post)*****************/
/*************************2015-05-06 박정훈 *****************************************************************/
/*********************************************************************************************************/

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
@Controller//어노테이션 선언은 필수이다. 
public class CropCateController {

	private static final Logger logger = LoggerFactory
			.getLogger(CropCateController.class);
	@Autowired
	/* @Qualifier(value="cropcateService") */
	private CropCateService cropcateService;//서비스 호출

	public void setCropCateService(CropCateService ps) {
		this.cropcateService = ps;
	}

	@RequestMapping(value = "/cropcateAdd", method = RequestMethod.GET)//서비스 호출
	public String cropcateAdd() throws Exception {
		logger.info("cropcate 입력 View");

		return "cropcateAdd";
	}

	@RequestMapping(value = "/cropcateAdd", method = RequestMethod.POST)//데이터를 받기위한 POST
	public String cropcateAdd(@ModelAttribute("cropcate") CropCate cropcate) throws Exception {
		//추가 입력된 데이터는 cropcate객체로 넘어온다.
		this.cropcateService.add(cropcate);
        
		return "redirect:/cropcateList";
	}
	
	

	@RequestMapping(value = "/cropcateList", method = RequestMethod.GET)
	public String cropcateList(Model model) throws Exception {
		logger.info("cropcate 리스트");
		//리스트 출력
		model.addAttribute("cropcate", new CropCate());
		model.addAttribute("listcrop", this.cropcateService.getAll());
		//jsp 페이지에 model를 받아 리스트를 페이지로 뿌려준다.
		return "cropcateList";
	}

	@RequestMapping("/remove/{id}")
	public String cropcateDelete(@PathVariable("id") int id) {

		this.cropcateService.delete(id);//id로 검색해서 삭제
		return "redirect:/cropcateList";//list 페이지를 부르면서 새로고침
	}
	
	@RequestMapping(value = "/cropcateModify", method = RequestMethod.POST)
	public String cropcateModify(@ModelAttribute("cropcate")CropCate cropcate) throws Exception {
		
		 this.cropcateService.update(cropcate);
       return "redirect:/cropcateList";
	}
	
	@RequestMapping("/{id}")
	public String cropcateModify(@PathVariable("id") int id, Model model) {
		model.addAttribute("cropcate", this.cropcateService.getById(id));
		model.addAttribute("listPersons", this.cropcateService.getAll());	
		
		return "cropcateModify";
	}

}
