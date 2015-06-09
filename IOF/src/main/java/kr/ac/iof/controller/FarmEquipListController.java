package kr.ac.iof.controller ;

import kr.ac.iof.main.Service.FarmEquipListService;
import kr.ac.iof.main.Service.FarmEquipTypeService;
import kr.ac.iof.main.Service.FarmInfoService;
import kr.ac.iof.main.Service.FarmSectionInfoService;
import kr.ac.iof.model.Main.FarmEquipList;
import kr.ac.iof.model.Main.FarmEquipType;
import kr.ac.iof.model.Main.FarmInfo;
import kr.ac.iof.model.Main.FarmSectionInfo;



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
public class FarmEquipListController  {
	
	private static final Logger logger = LoggerFactory.getLogger(FarmEquipListController.class);
	@Autowired
	/* @Qualifier(value="farmEquipListService") */
	private FarmEquipListService farmEquipListService;// 서비스 호출
	@Autowired
	private FarmInfoService farmInfoService; //songlock: 2015-06-01 farmId, farmNamed을 위하여
	@Autowired//꼭 추가해야함
	private FarmEquipTypeService farmEquipTypeService; //songlock: 2015-06-01 farmEquipTypeID를 위하여
	@Autowired//꼭 추가해야함
	private FarmSectionInfoService farmSectionInfoService; //songlock: 2015-06-01 farmEquipTypeID를 위하여
	
	
	public void setFarmEquipListService(FarmEquipListService ps) {
		this.farmEquipListService = ps;
	}

	
/*	//Oak: 2015-06-04
	 @RequestMapping(value = "/farmEquipListAdd", method = { RequestMethod.POST })
	// 데이터를 받기위한 POST
	public String farmEquipListAdd()	throws Exception {
		// 추가 입력된 데이터는 farmEquipList객체로 넘어온다.
		System.out.println("nononononono");
		
		return "redirect:/closeWindows";
		// oak : 저장이 확인 단추가 아니고 '추가'이므로 다시 자기 페이지로 돌아와야 함
		//return "farmEquipListAdd";
	}*/
	
	
	//songlock: 2015-06-01
	@RequestMapping(value = "/farmEquipListAdd", method = RequestMethod.GET)
	// 서비스 호출
	public String farmEquipListAdd(Model model) throws Exception {
		logger.info("farmEquipList 입력 View");
		System.out.println("333333333333333333333333333");
		model.addAttribute("farmInfo", new FarmInfo());
		model.addAttribute("farmInfoList", farmInfoService.getAll());
		model.addAttribute("farmEquipType", new FarmEquipType());
		model.addAttribute("farmEquipTypeList", farmEquipTypeService.getAll()); 
		
		model.addAttribute("farmSection", new FarmSectionInfo());
		model.addAttribute("farmSectionList", farmSectionInfoService.getAll()); 
	
		return "farmEquipListAdd";
	}


	
	//Oak: 2015-06-03	
	@RequestMapping(value = "/farmEquipListAdd", method = RequestMethod.GET, params={"m_farmId", "farmSectionId"})
	// 서비스 호출
	public String farmEquipListAdd(@RequestParam("m_farmId") Integer m_farmId,@RequestParam("farmSectionId") Integer farmSectionId,  Model model) throws Exception {
		logger.info("farmEquipList with farmid입력 View");

		model.addAttribute("farmInfo", new FarmInfo());
		model.addAttribute("farmInfoList", farmInfoService.getAll());
		model.addAttribute("m_farmId", m_farmId);
		model.addAttribute("farmEquiplist", new FarmEquipList());
		model.addAttribute("listfarmEquipList", farmEquipListService.getAll2(m_farmId));
		
		model.addAttribute("farmSectionId", farmSectionId);
		model.addAttribute("farmEquipType", new FarmEquipType());
		model.addAttribute("listFarmEquipType", farmEquipTypeService.getAll()); 
		
		if(farmSectionId != null){
			model.addAttribute("farmEquipListInfo", new FarmEquipList());			
			model.addAttribute("listFarmEquipListInfo", this.farmEquipListService.getByFarmIdAndSectionId(m_farmId, farmSectionId));
		}
		
		model.addAttribute("farmSection", new FarmSectionInfo());
		model.addAttribute("farmSectionList", farmSectionInfoService.getAll()); 
		
		/*model.addAttribute("listFarmEquipListAdd", this.farmEquipListService.getByFarmId(m_farmId));*/
		return "farmEquipListAdd";
	}	


	//songlock: 2015-06-01
	@RequestMapping(value = "/farmEquipListAdd", method = { RequestMethod.POST })
	// 데이터를 받기위한 POST
	public String farmEquipListAdd(@RequestParam("m_farmId") Integer m_farmId, @RequestParam("m_eqTypeId") Integer m_eqTypeId, @ModelAttribute("farmEquipList") FarmEquipList farmEquipList)
			throws Exception {
		// 추가 입력된 데이터는 farmEquipList객체로 넘어온다.
		System.out.println("4444444444444444444444444");
		
		//model.addAttribute("farmEquipType", new FarmEquipType());
		//model.addAttribute("listFarmEquipType", farmEquipTypeService.getAll());
		
				
		this.farmEquipListService.add(m_farmId, m_eqTypeId, farmEquipList);

		 return "redirect:/farmEquipListAdd";
		// oak : 저장이 확인 단추가 아니고 '추가'이므로 다시 자기 페이지로 돌아와야 함
		//return "farmEquipListAdd";
	}
	
	
	//songlock: 2015-06-03
	@RequestMapping(value = "/farmEquipListInfo", method = RequestMethod.GET)
	public String farmEquipListInfo(@RequestParam("m_farmId") Integer m_farmId, 
			@RequestParam("farmSectionId") Integer farmSectionId, Model model) throws Exception {
		logger.info("farmEquipInfo View");
		
		model.addAttribute("farmInfo", this.farmInfoService.getById(m_farmId));
		model.addAttribute("farmSectionId", farmSectionId);
		model.addAttribute("farmEquipListInfo", new FarmEquipList());
		model.addAttribute("listFarmEquipListInfo", this.farmEquipListService.getByFarmIdAndSectionId(m_farmId, farmSectionId));
		return "farmEquipListInfo";
	}  


	//songlock: 2015-06-03
	@RequestMapping(value = "/farmEquipListList", method = RequestMethod.GET)
	public String farmEquipListList(Model model) throws Exception {
		logger.info("farmEquipList 리스트");
		// 리스트 출력
		model.addAttribute("farmEquipList", new FarmEquipList());
		model.addAttribute("listFarmEquipList", this.farmEquipListService.getAll()); 
				
		return "farmEquipListList";
	}
		
	//songlock: 2015-06-04
	@RequestMapping(value = "/farmEquipListModify", method = RequestMethod.GET)
	public String farmEquipListModify(@RequestParam("m_farmId") Integer m_farmId, 
			@RequestParam("farmSectionId") Integer farmSectionId, 
			@RequestParam("eqId") Integer eqId, @RequestParam("eqTypeId") Integer eqTypeId, Model model) throws Exception {
		logger.info("farmEquipListModify 리스트");
		System.out.println("Modifying~~~~~~~~~~~~~~~~~~~");
		// 리스트 출력
		model.addAttribute("farmInfo", this.farmInfoService.getById(m_farmId));
		model.addAttribute("farmSectionId", farmSectionId);
		
		model.addAttribute("eqId", eqId);
		model.addAttribute("eqTypeId", eqTypeId);
		
		model.addAttribute("farmEquipType", new FarmEquipType());  //oak 20150605
		
		model.addAttribute("listFarmEquipType", farmEquipTypeService.getAll());
		model.addAttribute("farmEquipList", this.farmEquipListService.getById(m_farmId, farmSectionId, eqId));
		//model.addAttribute("m_farmId", new Integer(m_farmId));
		//model.addAttribute("m_eqTypeId", new Integer(m_eqTypeId));
		
		//model.addAttribute("farmInfo", new FarmInfo());
		//model.addAttribute("farmInfoAll", this.farmInfoService.getAll());
		
		// jsp 페이지에 model를 받아 리스트를 페이지로 뿌려준다.
		return "farmEquipListModify";
	}

	//songlock: 2015-06-01
	@RequestMapping(value = "/farmEquipListModify", method = RequestMethod.POST)
	public String farmEquipListModify(
			@RequestParam("m_farmId") int m_farmId, 
			@RequestParam("m_eqTypeId") int m_eqTypeId, 
			@ModelAttribute("farmEquipList") FarmEquipList farmEquipList) {
		
		System.out.println("Modify POST Controller~!!!!!!");
		//System.out.println("eqID: " + farmEquipList.getEqId());
		//System.out.println("sensor, control: " + farmEquipList.getEqTypeName());
		
		this.farmEquipListService.update(m_farmId, m_eqTypeId, farmEquipList);
		return "farmEquipListModify";
	}
	
	@RequestMapping("/farmEquipListRemove/{id}")
	public String farmEquipListDelete(@PathVariable("id") int id) { //oak, @RequestParam("m_eqTypeId") int m_eqTypeId) {

		this.farmEquipListService.delete(id); // oak id로 검색해서 삭제 , m_eqTypeId);
		return "redirect:/farmEquipListList";// list 페이지를 부르면서 새로고침
	}

	
}
