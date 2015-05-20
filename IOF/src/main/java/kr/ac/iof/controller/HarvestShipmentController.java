/**                                                                             				                **/
/**                                File Name   : HarvestShipmentController.java       	                		         **/
/**                                Description : HarvestShipment CRUD page crontroller                        			**/
/**                                Update      : 2015.05.20(옥정윤)                                				**/
/**                                ETC         : service 호출 및 각 jps를 호출하는 기능을 한다. 데이터를 jsp와 송 수신한다.(get, post)     **/
/**					                                                                                             **/
package kr.ac.iof.controller;

import kr.ac.iof.main.Service.HarvestShipmentService;
import kr.ac.iof.model.Main.HarvestShipment;

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
public class HarvestShipmentController {

	private static final Logger logger = LoggerFactory.getLogger(HarvestShipmentController.class);
	@Autowired
	/* @Qualifier(value="harvestShipmentService") */
	private HarvestShipmentService harvestShipmentService;// 서비스 호출

	public void setHarvestShipmentService(HarvestShipmentService ps) {
		this.harvestShipmentService = ps;
	}

	@RequestMapping(value = "/harvestShipmentAdd", method = RequestMethod.GET)
	// 서비스 호출
	public String harvestShipmentAdd() throws Exception {
		logger.info("harvestShipment 입력 View");

		return "harvestShipmentAdd";
	}

	@RequestMapping(value = "/harvestShipmentAdd", method = { RequestMethod.POST })
	// 데이터를 받기위한 POST
	public String harvestShipmentAdd(@ModelAttribute("harvestShipment") HarvestShipment harvestShipment)
			throws Exception {
		// 추가 입력된 데이터는 harvestShipment객체로 넘어온다.
		System.out.println(harvestShipment.getTno());
		this.harvestShipmentService.add(harvestShipment);

		return "redirect:/harvestShipmentList";
	}

	@RequestMapping(value = "/harvestShipmentList", method = RequestMethod.GET)
	public String harvestShipmentList(Model model) throws Exception {
		logger.info("harvestShipment 리스트");
		// 리스트 출력
		model.addAttribute("harvestShipment", new HarvestShipment());
		model.addAttribute("listHarvestShipment", this.harvestShipmentService.getAll());
		// jsp 페이지에 model를 받아 리스트를 페이지로 뿌려준다.
		return "harvestShipmentList";
	}

	@RequestMapping("/harvestShipmentRemove/{id}")
	public String harvestShipmentDelete(@PathVariable("id") int id) {

		this.harvestShipmentService.delete(id);// id로 검색해서 삭제
		return "redirect:/harvestShipmentList";// list 페이지를 부르면서 새로고침
	}

	@RequestMapping(value = "/harvestShipmentModify", method = RequestMethod.POST)
	public String buyerInfoModify(@ModelAttribute("harvestShipment") HarvestShipment harvestShipment)
			throws Exception {

		this.harvestShipmentService.update(harvestShipment);
		return "redirect:/harvestShipmentList";
	}

	@RequestMapping("/harvestShipmentModify")
	public String harvestShipmentModify(@RequestParam("id") int id, Model model) {

		model.addAttribute("harvestShipment", this.harvestShipmentService.getById(id));
		//model.addAttribute("listPersons", this.harvestShipmentService.getAll());

		return "harvestShipmentModify";
	}
	

}
