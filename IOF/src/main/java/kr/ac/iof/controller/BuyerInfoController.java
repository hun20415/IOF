/**                                                                             				                **/
/**                                File Name   : BuyerInfoController.java       	                		         **/  		
/**                                Description : BuyerInfo CRUD page crontroller                        			**/ 
/**                                Update      : 2015.05.07(박정훈)                                				**/
/**                                ETC         : service 호출 및 각 jps를 호출하는 기능을 한다. 데이터를 jsp와 송 수신한다.(get, post)     **/
/**					                                                                                             **/
package kr.ac.iof.controller;



import kr.ac.iof.main.Service.BuyerInfoService;
import kr.ac.iof.model.Main.BuyerInfo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application user page.
 */
@Controller//어노테이션 선언은 필수이다. 
public class BuyerInfoController {

	private static final Logger logger = LoggerFactory
			.getLogger(BuyerInfoController.class);
	@Autowired
	/* @Qualifier(value="buyerInfoService") */
	private BuyerInfoService buyerInfoService;//서비스 호출

	public void setBuyerInfoService(BuyerInfoService ps) {
		this.buyerInfoService = ps;
	}

	@RequestMapping(value = "/buyerInfoAdd", method = RequestMethod.GET)//서비스 호출
	public String buyerInfoAdd() throws Exception {
		logger.info("buyerInfo 입력 View");

		return "buyerInfoAdd";
	}

	@RequestMapping(value = "/buyerInfoAdd", method = RequestMethod.POST)//데이터를 받기위한 POST
	public String buyerInfoAdd(@ModelAttribute("buyerInfo") BuyerInfo buyerInfo) throws Exception {
		//추가 입력된 데이터는 buyerInfo객체로 넘어온다.
		this.buyerInfoService.add(buyerInfo);
        
		return "redirect:/buyerInfoList";
	}
	
	
	@RequestMapping(value = "/buyerInfoList", method = RequestMethod.GET)
	public String buyerInfoList(Model model) throws Exception {
		logger.info("buyerInfo 리스트");
		//리스트 출력
		model.addAttribute("buyerInfo", new BuyerInfo());
		model.addAttribute("listBuyerInfo", this.buyerInfoService.getAll());
		//jsp 페이지에 model를 받아 리스트를 페이지로 뿌려준다.
		return "buyerInfoList";
	}

	@RequestMapping("/buyerInfoRemove/{id}")
	public String buyerInfoDelete(@PathVariable("id") int id) {

		this.buyerInfoService.delete(id);//id로 검색해서 삭제
		return "redirect:/buyerInfoList";//list 페이지를 부르면서 새로고침
	}
	
	@RequestMapping(value = "/buyerInfoModify", method = RequestMethod.POST)
	public String buyerInfoModify(@ModelAttribute("buyerInfo")BuyerInfo buyerInfo) throws Exception {
		
		 this.buyerInfoService.update(buyerInfo);
       return "redirect:/buyerInfoList";
	}
	
	@RequestMapping("/buyerInfoModify/{id}")
	public String buyerInfoModify(@PathVariable("id") int id, Model model) {
		model.addAttribute("buyerInfo", this.buyerInfoService.getById(id));
		model.addAttribute("listPersons", this.buyerInfoService.getAll());	
		
		return "buyerInfoModify";
	}

}
