package kr.ac.iof.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class t37Controller {
	
	
	@RequestMapping(value = "/s37t", method = RequestMethod.GET)//��鍮��� �몄�
	public String t37() throws Exception {
		

		return "s37t";
	}
}
