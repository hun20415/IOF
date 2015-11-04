/**                                                                             				                **/
/**                                File Name   : HistEnvironRawController.java       	                		         **/
/**                                Description : HistEnvironRaw CRUD page crontroller                        			**/
/**                                Update      : 2015.05.20(옥정윤)                                				**/
/**                                ETC         : service 호출 및 각 jps를 호출하는 기능을 한다. 데이터를 jsp와 송 수신한다.(get, post)     **/
/**					                                                                                             **/
package kr.ac.iof.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import kr.ac.iof.main.Service.GreentomService;
import kr.ac.iof.main.Service.HistEnvironRawService;
import kr.ac.iof.model.Main.Greentom;
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
import org.springframework.web.servlet.ModelAndView;

/**
 * Handles requests for the application user page.
 */
@Controller
// 어노테이션 선언은 필수이다.
public class greenTomSimuController {

	private static final Logger logger = LoggerFactory.getLogger(greenTomSimuController.class);
	@Autowired
	private GreentomService greentomService;// 서비스 호출

	public void setGreentomService(GreentomService ps) {
		this.greentomService = ps;
	}
	@Autowired
	private HistEnvironRawService histEnvironRawService;// 서비스 호출

	public void setHistEnvironRawService(HistEnvironRawService ps) {
		this.histEnvironRawService = ps;
	}

	
	@RequestMapping(value = "/greenSim", method = RequestMethod.GET)
	public void greenSim(Model model) throws Exception {
		
		logger.info("greenSim");
		model.addAttribute("greentom", new Greentom());
		model.addAttribute("greentoms",this.greentomService.getAll());
		model.addAttribute("histEnvironRaw", new HistEnvironRaw());

		
		String farmId = "2";
		String sectionId = "1";
		String eqId1 = "1";
		String eqId2 = "2";
		String eqId3 = "3";
		String eqId4 = "4";
		String eqId5 = "5";
		String eqId6 = "6";
		String eqId7 = "7";
		String eqId8 = "8";
		String eqId9 = "9";
		String eqId10= "10";
		String eqId11= "11";
		String eqId12= "12";
		String eqId13= "13";
		String eqId14= "14";		
		
		model.addAttribute("sensor1",this.histEnvironRawService.getSelectEq(farmId, sectionId, eqId1));
		model.addAttribute("sensor2",this.histEnvironRawService.getSelectEq(farmId, sectionId, eqId2));
		model.addAttribute("sensor3",this.histEnvironRawService.getSelectEq(farmId, sectionId, eqId3));
		model.addAttribute("sensor4",this.histEnvironRawService.getSelectEq(farmId, sectionId, eqId4));
		model.addAttribute("sensor5",this.histEnvironRawService.getSelectEq(farmId, sectionId, eqId5));
		model.addAttribute("sensor6",this.histEnvironRawService.getSelectEq(farmId, sectionId, eqId6));
		model.addAttribute("sensor7",this.histEnvironRawService.getSelectEq(farmId, sectionId, eqId7));
		model.addAttribute("sensor8",this.histEnvironRawService.getSelectEq(farmId, sectionId, eqId8));
		model.addAttribute("sensor9",this.histEnvironRawService.getSelectEq(farmId, sectionId, eqId9));
		model.addAttribute("sensor10",this.histEnvironRawService.getSelectEq(farmId, sectionId, eqId10));
		model.addAttribute("sensor11",this.histEnvironRawService.getSelectEq(farmId, sectionId, eqId11));
		model.addAttribute("sensor12",this.histEnvironRawService.getSelectEq(farmId, sectionId, eqId12));
		model.addAttribute("sensor13",this.histEnvironRawService.getSelectEq(farmId, sectionId, eqId13));
		model.addAttribute("sensor14",this.histEnvironRawService.getSelectEq(farmId, sectionId, eqId14));
		
		
	}
	
	@RequestMapping(value = "/greenPara", method = RequestMethod.GET)
	public String greenPara(Model model) throws Exception {		
		
		logger.info("greenPara");
		return "greenPara";
	}
	
	
}
