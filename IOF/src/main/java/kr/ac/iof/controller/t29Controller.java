package kr.ac.iof.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class t29Controller {
	
	
	@RequestMapping(value = "/s29t", method = RequestMethod.GET)//��鍮��� �몄�
	public String t29() throws Exception {
		

		return "s29t";
	}
}
