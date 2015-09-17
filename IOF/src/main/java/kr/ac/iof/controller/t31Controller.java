package kr.ac.iof.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class t31Controller {
	
	
	@RequestMapping(value = "/s31t", method = RequestMethod.GET)//��鍮��� �몄�
	public String t31() throws Exception {
		

		return "s31t";
	}
}
