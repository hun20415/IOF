/**                                                                             				                **/
/**                                File Name   : HistEnvironSumController.java       	                		         **/
/**                                Description : HistEnvironSum CRUD page crontroller                        			**/
/**                                Update      : 2015.05.20(옥정윤)                                				**/
/**                                ETC         : service 호출 및 각 jps를 호출하는 기능을 한다. 데이터를 jsp와 송 수신한다.(get, post)     **/
/**					                                                                                             **/
package kr.ac.iof.controller;

import kr.ac.iof.main.Service.HistEnvironSumService;
import kr.ac.iof.model.Main.HistEnvironSum;

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
public class HistEnvironSumController {

	private static final Logger logger = LoggerFactory.getLogger(HistEnvironSumController.class);
	@Autowired
	/* @Qualifier(value="histEnvironSumService") */
	private HistEnvironSumService histEnvironSumService;// 서비스 호출

	public void setHistEnvironSumService(HistEnvironSumService ps) {
		this.histEnvironSumService = ps;
	}

	@RequestMapping(value = "/histEnvironSumAdd", method = RequestMethod.GET)
	// 서비스 호출
	public String histEnvironSumAdd() throws Exception {
		logger.info("histEnvironSum 입력 View");

		return "histEnvironSumAdd";
	}

	@RequestMapping(value = "/histEnvironSumAdd", method = { RequestMethod.POST })
	// 데이터를 받기위한 POST
	public String histEnvironSumAdd(@ModelAttribute("histEnvironSum") HistEnvironSum histEnvironSum)
			throws Exception {
		// 추가 입력된 데이터는 histEnvironSum객체로 넘어온다.
		System.out.println(histEnvironSum.getSeqNo());
		this.histEnvironSumService.add(histEnvironSum);

		return "redirect:/histEnvironSumList";
	}

	@RequestMapping(value = "/histEnvironSumList", method = RequestMethod.GET)
	public String histEnvironSumList(Model model) throws Exception {
		logger.info("histEnvironSum 리스트");
		// 리스트 출력
		model.addAttribute("histEnvironSum", new HistEnvironSum());
		model.addAttribute("listHistEnvironSum", this.histEnvironSumService.getAll());
		// jsp 페이지에 model를 받아 리스트를 페이지로 뿌려준다.
		return "histEnvironSumList";
	}

	@RequestMapping("/histEnvironSumRemove/{id}")
	public String histEnvironSumDelete(@PathVariable("id") int id) {

		this.histEnvironSumService.delete(id);// id로 검색해서 삭제
		return "redirect:/histEnvironSumList";// list 페이지를 부르면서 새로고침
	}

	@RequestMapping(value = "/histEnvironSumModify", method = RequestMethod.POST)
	public String buyerInfoModify(@ModelAttribute("histEnvironSum") HistEnvironSum histEnvironSum)
			throws Exception {

		this.histEnvironSumService.update(histEnvironSum);
		return "redirect:/histEnvironSumList";
	}

	@RequestMapping("/histEnvironSumModify")
	public String histEnvironSumModify(@RequestParam("id") int id, Model model) {

		model.addAttribute("histEnvironSum", this.histEnvironSumService.getById(id));
		//model.addAttribute("listPersons", this.histEnvironSumService.getAll());

		return "histEnvironSumModify";
	}
	

}
