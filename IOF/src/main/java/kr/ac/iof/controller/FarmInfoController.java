package kr.ac.iof.controller ;

import kr.ac.iof.main.Service.FarmInfoService;
import kr.ac.iof.model.User;
import kr.ac.iof.model.Main.FarmInfo;
import kr.ac.iof.service.UserService;
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
public class FarmInfoController  {
	
	private static final Logger logger = LoggerFactory.getLogger(FarmInfoController.class);
	@Autowired
	/* @Qualifier(value="farmInfoService") */
	private FarmInfoService farmInfoService;// 서비스 호출
	@Autowired
	private UserService userService;// 서비스 호출

	public void setFarmInfoService(FarmInfoService ps) {
		this.farmInfoService = ps;
	}

	/*@RequestMapping(value = "/farmInfoAdd", method = RequestMethod.GET)
	// 서비스 호출
	public String farmInfoAdd(Model model) throws Exception {
		logger.info("farmInfo 입력 View");
		
		model.addAttribute("id", new String());
		model.addAttribute("bb", new String());
		model.addAttribute("farmAllId", this.farmInfoService.getAllId());
		
		return "farmInfoAdd";
	}*/
	@RequestMapping(value = "/farmInfoAdd", method = RequestMethod.GET)
	// 서비스 호출
	public String farmInfoAdd(Model model) throws Exception {
		logger.info("farmInfo 입력 View");
		
		model.addAttribute("id", new String());
		model.addAttribute("bb", new String());
		model.addAttribute("farmAllId", this.farmInfoService.getAllId());
		
		return "farmInfoAdd";
	}

	@RequestMapping(value = "/farmInfoAdd", method = { RequestMethod.POST })
	// 데이터를 받기위한 POST
	public String farmInfoAdd(@ModelAttribute("farmInfo") FarmInfo farmInfo)
	//public String farmInfoAdd(@RequestParam("ownerListId") Integer ownerListId, @ModelAttribute("farmInfo") FarmInfo farmInfo)
			throws Exception {		
		System.out.println("aaaa" + farmInfo.getBuildDate());
		this.farmInfoService.add(farmInfo);
		
		
		//.add(ownerListId, farmInfo);		

		return "redirect:/farmInfoList";
	}

	@RequestMapping(value = "/farmInfoList", method = RequestMethod.GET)
	public String farmInfoList(Model model) throws Exception {
		logger.info("farmInfo 리스트");
		// 리스트 출력
		model.addAttribute("farmInfo", new FarmInfo());
		model.addAttribute("listFarmInfo", this.farmInfoService.getAll());
		// jsp 페이지에 model를 받아 리스트를 페이지로 뿌려준다.
		return "farmInfoList";
	}

	@RequestMapping("/farmInfoRemove/{id}")
	public String farmInfoDelete(@PathVariable("id") int id) {

		this.farmInfoService.delete(id);// id로 검색해서 삭제
		return "redirect:/farmInfoList";// list 페이지를 부르면서 새로고침
	}

	/*
	 * @RequestMapping("/farmInfoModify/{id}") public String
	 * farmInfoModify(@PathVariable("id") int id, Model model) {
	 * model.addAttribute("farmInfo", this.farmInfoService.getById(id));
	 * model.addAttribute("listPersons", this.farmInfoService.getAll()); return
	 * "forward:/farmInfoAdd"; }
	 */
	@RequestMapping(value = "/farmInfoModify", method = RequestMethod.POST)
	//public String buyerInfoModify(@ModelAttribute("farmInfo") FarmInfo farmInfo)
	public String farmInfoModify(@ModelAttribute("farmInfo") FarmInfo farmInfo)
			throws Exception {

		this.farmInfoService.update(farmInfo);
		return "redirect:/farmInfoList";
	}

	@RequestMapping("/farmInfoModify")
	public String farmInfoModify(@RequestParam("id") int id, Model model) {

		
		model.addAttribute("farmInfo", this.farmInfoService.getById(id));//우리가 선택한 farm에 대한 정보
		
		model.addAttribute("user", new User());//우리가 불러올 데이터를 전체 데이터를 읽어올 farm 정보 저장 #A
		model.addAttribute("userAll", this.userService.getAll());

		return "farmInfoModify";
	}
	
	@RequestMapping(value = "/farmInfoInfo", method = RequestMethod.POST)
	public String FarmInfoInfo(@ModelAttribute("farmInfo") FarmInfo farmInfo)
			throws Exception {

		this.farmInfoService.update(farmInfo);
		return "redirect:/farmInfoList";
	}

	@RequestMapping("/farmInfoInfo")
	public String farmInfoInfo(@RequestParam("id") int id, Model model) {

		
		model.addAttribute("farmInfo", this.farmInfoService.getById(id));//우리가 선택한 farm에 대한 정보
		
		model.addAttribute("user", new User());//우리가 불러올 데이터를 전체 데이터를 읽어올 farm 정보 저장 #A
		model.addAttribute("userAll", this.userService.getAll());

		return "farmInfoInfo";
	}
	
	/*@RequestMapping(value = "/userInfo", method = RequestMethod.GET)
	public String userInfo(Model model) throws Exception {
		logger.info("farmInfo 리스트");
		// 리스트 출력
		model.addAttribute("farmInfo", new FarmInfo());
		model.addAttribute("listFarmInfo", this.farmInfoService.getAll());
		// jsp 페이지에 model를 받아 리스트를 페이지로 뿌려준다.
		return "farmInfoList";
	} */
	
}
