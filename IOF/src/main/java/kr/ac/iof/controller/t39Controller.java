package kr.ac.iof.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class t39Controller {
	
	
	@RequestMapping(value = "/s39t", method = RequestMethod.GET)//��鍮��� �몄�
	public String t39() throws Exception {
		

		return "s39t";
	}
}
