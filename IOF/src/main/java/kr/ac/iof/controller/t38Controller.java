package kr.ac.iof.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class t38Controller {
	
	
	@RequestMapping(value = "/s38t", method = RequestMethod.GET)//��鍮��� �몄�
	public String t38() throws Exception {
		

		return "s38t";
	}
}
