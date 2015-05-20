/**                                                                             				                **/
/**                                File Name   : CropTypeInfoController.java       	                		         **/
/**                                Description : CropTypeInfo CRUD page crontroller                        			**/
/**                                Update      : 2015.05.20(옥정윤)                                				**/
/**                                ETC         : service 호출 및 각 jps를 호출하는 기능을 한다. 데이터를 jsp와 송 수신한다.(get, post)     **/
/**					                                                                                             **/
package kr.ac.iof.controller;

import kr.ac.iof.main.Service.CropTypeInfoService;
import kr.ac.iof.model.Main.CropTypeInfo;

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
public class CropTypeInfoController {

	private static final Logger logger = LoggerFactory.getLogger(CropTypeInfoController.class);
	@Autowired
	/* @Qualifier(value="cropTypeInfoService") */
	private CropTypeInfoService cropTypeInfoService;// 서비스 호출

	public void setCropTypeInfoService(CropTypeInfoService ps) {
		this.cropTypeInfoService = ps;
	}

	@RequestMapping(value = "/cropTypeInfoAdd", method = RequestMethod.GET)
	// 서비스 호출
	public String cropTypeInfoAdd() throws Exception {
		logger.info("cropTypeInfo 입력 View");

		return "cropTypeInfoAdd";
	}

	@RequestMapping(value = "/cropTypeInfoAdd", method = { RequestMethod.POST })
	// 데이터를 받기위한 POST
	public String cropTypeInfoAdd(@ModelAttribute("cropTypeInfo") CropTypeInfo cropTypeInfo)
			throws Exception {
		// 추가 입력된 데이터는 cropTypeInfo객체로 넘어온다.
		System.out.println(cropTypeInfo.getCropTypeName());
		this.cropTypeInfoService.add(cropTypeInfo);

		return "redirect:/cropTypeInfoList";
	}

	@RequestMapping(value = "/cropTypeInfoList", method = RequestMethod.GET)
	public String cropTypeInfoList(Model model) throws Exception {
		logger.info("cropTypeInfo 리스트");
		// 리스트 출력
		model.addAttribute("cropTypeInfo", new CropTypeInfo());
		model.addAttribute("listCropTypeInfo", this.cropTypeInfoService.getAll());
		// jsp 페이지에 model를 받아 리스트를 페이지로 뿌려준다.
		return "cropTypeInfoList";
	}

	@RequestMapping("/cropTypeInfoRemove/{id}")
	public String cropTypeInfoDelete(@PathVariable("id") int id) {

		this.cropTypeInfoService.delete(id);// id로 검색해서 삭제
		return "redirect:/cropTypeInfoList";// list 페이지를 부르면서 새로고침
	}

	@RequestMapping(value = "/cropTypeInfoModify", method = RequestMethod.POST)
	public String buyerInfoModify(@ModelAttribute("cropTypeInfo") CropTypeInfo cropTypeInfo)
			throws Exception {

		this.cropTypeInfoService.update(cropTypeInfo);
		return "redirect:/cropTypeInfoList";
	}

	@RequestMapping("/cropTypeInfoModify")
	public String cropTypeInfoModify(@RequestParam("id") int id, Model model) {

		model.addAttribute("cropTypeInfo", this.cropTypeInfoService.getById(id));
		//model.addAttribute("listPersons", this.cropTypeInfoService.getAll());

		return "cropTypeInfoModify";
	}
	

}
