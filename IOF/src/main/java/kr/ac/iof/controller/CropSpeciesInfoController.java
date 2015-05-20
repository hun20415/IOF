/**                                                                             				                **/
/**                                File Name   : CropSpeciesInfoController.java       	                		         **/
/**                                Description : CropSpeciesInfo CRUD page crontroller                        			**/
/**                                Update      : 2015.05.20(옥정윤)                                 				**/
/**                                ETC         : service 호출 및 각 jps를 호출하는 기능을 한다. 데이터를 jsp와 송 수신한다.(get, post)     **/
/**					                                                                                             **/
package kr.ac.iof.controller;

import kr.ac.iof.main.Service.CropSpeciesInfoService;
import kr.ac.iof.model.Main.CropSpeciesInfo;

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
public class CropSpeciesInfoController {

	private static final Logger logger = LoggerFactory.getLogger(CropSpeciesInfoController.class);
	@Autowired
	/* @Qualifier(value="cropSpeciesInfoService") */
	private CropSpeciesInfoService cropSpeciesInfoService;// 서비스 호출

	public void setCropSpeciesInfoService(CropSpeciesInfoService ps) {
		this.cropSpeciesInfoService = ps;
	}

	@RequestMapping(value = "/cropSpeciesInfoAdd", method = RequestMethod.GET)
	// 서비스 호출
	public String cropSpeciesInfoAdd() throws Exception {
		logger.info("cropSpeciesInfo 입력 View");

		return "cropSpeciesInfoAdd";
	}

	@RequestMapping(value = "/cropSpeciesInfoAdd", method = { RequestMethod.POST })
	// 데이터를 받기위한 POST
	public String cropSpeciesInfoAdd(@ModelAttribute("cropSpeciesInfo") CropSpeciesInfo cropSpeciesInfo)
			throws Exception {
		// 추가 입력된 데이터는 cropSpeciesInfo객체로 넘어온다.
		System.out.println(cropSpeciesInfo.getSpeciesName());
		this.cropSpeciesInfoService.add(cropSpeciesInfo);

		return "redirect:/cropSpeciesInfoList";
	}

	@RequestMapping(value = "/cropSpeciesInfoList", method = RequestMethod.GET)
	public String cropSpeciesInfoList(Model model) throws Exception {
		logger.info("cropSpeciesInfo 리스트");
		// 리스트 출력
		model.addAttribute("cropSpeciesInfo", new CropSpeciesInfo());
		model.addAttribute("listCropSpeciesInfo", this.cropSpeciesInfoService.getAll());
		// jsp 페이지에 model를 받아 리스트를 페이지로 뿌려준다.
		return "cropSpeciesInfoList";
	}

	@RequestMapping("/cropSpeciesInfoRemove/{id}")
	public String cropSpeciesInfoDelete(@PathVariable("id") int id) {

		this.cropSpeciesInfoService.delete(id);// id로 검색해서 삭제
		return "redirect:/cropSpeciesInfoList";// list 페이지를 부르면서 새로고침
	}

	@RequestMapping(value = "/cropSpeciesInfoModify", method = RequestMethod.POST)
	public String buyerInfoModify(@ModelAttribute("cropSpeciesInfo") CropSpeciesInfo cropSpeciesInfo)
			throws Exception {

		this.cropSpeciesInfoService.update(cropSpeciesInfo);
		return "redirect:/cropSpeciesInfoList";
	}

	@RequestMapping("/cropSpeciesInfoModify")
	public String cropSpeciesInfoModify(@RequestParam("id") int id, Model model) {

		model.addAttribute("cropSpeciesInfo", this.cropSpeciesInfoService.getById(id));
		//model.addAttribute("listPersons", this.cropSpeciesInfoService.getAll());

		return "cropSpeciesInfoModify";
	}
	

}
