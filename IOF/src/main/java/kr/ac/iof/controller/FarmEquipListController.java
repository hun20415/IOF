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
import kr.ac.iof.main.Service.FarmEquipListService;
import kr.ac.iof.main.Service.FarmEquipTypeService;
import kr.ac.iof.main.Service.FarmInfoService;
import kr.ac.iof.model.User;
import kr.ac.iof.model.Main.FarmEquipList;
import kr.ac.iof.model.Main.FarmEquipType;
import kr.ac.iof.model.Main.FarmInfo;
import kr.ac.iof.service.UserService;
import kr.ac.iof.util.HibernateUtil;

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


/**
 * Handles requests for the application user page.
 */
@Controller
public class FarmEquipListController  {
	
	private static final Logger logger = LoggerFactory.getLogger(FarmEquipListController.class);
	@Autowired
	/* @Qualifier(value="farmEquipListService") */
	private FarmEquipListService farmEquipListService;// 서비스 호출
	@Autowired
	private FarmInfoService farmInfoService; //songlock: 2015-06-01 farmId, farmNamed을 위하여
	private FarmEquipTypeService farmEquipTypeService; //songlock: 2015-06-01 farmEquipTypeID를 위하여

	public void setFarmEquipListService(FarmEquipListService ps) {
		this.farmEquipListService = ps;
	}

	//songlock: 2015-06-01
	@RequestMapping(value = "/farmEquipListAdd", method = RequestMethod.GET)
	// 서비스 호출
	public String farmEquipListAdd(Model model) throws Exception {
		logger.info("farmEquipList 입력 View");

		model.addAttribute("farmInfo", new FarmInfo());
		model.addAttribute("farmInfoList", farmInfoService.getAll());
		model.addAttribute("farmEquipType", new FarmEquipType());
		model.addAttribute("farmEquipTypeList", farmEquipTypeService.getAll());
		return "farmEquipListAdd";
	}
	
	@RequestMapping(value = "/farmEquipListInfo", method = RequestMethod.GET)
	// 서비스 호출
	public String farmEquipListInfo() throws Exception {
		logger.info("farmEquipInfo View");

		
		return "farmEquipListInfo";
	}  

	//songlock: 2015-06-01
	@RequestMapping(value = "/farmEquipListAdd", method = { RequestMethod.POST })
	// 데이터를 받기위한 POST
	public String farmEquipListAdd(@RequestParam("m_farmId") Integer m_farmId, @RequestParam("m_eqTypeId") Integer m_eqTypeId, @ModelAttribute("farmEquipList") FarmEquipList farmEquipList)
			throws Exception {
		// 추가 입력된 데이터는 farmEquipList객체로 넘어온다.

		
		this.farmEquipListService.add(m_farmId, m_eqTypeId, farmEquipList);

		return "redirect:/farmEquipListList";
	}

	//songlock: 2015-06-01
	@RequestMapping(value = "/farmEquipListList", method = RequestMethod.GET)
	public String farmEquipListList(Model model) throws Exception {
		logger.info("farmEquipList 리스트");
		// 리스트 출력
		//model.addAttribute("farmEquipList", new FarmEquipList());
		//model.addAttribute("listFarmEquipList", this.farmEquipListService.getAll());
		// jsp 페이지에 model를 받아 리스트를 페이지로 뿌려준다.
		
		model.addAttribute("farmInfo", new FarmInfo());
		model.addAttribute("listFarmInfo", this.farmInfoService.getAll());
		
		model.addAttribute("farmEquipType", new FarmEquipType());
		model.addAttribute("listfarmEquipType", this.farmEquipTypeService.getAll());
		return "farmEquipListList";
	}
		
	//songlock: 2015-06-01
	@RequestMapping(value = "/farmEquipListModify", method = RequestMethod.GET)
	public String farmEquipListModify(@RequestParam("m_farmId") Integer m_farmId, @RequestParam("m_eqTypeId") Integer m_eqTypeId, Model model) throws Exception {
		logger.info("farmEquipListModify 리스트");
		// 리스트 출력
		model.addAttribute("farmEquipList", this.farmEquipListService.getById(m_farmId, m_eqTypeId));
		model.addAttribute("m_farmId", new Integer(m_farmId));
		model.addAttribute("m_eqTypeId", new Integer(m_eqTypeId));
		
		model.addAttribute("farmInfo", new FarmInfo());
		model.addAttribute("farmInfoAll", this.farmInfoService.getAll());
		
		// jsp 페이지에 model를 받아 리스트를 페이지로 뿌려준다.
		return "farmEquipListModify";
	}

	//songlock: 2015-06-01
	@RequestMapping("/farmEquipListModify")
	public String farmEquipListModify(@RequestParam("m_farmId") int m_farmId, @RequestParam("m_eqTypeId") int m_eqTypeId, 
			@ModelAttribute("farmEquipList") FarmEquipList farmEquipList, Model model) {

		this.farmEquipListService.update(m_farmId, m_eqTypeId, farmEquipList);
		return "farmEquipListModify";
	}
	
	@RequestMapping("/farmEquipListRemove/{id}")
	public String farmEquipListDelete(@RequestParam("m_farmId") int m_farmId, @RequestParam("m_eqTypeId") int m_eqTypeId) {

		this.farmEquipListService.delete(m_farmId, m_eqTypeId);// id로 검색해서 삭제
		return "redirect:/farmEquipListList";// list 페이지를 부르면서 새로고침
	}

	/*
	 * @RequestMapping("/farmEquipListModify/{id}") public String
	 * farmEquipListModify(@PathVariable("id") int id, Model model) {
	 * model.addAttribute("farmEquipList", this.farmEquipListService.getById(id));
	 * model.addAttribute("listPersons", this.farmEquipListService.getAll()); return
	 * "forward:/farmEquipListAdd"; }
	 */
	/*
	@RequestMapping(value = "/farmEquipListModify", method = RequestMethod.POST)
	public String buyerInfoModify(@ModelAttribute("farmEquipList") FarmEquipList farmEquipList)
			throws Exception {

		this.farmEquipListService.update(farmEquipList);
		return "redirect:/farmEquipListList";
	}
	*/
}
