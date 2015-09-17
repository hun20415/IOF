package kr.ac.iof.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class t34Controller {
	
	
	@RequestMapping(value = "/s34t", method = RequestMethod.GET)//��鍮��� �몄�
	public String t34() throws Exception {
		

		return "s34t";
	}
}
