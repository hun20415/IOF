/**                                                                             				                **/
/**                                File Name   : DsInfoController.java       	                		         **/
/**                                Description : DsInfo CRUD page crontroller                        			**/
/**                                Update      : 2015.05.20(옥정윤)                                				**/
/**                                ETC         : service 호출 및 각 jps를 호출하는 기능을 한다. 데이터를 jsp와 송 수신한다.(get, post)     **/
/**					                                                                                             **/
package kr.ac.iof.controller;

import kr.ac.iof.main.Service.DsInfoService;
import kr.ac.iof.model.Main.DsInfo;

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
public class DsInfoController {

	private static final Logger logger = LoggerFactory.getLogger(DsInfoController.class);
	@Autowired
	/* @Qualifier(value="dsInfoService") */
	private DsInfoService dsInfoService;// 서비스 호출

	public void setDsInfoService(DsInfoService ps) {
		this.dsInfoService = ps;
	}

	@RequestMapping(value = "/dsInfoAdd", method = RequestMethod.GET)
	// 서비스 호출
	public String dsInfoAdd() throws Exception {
		logger.info("dsInfo 입력 View");

		return "dsInfoAdd";
	}

	@RequestMapping(value = "/dsInfoAdd", method = { RequestMethod.POST })
	// 데이터를 받기위한 POST
	public String dsInfoAdd(@ModelAttribute("dsInfo") DsInfo dsInfo)
			throws Exception {
		// 추가 입력된 데이터는 dsInfo객체로 넘어온다.
		System.out.println(dsInfo.getDsName());
		this.dsInfoService.add(dsInfo);

		return "redirect:/dsInfoList";
	}

	@RequestMapping(value = "/dsInfoList", method = RequestMethod.GET)
	public String dsInfoList(Model model) throws Exception {
		logger.info("dsInfo 리스트");
		// 리스트 출력
		model.addAttribute("dsInfo", new DsInfo());
		model.addAttribute("listDsInfo", this.dsInfoService.getAll());
		// jsp 페이지에 model를 받아 리스트를 페이지로 뿌려준다.
		return "dsInfoList";
	}

	@RequestMapping("/dsInfoRemove/{id}")
	public String dsInfoDelete(@PathVariable("id") int id) {

		this.dsInfoService.delete(id);// id로 검색해서 삭제
		return "redirect:/dsInfoList";// list 페이지를 부르면서 새로고침
	}

	@RequestMapping(value = "/dsInfoModify", method = RequestMethod.POST)
	public String buyerInfoModify(@ModelAttribute("dsInfo") DsInfo dsInfo)
			throws Exception {

		this.dsInfoService.update(dsInfo);
		return "redirect:/dsInfoList";
	}

	@RequestMapping("/dsInfoModify")
	public String dsInfoModify(@RequestParam("id") int id, Model model) {

		model.addAttribute("dsInfo", this.dsInfoService.getById(id));
		//model.addAttribute("listPersons", this.dsInfoService.getAll());

		return "dsInfoModify";
	}
	

}
