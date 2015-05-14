/**                                                                             				                **/
/**                                File Name   : CropCateController.java       	                		         **/  		
/**                                Description : CropCate CRUD page crontroller                        			**/ 
/**                                Update      : 2015.05.07(박정훈)                                				**/
/**                                ETC         : service 호출 및 각 jps를 호출하는 기능을 한다. 데이터를 jsp와 송 수신한다.(get, post)     **/
/**					                                                                                             **/
package kr.ac.iof.controller;

import kr.ac.iof.main.Service.CropCateService;
import kr.ac.iof.model.Main.CropCate;

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
public class CropCateController {

	private static final Logger logger = LoggerFactory
			.getLogger(CropCateController.class);
	@Autowired
	/* @Qualifier(value="cropCateService") */
	private CropCateService cropCateService;//서비스 호출

	public void setCropCateService(CropCateService ps) {
		this.cropCateService = ps;
	}

	@RequestMapping(value = "/cropCateAdd", method = RequestMethod.GET)//서비스 호출
	public String cropCateAdd() throws Exception {
		logger.info("cropCate 입력 View");

		return "cropCateAdd";
	}

	@RequestMapping(value = "/cropCateAdd", method = RequestMethod.POST)//데이터를 받기위한 POST
	public String cropCateAdd(@ModelAttribute("cropCate") CropCate cropCate) throws Exception {
		//추가 입력된 데이터는 cropCate객체로 넘어온다.
		this.cropCateService.add(cropCate);
        
		return "redirect:/cropCateList";
	}
	
	

	@RequestMapping(value = "/cropCateList", method = RequestMethod.GET)
	public String cropCateList(Model model) throws Exception {
		logger.info("cropCate 리스트");
		//리스트 출력
		model.addAttribute("cropCate", new CropCate());
		model.addAttribute("listCropCate", this.cropCateService.getAll());
		//jsp 페이지에 model를 받아 리스트를 페이지로 뿌려준다.
		return "cropCateList";
	}

	@RequestMapping("/remove/{id}")
	public String cropCateDelete(@PathVariable("id") int id) {

		this.cropCateService.delete(id);//id로 검색해서 삭제
		return "redirect:/cropCateList";//list 페이지를 부르면서 새로고침
	}
	
	@RequestMapping(value = "/cropCateModify", method = RequestMethod.POST)
	public String cropCateModify(@ModelAttribute("cropCate")CropCate cropCate) throws Exception {
		
		 this.cropCateService.update(cropCate);
       return "redirect:/cropCateList";
	}
	
	@RequestMapping("/{id}")
	public String cropCateModify(@PathVariable("id") int id, Model model) {
		model.addAttribute("cropCate", this.cropCateService.getById(id));
		model.addAttribute("listPersons", this.cropCateService.getAll());	
		
		return "cropCateModify";
	}
	

}
