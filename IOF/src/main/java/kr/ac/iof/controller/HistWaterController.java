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
	/* @Qualifier(value="histWaterService") */
	private HistWaterService histWaterService;// 서비스 호출

	public void setHistWaterService(HistWaterService ps) {
		this.histWaterService = ps;
	}

	@RequestMapping(value = "/histWaterAdd", method = RequestMethod.GET)
	// 서비스 호출
	public String histWaterAdd() throws Exception {
		logger.info("histWater 입력 View");

		return "histWaterAdd";
	}

	@RequestMapping(value = "/histWaterAdd", method = { RequestMethod.POST })
	// 데이터를 받기위한 POST
	public String histWaterAdd(@ModelAttribute("histWater") HistWater histWater)
			throws Exception {
		// 추가 입력된 데이터는 histWater객체로 넘어온다.
		
		this.histWaterService.add(histWater);

		return "redirect:/histWaterList";
	}

	@RequestMapping(value = "/histWaterList", method = RequestMethod.GET)
	public String histWaterList(Model model) throws Exception {
		logger.info("histWater 리스트");
		// 리스트 출력
		model.addAttribute("histWater", new HistWater());
		model.addAttribute("listHistWater", this.histWaterService.getAll());
		// jsp 페이지에 model를 받아 리스트를 페이지로 뿌려준다.
		return "histWaterList";
	}

	@RequestMapping("/histWaterRemove")
	public String histWaterDelete(@RequestParam("id") int id, @RequestParam("id2") int id2) {

		this.histWaterService.delete(id, id2);// id로 검색해서 삭제
		return "redirect:/histWaterList";// list 페이지를 부르면서 새로고침
	}

	@RequestMapping(value = "/histWaterModify", method = RequestMethod.POST)
	public String buyerInfoModify(@ModelAttribute("histWater") HistWater histWater)
			throws Exception {

		this.histWaterService.update(histWater);
		return "redirect:/histWaterList";
	}

	@RequestMapping("/histWaterModify")
	public String histWaterModify(@RequestParam("id") int id,@RequestParam("id2") int id2, Model model) {

		model.addAttribute("histWater", this.histWaterService.getById(id, id2));
		model.addAttribute("listPersons", this.histWaterService.getAll());

		return "histWaterModify";
	}
	

}
