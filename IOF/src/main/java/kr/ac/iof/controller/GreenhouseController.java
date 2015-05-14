package kr.ac.iof.controller ;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/**
 * Handles requests for the application user page.
 */
@Controller
public class GreenhouseController  {
	
	private static final Logger logger = LoggerFactory.getLogger(GreenhouseController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */

	@RequestMapping(value = "/greenHouseAdd", method = RequestMethod.GET)
	public String greenhouseAdd() {
		logger.info("greenHouseAdd");		
		return "greenHouseAdd";
	}
	
	@RequestMapping(value = "/greenHouseInfo", method = RequestMethod.GET)
	public String greenHouseInfo() {
		logger.info("greenHouseInfo");		
		return "greenHouseInfo";
	}
	
	@RequestMapping(value = "/greenHouseEnviInfo", method = RequestMethod.GET)
	public String greenHouseEnviInfo() {
		logger.info("greenHouseEnviInfo");		
		return "greenHouseEnviInfo";
	}
	
	@RequestMapping(value = "/greenHouseList", method = RequestMethod.GET)
	public String greenHouseList() {
		logger.info("greenHouseList");		
		return "greenHouseList";
	}
	
	 
	
}
