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
import org.springframework.web.servlet.ModelAndView;

/**
 * Handles requests for the application user page.
 */
@Controller
// 어노테이션 선언은 필수이다.
public class greenTomSimuController {

	private static final Logger logger = LoggerFactory.getLogger(greenTomSimuController.class);
	@Autowired
	private HistEnvironRawService histEnvironRawService;// 서비스 호출

	public void setHistEnvironRawService(HistEnvironRawService ps) {
		this.histEnvironRawService = ps;
	}

	@RequestMapping(value = "/greenSim", method = RequestMethod.GET)
	public String greenSim(Model model) throws Exception {		
		logger.info("greenSim");
		
		
		return "greenSim";
	}
	
	@RequestMapping(value = "/greenPara", method = RequestMethod.GET)
	public String greenPara(Model model) throws Exception {		
		logger.info("greenPara");
		
		
		return "greenPara";
	}
	
	
}
