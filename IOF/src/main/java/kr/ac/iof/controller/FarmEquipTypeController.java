/**                                                                             				                **/
/**                                File Name   : FarmEquipTypeController.java       	                		         **/
/**                                Description : FarmEquipType CRUD page crontroller                        			**/
/**                                Update      : 2015.05.20(옥정윤)                                				**/
/**                                ETC         : service 호출 및 각 jps를 호출하는 기능을 한다. 데이터를 jsp와 송 수신한다.(get, post)     **/
/**					                                                                                             **/
package kr.ac.iof.controller;

import kr.ac.iof.main.Service.FarmEquipTypeService;
import kr.ac.iof.model.Main.FarmEquipType;

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
// 어노테이션 선언은 필수이다.
public class FarmEquipTypeController {

	private static final Logger logger = LoggerFactory.getLogger(FarmEquipTypeController.class);
	@Autowired
	/* @Qualifier(value="farmEquipTypeService") */
	private FarmEquipTypeService farmEquipTypeService;// 서비스 호출

	public void setFarmEquipTypeService(FarmEquipTypeService ps) {
		this.farmEquipTypeService = ps;
	}

	@RequestMapping(value = "/farmEquipTypeAdd", method = RequestMethod.GET)
	// 서비스 호출
	public String farmEquipTypeAdd() throws Exception {
		logger.info("farmEquipType 입력 View");

		return "farmEquipTypeAdd";
	}

	@RequestMapping(value = "/farmEquipTypeAdd", method = { RequestMethod.POST })
	// 데이터를 받기위한 POST
	public String farmEquipTypeAdd(@ModelAttribute("farmEquipType") FarmEquipType farmEquipType)
			throws Exception {
		// 추가 입력된 데이터는 farmEquipType객체로 넘어온다.
		System.out.println(farmEquipType.getEqTypeName());
		this.farmEquipTypeService.add(farmEquipType);

		return "redirect:/farmEquipTypeList";
	}

	@RequestMapping(value = "/farmEquipTypeList", method = RequestMethod.GET)
	public String farmEquipTypeList(Model model) throws Exception {
		logger.info("farmEquipType 리스트");
		// 리스트 출력
		model.addAttribute("farmEquipType", new FarmEquipType());
		model.addAttribute("listFarmEquipType", this.farmEquipTypeService.getAll());
		// jsp 페이지에 model를 받아 리스트를 페이지로 뿌려준다.
		return "farmEquipTypeList";
	}

	@RequestMapping("/farmEquipTypeRemove/{id}")
	public String farmEquipTypeDelete(@PathVariable("id") int id) {

		this.farmEquipTypeService.delete(id);// id로 검색해서 삭제
		return "redirect:/farmEquipTypeList";// list 페이지를 부르면서 새로고침
	}

	@RequestMapping(value = "/farmEquipTypeModify", method = RequestMethod.POST)
	public String buyerInfoModify(@ModelAttribute("farmEquipType") FarmEquipType farmEquipType)
			throws Exception {

		this.farmEquipTypeService.update(farmEquipType);
		return "redirect:/farmEquipTypeList";
	}

	@RequestMapping("/farmEquipTypeModify")
	public String farmEquipTypeModify(@RequestParam("id") int id, Model model) {

		model.addAttribute("farmEquipType", this.farmEquipTypeService.getById(id));
		//model.addAttribute("listPersons", this.farmEquipTypeService.getAll());userTestGraph

		return "farmEquipTypeModify";
	}
	
	@RequestMapping(value = "/userTestGraph", method = RequestMethod.POST)
	public String userTestGraph(@ModelAttribute("userTestGraph") FarmEquipType userTestGraph)
			throws Exception {

		return "userTestGrapht";
	}

}
