package com.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class HomeController {
	
	@Value("${pageController.msg}")
	private String pageControllerMsg;
	
	@RequestMapping("/")
	public String home(){
		return pageControllerMsg;
	}

}
