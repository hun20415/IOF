/**                                                                             				                **/
/**                                File Name   : FarmSectionInfoController.java       	                		         **/
/**                                Description : FarmSectionInfo CRUD page crontroller                        			**/
/**                                Update      : 2015.05.20(옥정윤)                                				**/
/**                                ETC         : service 호출 및 각 jps를 호출하는 기능을 한다. 데이터를 jsp와 송 수신한다.(get, post)     **/


package kr.ac.iof.controller ;

import kr.ac.iof.main.Service.FarmSectionInfoService;
import kr.ac.iof.model.Main.FarmSectionInfo;

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
public class FarmSectionInfoController  {
	
	private static final Logger logger = LoggerFactory.getLogger(FarmSectionInfoController.class);
	@Autowired
	/* @Qualifier(value="farmSectionInfoService") */
	private FarmSectionInfoService farmSectionInfoService;// 서비스 호출

	public void setFarmSectionInfoService(FarmSectionInfoService ps) {
		this.farmSectionInfoService = ps;
	}

	@RequestMapping(value = "/farmSectionInfoAdd", method = RequestMethod.GET)
	// 서비스 호출
	public String farmSectionInfoAdd() throws Exception {
		logger.info("farmSectionInfo 입력 View");

		return "farmSectionInfoAdd";
	}

	@RequestMapping(value = "/farmSectionInfoAdd", method = { RequestMethod.POST })
	// 데이터를 받기위한 POST
	public String farmSectionInfoAdd(@ModelAttribute("farmSectionInfo") FarmSectionInfo farmSectionInfo)
			throws Exception {
		// 추가 입력된 데이터는 farmSectionInfo객체로 넘어온다.

		
		System.out.println(farmSectionInfo.getFarmSectionId()); // 	FarmInfo에서 getBuildDate());
		this.farmSectionInfoService.add(farmSectionInfo);
		

		return "redirect:/farmSectionInfoList";
	}

	@RequestMapping(value = "/farmSectionInfoList", method = RequestMethod.GET)
	public String farmSectionInfoList(Model model) throws Exception {
		logger.info("farmSectionInfo 리스트");
		// 리스트 출력
		model.addAttribute("farmSectionInfo", new FarmSectionInfo());
		model.addAttribute("listFarmSectionInfo", this.farmSectionInfoService.getAll());
		// jsp 페이지에 model를 받아 리스트를 페이지로 뿌려준다.
		return "farmSectionInfoList";
	}

	@RequestMapping("/farmSectionInfoRemove/{id}")
	public String farmSectionInfoDelete(@PathVariable("id") int id) {

		this.farmSectionInfoService.delete(id);// id로 검색해서 삭제
		return "redirect:/farmSectionInfoList";// list 페이지를 부르면서 새로고침
	}

	/*
	 * @RequestMapping("/farmSectionInfoModify/{id}") public String
	 * farmSectionInfoModify(@PathVariable("id") int id, Model model) {
	 * model.addAttribute("farmSectionInfo", this.farmSectionInfoService.getById(id));
	 * model.addAttribute("listPersons", this.farmSectionInfoService.getAll()); return
	 * "forward:/farmSectionInfoAdd"; }
	 */
	@RequestMapping(value = "/farmSectionInfoModify", method = RequestMethod.POST)
	public String buyerSectionInfoModify(@ModelAttribute("farmSectionInfo") FarmSectionInfo farmSectionInfo)
			throws Exception {

		this.farmSectionInfoService.update(farmSectionInfo);
		return "redirect:/farmSectionInfoList";
	}

	@RequestMapping("/farmSectionInfoModify")
	public String farmSectionInfoModify(@RequestParam("id") int id, Model model) {

		model.addAttribute("farmSectionInfo", this.farmSectionInfoService.getById(id));
		//model.addAttribute("listPersons", this.farmSectionInfoService.getAll());

		return "farmSectionInfoModify";
	}
	
	
	 
	
}
