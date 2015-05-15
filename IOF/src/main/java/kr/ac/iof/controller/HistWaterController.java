/**                                                                             				                **/
/**                                File Name   : HistWaterController.java       	                		         **/
/**                                Description : HistWater CRUD page crontroller                        			**/
/**                                Update      : 2015.05.07(박정훈)                                				**/
/**                                ETC         : service 호출 및 각 jps를 호출하는 기능을 한다. 데이터를 jsp와 송 수신한다.(get, post)     **/
/**					                                                                                             **/
package kr.ac.iof.controller;

import kr.ac.iof.main.Service.HistWaterService;
import kr.ac.iof.model.Main.HistWater;

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
public class HistWaterController {

	private static final Logger logger = LoggerFactory.getLogger(HistWaterController.class);
	@Autowired
	/* @Qualifier(value="HistWaterService") */
	private HistWaterService HistWaterService;// 서비스 호출

	public void setHistWaterService(HistWaterService ps) {
		this.HistWaterService = ps;
	}

	@RequestMapping(value = "/HistWaterAdd", method = RequestMethod.GET)
	// 서비스 호출
	public String HistWaterAdd() throws Exception {
		logger.info("HistWater 입력 View");

		return "HistWaterAdd";
	}

	@RequestMapping(value = "/HistWaterAdd", method = { RequestMethod.POST })
	// 데이터를 받기위한 POST
	public String HistWaterAdd(@ModelAttribute("HistWater") HistWater HistWater)
			throws Exception {
		// 추가 입력된 데이터는 HistWater객체로 넘어온다.
		
		this.HistWaterService.add(HistWater);

		return "redirect:/HistWaterList";
	}

	@RequestMapping(value = "/HistWaterList", method = RequestMethod.GET)
	public String HistWaterList(Model model) throws Exception {
		logger.info("HistWater 리스트");
		// 리스트 출력
		model.addAttribute("HistWater", new HistWater());
		model.addAttribute("listHistWater", this.HistWaterService.getAll());
		// jsp 페이지에 model를 받아 리스트를 페이지로 뿌려준다.
		return "HistWaterList";
	}

	@RequestMapping("/HistWaterRemove/{id}")
	public String HistWaterDelete(@PathVariable("id") int id) {

		this.HistWaterService.delete(id);// id로 검색해서 삭제
		return "redirect:/HistWaterList";// list 페이지를 부르면서 새로고침
	}

	@RequestMapping(value = "/HistWaterModify", method = RequestMethod.POST)
	public String buyerInfoModify(@ModelAttribute("HistWater") HistWater HistWater)
			throws Exception {

		this.HistWaterService.update(HistWater);
		return "redirect:/HistWaterList";
	}

	@RequestMapping("/HistWaterModify")
	public String HistWaterModify(@RequestParam("id") int id, Model model) {

		model.addAttribute("HistWater", this.HistWaterService.getById(id));
		model.addAttribute("listPersons", this.HistWaterService.getAll());

		return "HistWaterModify";
	}
	

}
