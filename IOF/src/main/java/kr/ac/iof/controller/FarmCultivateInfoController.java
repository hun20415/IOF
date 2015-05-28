package kr.ac.iof.controller ;

import kr.ac.iof.main.Service.FarmCultivateInfoService;
import kr.ac.iof.model.UserGroup;
import kr.ac.iof.model.Main.FarmCultivateInfo;

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
public class FarmCultivateInfoController  {
	
	private static final Logger logger = LoggerFactory
			.getLogger(FarmCultivateInfoController.class);
	@Autowired
	/* @Qualifier(value="farmCultivateInfoService") */
	private FarmCultivateInfoService farmCultivateInfoService;// 서비스 호출

	public void setFarmCultivateInfoService(FarmCultivateInfoService ps) {
		this.farmCultivateInfoService = ps;
	}
	
	
	/*@RequestMapping(value = "/signUp", method = RequestMethod.GET)
	public String signUp(Model model) {
		logger.info("sigh up(회원 가입 양식 불러옴)");
		model.addAttribute("userGroupP", new UserGroup());
		model.addAttribute("userGroupList", userGroupService.getAll());
		return "signUp";
	}*/
	

	@RequestMapping(value = "/farmCultivateInfoAdd", method = RequestMethod.GET)
	// 서비스 호출
	public String farmCultivateInfoAdd() throws Exception {
		logger.info("farmCultivateInfo 입력 View");
	
		return "farmCultivateInfoAdd";
	}

	//songlock: 2015-05-28
	@RequestMapping(value = "/farmCultivateInfoAdd", method = { RequestMethod.POST })
	// 데이터를 받기위한 POST
	public String farmCultivateInfoAdd(@RequestParam("m_farmId") Integer m_farmId, @RequestParam("m_userId") String m_userId, 
			@RequestParam("m_cropSpeciesId") Integer m_cropSpeciesId, @ModelAttribute("farmCultivateInfo") FarmCultivateInfo farmCultivateInfo)
			throws Exception {
		// 추가 입력된 데이터는 farmCultivateInfo객체로 넘어온다.

		this.farmCultivateInfoService.add(m_farmId, m_userId, m_cropSpeciesId, farmCultivateInfo);

		return "redirect:/closeWindows";
		/*		return "redirect:/farmCultivateInfoList";*/
	}

	@RequestMapping(value = "/farmCultivateInfoList", method = RequestMethod.GET)
	public String farmCultivateInfoList(Model model) throws Exception {
		logger.info("farmCultivateInfo 리스트");
		// 리스트 출력
		model.addAttribute("farmCultivateInfo", new FarmCultivateInfo());
		model.addAttribute("listFarmCultivateInfo", this.farmCultivateInfoService.getAll());
		// jsp 페이지에 model를 받아 리스트를 페이지로 뿌려준다.
		return "farmCultivateInfoList";
	}

	@RequestMapping("/farmCultivateInfoRemove/{tno}") /*id}")*/
	public String farmCultivateInfoDelete(@PathVariable ("tno") int tno) { /*("id") int id) {*/

		this.farmCultivateInfoService.delete(tno);// id로 검색해서 삭제
		return "redirect:/farmCultivateInfoList";// list 페이지를 부르면서 새로고침
	}

	//songlock: 2015-05-28
	@RequestMapping(value = "/farmCultivateInfoModify", method = RequestMethod.POST)
	public String farmCultivateInfoModify(@RequestParam("m_farmId") Integer m_farmId, @RequestParam("m_userId") String m_userId, 
			@RequestParam("m_cropSpeciesId") Integer m_cropSpeciesId, @ModelAttribute("farmCultivateInfo") FarmCultivateInfo farmCultivateInfo)
			throws Exception {

		this.farmCultivateInfoService.update(m_farmId, m_userId, m_cropSpeciesId, farmCultivateInfo);
		
		return "redirect:/closeWindows";
	}
	
	//songlock: 2015-05-28
	@RequestMapping(value = "/farmCultivateInfoModify")
	public String farmCultivateInfoModify(@RequestParam("m_farmId") Integer m_farmId, @RequestParam("m_userId") String m_userId, 
			@RequestParam("m_cropSpeciesId") Integer m_cropSpeciesId, @RequestParam("tno") int tno, Model model) {
		
		model.addAttribute("farmCultivateInfo", this.farmCultivateInfoService.getById(tno));
		model.addAttribute("m_farmId", new Integer(m_farmId));
		model.addAttribute("m_userId", new String(m_userId));
		model.addAttribute("m_cropSpeciesId", new Integer(m_cropSpeciesId));

		return "farmCultivateInfoModify";
	}
	
	 
	
	/*// info controller 수정 요망 
	@RequestMapping(value = "/farmCultivateInfoInfo", method = RequestMethod.GET)//서비스 호출
	public String farmCultivateInfo() throws Exception {
		logger.info("farmCultivateInfoInfo");

		return "farmCultivateInfoInfo";
	} 
*/	
	@RequestMapping(value = "/farmCultivateInfoHist", method = RequestMethod.GET)//서비스 호출
	public String farmCultivateInfoHist(Model model) throws Exception {
		logger.info("farmCultivateInfoHist");
		
		model.addAttribute("farmCultivateInfo", new FarmCultivateInfo());
		model.addAttribute("listFarmCultivateInfo", this.farmCultivateInfoService.getAll());
		
		return "farmCultivateInfoHist";
		/*return "redirect:/closeWindows";*/
	} 
	
	@RequestMapping(value = "/farmCultivateInfoInfo",  method = RequestMethod.GET)
	public String farmCultivateInfoInfo(@RequestParam("tno") int tno, Model model) {
		logger.info("farmCultivateInfo 1");
		
		model.addAttribute("farmCultivateInfo", this.farmCultivateInfoService.getById(tno));
		

		
		return "farmCultivateInfoInfo";
	}
	
	
}
