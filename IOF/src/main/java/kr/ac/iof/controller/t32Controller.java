package kr.ac.iof.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class t32Controller {
	
	
	@RequestMapping(value = "/s32t", method = RequestMethod.GET)//��鍮��� �몄�
	public String t32() throws Exception {
		

		return "s32t";
	}
}
