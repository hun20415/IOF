package kr.ac.iof.controller ;

import kr.ac.iof.main.Service.FarmCultivateInfoService;
import kr.ac.iof.model.Main.FarmCultivateInfo;

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
public class FarmCultivateInfoController  {
	
	private static final Logger logger = LoggerFactory
			.getLogger(FarmCultivateInfoController.class);
	@Autowired
	/* @Qualifier(value="farmCultivateInfoService") */
	private FarmCultivateInfoService farmCultivateInfoService;// 서비스 호출

	public void setFarmCultivateInfoService(FarmCultivateInfoService ps) {
		this.farmCultivateInfoService = ps;
	}

	@RequestMapping(value = "/farmCultivateInfoAdd", method = RequestMethod.GET)
	// 서비스 호출
	public String farmCultivateInfoAdd() throws Exception {
		logger.info("farmCultivateInfo 입력 View");

		return "farmCultivateInfoAdd";
	}

	@RequestMapping(value = "/farmCultivateInfoAdd", method = { RequestMethod.POST })
	// 데이터를 받기위한 POST
	public String farmCultivateInfoAdd(@ModelAttribute("farmCultivateInfo") FarmCultivateInfo farmCultivateInfo)
			throws Exception {
		// 추가 입력된 데이터는 farmCultivateInfo객체로 넘어온다.

		this.farmCultivateInfoService.add(farmCultivateInfo);

		return "redirect:/farmCultivateInfoList";
	}

	@RequestMapping(value = "/farmCultivateInfoList", method = RequestMethod.GET)
	public String farmCultivateInfoList(Model model) throws Exception {
		logger.info("farmCultivateInfo 리스트");
		// 리스트 출력
		model.addAttribute("farmCultivateInfo", new FarmCultivateInfo());
		model.addAttribute("listFarmCultivateInfo", this.farmCultivateInfoService.getAll());
		// jsp 페이지에 model를 받아 리스트를 페이지로 뿌려준다.
		return "farmCultivateInfoList";
	}

	@RequestMapping("/farmCultivateInfoRemove/{id}")
	public String farmCultivateInfoDelete(@PathVariable("id") int id) {

		this.farmCultivateInfoService.delete(id);// id로 검색해서 삭제
		return "redirect:/farmCultivateInfoList";// list 페이지를 부르면서 새로고침
	}

	/*
	 * @RequestMapping("/farmCultivateInfoModify/{id}") public String
	 * farmCultivateInfoModify(@PathVariable("id") int id, Model model) {
	 * model.addAttribute("farmCultivateInfo", this.farmCultivateInfoService.getById(id));
	 * model.addAttribute("listPersons", this.farmCultivateInfoService.getAll()); return
	 * "forward:/farmCultivateInfoAdd"; }
	 */
	@RequestMapping(value = "/farmCultivateInfoModify", method = RequestMethod.POST)
	public String buyerInfoModify(@ModelAttribute("farmCultivateInfo") FarmCultivateInfo farmCultivateInfo)
			throws Exception {

		this.farmCultivateInfoService.update(farmCultivateInfo);
		return "redirect:/farmCultivateInfoList";
	}

	@RequestMapping("/farmCultivateInfoModify")
	public String farmCultivateInfoModify(@RequestParam("id") int id, Model model) {

		model.addAttribute("farmCultivateInfo", this.farmCultivateInfoService.getById(id));
		//model.addAttribute("listPersons", this.farmCultivateInfoService.getAll());

		return "farmCultivateInfoModify";
	}
	
	
	
	// info controller 수정 요망
	@RequestMapping(value = "/farmCultivateInfo", method = RequestMethod.GET)//서비스 호출
	public String farmCultivateInfo() throws Exception {
		logger.info("farmCultivateInfo");

		return "farmCultivateInfo";
	} 
	
}
