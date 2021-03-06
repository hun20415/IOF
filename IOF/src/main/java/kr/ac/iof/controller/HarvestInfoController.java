/**                                                                             				                **/
/**                                File Name   : HarvestInfoController.java       	                		         **/
/**                                Description : HarvestInfo CRUD page crontroller                        			**/
/**                                Update      : 2015.05.20(옥정윤)                                				**/
/**                                ETC         : service 호출 및 각 jps를 호출하는 기능을 한다. 데이터를 jsp와 송 수신한다.(get, post)     **/
/**					                                                                                             **/
package kr.ac.iof.controller;

import kr.ac.iof.main.Service.HarvestInfoService;
import kr.ac.iof.model.Main.HarvestInfo;

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
public class HarvestInfoController {

	private static final Logger logger = LoggerFactory.getLogger(HarvestInfoController.class);
	@Autowired
	/* @Qualifier(value="harvestInfoService") */
	private HarvestInfoService harvestInfoService;// 서비스 호출

	public void setHarvestInfoService(HarvestInfoService ps) {
		this.harvestInfoService = ps;
	}

	@RequestMapping(value = "/harvestInfoAdd", method = RequestMethod.GET)
	// 서비스 호출
	public String harvestInfoAdd() throws Exception {
		logger.info("harvestInfo 입력 View");

		return "harvestInfoAdd";
	}

	@RequestMapping(value = "/harvestInfoAdd", method = { RequestMethod.POST })
	// 데이터를 받기위한 POST
	public String harvestInfoAdd(@ModelAttribute("harvestInfo") HarvestInfo harvestInfo)
			throws Exception {
		// 추가 입력된 데이터는 harvestInfo객체로 넘어온다.
		System.out.println(harvestInfo.getTno());
		this.harvestInfoService.add(harvestInfo);

		return "redirect:/harvestInfoList";
	}

	@RequestMapping(value = "/harvestInfoList", method = RequestMethod.GET)
	public String harvestInfoList(Model model) throws Exception {
		logger.info("harvestInfo 리스트");
		// 리스트 출력
		model.addAttribute("harvestInfo", new HarvestInfo());
		model.addAttribute("listHarvestInfo", this.harvestInfoService.getAll());
		// jsp 페이지에 model를 받아 리스트를 페이지로 뿌려준다.
		return "harvestInfoList";
	}

	@RequestMapping("/harvestInfoRemove/{id}")
	public String harvestInfoDelete(@PathVariable("id") int id) {

		this.harvestInfoService.delete(id);// id로 검색해서 삭제
		return "redirect:/harvestInfoList";// list 페이지를 부르면서 새로고침
	}

	@RequestMapping(value = "/harvestInfoModify", method = RequestMethod.POST)
	public String buyerInfoModify(@ModelAttribute("harvestInfo") HarvestInfo harvestInfo)
			throws Exception {

		this.harvestInfoService.update(harvestInfo);
		return "redirect:/harvestInfoList";
	}

	@RequestMapping("/harvestInfoModify")
	public String harvestInfoModify(@RequestParam("id") int id, Model model) {

		model.addAttribute("harvestInfo", this.harvestInfoService.getById(id));
		//model.addAttribute("listPersons", this.harvestInfoService.getAll());

		return "harvestInfoModify";
	}
	

}
