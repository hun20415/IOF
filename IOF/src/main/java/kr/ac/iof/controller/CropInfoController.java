/**                                                                             				                **/
/**                                File Name   : CropInfoController.java       	                		         **/
/**                                Description : CropInfo CRUD page crontroller                        			**/
/**                                Update      : 2015.05.20(옥정윤)                                				**/
/**                                ETC         : service 호출 및 각 jps를 호출하는 기능을 한다. 데이터를 jsp와 송 수신한다.(get, post)     **/
/**					                                                                                             **/
package kr.ac.iof.controller;

import kr.ac.iof.main.Service.CropInfoService;
import kr.ac.iof.model.Main.CropInfo;

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
public class CropInfoController {

	private static final Logger logger = LoggerFactory.getLogger(CropInfoController.class);
	@Autowired
	/* @Qualifier(value="cropInfoService") */
	private CropInfoService cropInfoService;// 서비스 호출

	public void setCropInfoService(CropInfoService ps) {
		this.cropInfoService = ps;
	}

	@RequestMapping(value = "/cropInfoAdd", method = RequestMethod.GET)
	// 서비스 호출
	public String cropInfoAdd() throws Exception {
		logger.info("cropInfo 입력 View");

		return "cropInfoAdd";
	}

	@RequestMapping(value = "/cropInfoAdd", method = { RequestMethod.POST })
	// 데이터를 받기위한 POST
	public String cropInfoAdd(@ModelAttribute("cropInfo") CropInfo cropInfo)
			throws Exception {
		// 추가 입력된 데이터는 cropInfo객체로 넘어온다.
		System.out.println(cropInfo.getCropName());
		this.cropInfoService.add(cropInfo);

		return "redirect:/cropInfoList";
	}

	@RequestMapping(value = "/cropInfoList", method = RequestMethod.GET)
	public String cropInfoList(Model model) throws Exception {
		logger.info("cropInfo 리스트");
		// 리스트 출력
		model.addAttribute("cropInfo", new CropInfo());
		model.addAttribute("listCropInfo", this.cropInfoService.getAll());
		// jsp 페이지에 model를 받아 리스트를 페이지로 뿌려준다.
		return "cropInfoList";
	}

	@RequestMapping("/cropInfoRemove/{id}")
	public String cropInfoDelete(@PathVariable("id") int id) {

		this.cropInfoService.delete(id);// id로 검색해서 삭제
		return "redirect:/cropInfoList";// list 페이지를 부르면서 새로고침
	}

	@RequestMapping(value = "/cropInfoModify", method = RequestMethod.POST)
	public String buyerInfoModify(@ModelAttribute("cropInfo") CropInfo cropInfo)
			throws Exception {

		this.cropInfoService.update(cropInfo);
		return "redirect:/cropInfoList";
	}

	@RequestMapping("/cropInfoModify")
	public String cropInfoModify(@RequestParam("id") int id, Model model) {

		model.addAttribute("cropInfo", this.cropInfoService.getById(id));
		//model.addAttribute("listPersons", this.cropInfoService.getAll());

		return "cropInfoModify";
	}
	

}
