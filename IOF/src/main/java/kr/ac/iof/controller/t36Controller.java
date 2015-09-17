package kr.ac.iof.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class t36Controller {
	
	
	@RequestMapping(value = "/s36t", method = RequestMethod.GET)//��鍮��� �몄�
	public String t36() throws Exception {
		

		return "s36t";
	}
}
