package com.springboot.akshata.Application1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class Application1Controller {
	
	@RequestMapping("/")
	public String goToHome() {
		return "index";
	
	}

}
