package kr.ac.iof.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class t30Controller {
	
	
	@RequestMapping(value = "/s30t", method = RequestMethod.GET)//��鍮��� �몄�
	public String t30() throws Exception {
		

		return "s30t";
	}
}
