package kr.ac.iof.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class t33Controller {
	
	
	@RequestMapping(value = "/s33t", method = RequestMethod.GET)//��鍮��� �몄�
	public String t33() throws Exception {
		

		return "s33t";
	}
}
