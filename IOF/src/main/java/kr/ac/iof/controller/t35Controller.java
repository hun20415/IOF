package kr.ac.iof.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class t35Controller {
	
	
	@RequestMapping(value = "/s35t", method = RequestMethod.GET)//��鍮��� �몄�
	public String t35() throws Exception {
		

		return "s35t";
	}
}
