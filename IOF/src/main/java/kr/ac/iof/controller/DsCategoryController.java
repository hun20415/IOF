/**                                                                             				                **/
/**                                File Name   : DsCategoryController.java       	                		         **/
/**                                Description : DsCategory CRUD page crontroller                        			**/
/**                                Update      : 2015.05.20(옥정윤)                                				**/
/**                                ETC         : service 호출 및 각 jps를 호출하는 기능을 한다. 데이터를 jsp와 송 수신한다.(get, post)     **/
/**					                                                                                             **/
package kr.ac.iof.controller;

import kr.ac.iof.main.Service.DsCategoryService;
import kr.ac.iof.model.Main.DsCategory;

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
public class DsCategoryController {

	private static final Logger logger = LoggerFactory.getLogger(DsCategoryController.class);
	@Autowired
	/* @Qualifier(value="dsCategoryService") */
	private DsCategoryService dsCategoryService;// 서비스 호출

	public void setDsCategoryService(DsCategoryService ps) {
		this.dsCategoryService = ps;
	}

	@RequestMapping(value = "/dsCategoryAdd", method = RequestMethod.GET)
	// 서비스 호출
	public String dsCategoryAdd() throws Exception {
		logger.info("dsCategory 입력 View");

		return "dsCategoryAdd";
	}

	@RequestMapping(value = "/dsCategoryAdd", method = { RequestMethod.POST })
	// 데이터를 받기위한 POST
	public String dsCategoryAdd(@ModelAttribute("dsCategory") DsCategory dsCategory)
			throws Exception {
		// 추가 입력된 데이터는 dsCategory객체로 넘어온다.
		System.out.println(dsCategory.getDsCateName());
		this.dsCategoryService.add(dsCategory);

		return "redirect:/dsCategoryList";
	}

	@RequestMapping(value = "/dsCategoryList", method = RequestMethod.GET)
	public String dsCategoryList(Model model) throws Exception {
		logger.info("dsCategory 리스트");
		// 리스트 출력
		model.addAttribute("dsCategory", new DsCategory());
		model.addAttribute("listDsCategory", this.dsCategoryService.getAll());
		// jsp 페이지에 model를 받아 리스트를 페이지로 뿌려준다.
		return "dsCategoryList";
	}

	@RequestMapping("/dsCategoryRemove/{id}")
	public String dsCategoryDelete(@PathVariable("id") int id) {

		this.dsCategoryService.delete(id);// id로 검색해서 삭제
		return "redirect:/dsCategoryList";// list 페이지를 부르면서 새로고침
	}

	@RequestMapping(value = "/dsCategoryModify", method = RequestMethod.POST)
	public String buyerInfoModify(@ModelAttribute("dsCategory") DsCategory dsCategory)
			throws Exception {

		this.dsCategoryService.update(dsCategory);
		return "redirect:/dsCategoryList";
	}

	@RequestMapping("/dsCategoryModify")
	public String dsCategoryModify(@RequestParam("id") int id, Model model) {

		model.addAttribute("dsCategory", this.dsCategoryService.getById(id));
		//model.addAttribute("listPersons", this.dsCategoryService.getAll());

		return "dsCategoryModify";
	}
	

}
