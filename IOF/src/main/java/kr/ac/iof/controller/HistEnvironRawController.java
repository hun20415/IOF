/**                                                                             				                **/
/**                                File Name   : HistEnvironRawController.java       	                		         **/
/**                                Description : HistEnvironRaw CRUD page crontroller                        			**/
/**                                Update      : 2015.05.20(옥정윤)                                				**/
/**                                ETC         : service 호출 및 각 jps를 호출하는 기능을 한다. 데이터를 jsp와 송 수신한다.(get, post)     **/
/**					                                                                                             **/
package kr.ac.iof.controller;

import java.util.List;
import java.util.Map;

import kr.ac.iof.main.Service.HistEnvironRawService;
import kr.ac.iof.model.Main.HistEnvironRaw;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Handles requests for the application user page.
 */
@Controller
// 어노테이션 선언은 필수이다.
public class HistEnvironRawController {

	private static final Logger logger = LoggerFactory.getLogger(HistEnvironRawController.class);
	@Autowired
	/* @Qualifier(value="histEnvironRawService") */
	private HistEnvironRawService histEnvironRawService;// 서비스 호출

	public void setHistEnvironRawService(HistEnvironRawService ps) {
		this.histEnvironRawService = ps;
	}

	@RequestMapping(value = "/histEnvironRawAdd", method = RequestMethod.GET)
	// 서비스 호출
	public String histEnvironRawAdd() throws Exception {
		logger.info("histEnvironRaw 입력 View");

		return "histEnvironRawAdd";
	}

	@RequestMapping(value = "/histEnvironRawAdd", method = { RequestMethod.POST })
	// 데이터를 받기위한 POST
	public String histEnvironRawAdd(@ModelAttribute("histEnvironRaw") HistEnvironRaw histEnvironRaw)
			throws Exception {
		// 추가 입력된 데이터는 histEnvironRaw객체로 넘어온다.
		System.out.println(histEnvironRaw.getSeqNo());
		this.histEnvironRawService.add(histEnvironRaw);

		return "redirect:/histEnvironRawList";
	}

	@RequestMapping(value = "/histEnvironRawList", method = RequestMethod.GET)
	public String histEnvironRawList(Model model) throws Exception {
		logger.info("histEnvironRaw 리스트");
		// 리스트 출력
		model.addAttribute("histEnvironRaw", new HistEnvironRaw());
		model.addAttribute("listHistEnvironRaw", this.histEnvironRawService.getAll());
		// jsp 페이지에 model를 받아 리스트를 페이지로 뿌려준다.
		return "histEnvironRawList";
	}

	@RequestMapping("/histEnvironRawRemove/{id}")
	public String histEnvironRawDelete(@PathVariable("id") int id) {

		this.histEnvironRawService.delete(id);// id로 검색해서 삭제
		return "redirect:/histEnvironRawList";// list 페이지를 부르면서 새로고침
	}

	@RequestMapping(value = "/histEnvironRawModify", method = RequestMethod.POST)
	public String buyerInfoModify(@ModelAttribute("histEnvironRaw") HistEnvironRaw histEnvironRaw)
			throws Exception {

		this.histEnvironRawService.update(histEnvironRaw);
		return "redirect:/histEnvironRawList";
	}

	@RequestMapping("/histEnvironRawModify")
	public String histEnvironRawModify(@RequestParam("id") int id, Model model) {

		model.addAttribute("histEnvironRaw", this.histEnvironRawService.getById(id));
		//model.addAttribute("listPersons", this.histEnvironRawService.getAll());

		return "histEnvironRawModify";
	}
	
	@RequestMapping(value = "/histEnvironRawG", method = RequestMethod.POST,  params= {"farmId","sectionId","eqId"})
	// 서비스 호출
	public String histEnvironRawG(String farmId, String sectionId, String eqId, Model model) throws Exception {
		
		logger.info("histEnvironRaw Graphic View2");
		
		this.histEnvironRawService.getSelectEq(farmId, sectionId, eqId);
		return "histEnvironRawG";
	}
	@RequestMapping(value = "/histEnvironRawG", method = RequestMethod.GET)
	public String histEnvironRawG(Model model) throws Exception {
		
		logger.info("histEnvironRaw Graphic View44");
		model.addAttribute("histEnvironRaw", new HistEnvironRaw());
		//model.addAttribute("listHistEnvironRaw", this.histEnvironRawService.getAll());
		
		String farmId = "2";
		String sectionId = "1";
		String eqId = "4";
		model.addAttribute("listHistEnvironRaw",this.histEnvironRawService.getSelectEq(farmId, sectionId, eqId));
		
		return "histEnvironRawG";
	}
	/*@RequestMapping(value = "/histEnvironRawG")
	public List<HistEnvironRaw> histEnvironRawG() throws Exception {
		
		String farmId = "2";
		String sectionId = "1";
		String eqId = "1";
		List<HistEnvironRaw> list = this.histEnvironRawService.getSelectEq(farmId, sectionId, eqId);
		System.out.print("aaa");
		
		return list;
	}*/
	/*@RequestMapping("/histEnvironRawG.do")
	public @ResponseBody Map<?,?> histJsonList(ModelMap model){
		
		//model.addAttribute("listHistEnvironRaw", this.histEnvironRawService.getSelectEq(farmId, sectionId, eqId));
		model.put("results", histEnvironRawService.getAll());
		return model;
	}*/
	
	
	

}
