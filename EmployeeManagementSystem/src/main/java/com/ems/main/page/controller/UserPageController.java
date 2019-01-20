package com.ems.main.page.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserPageController {
	
	@GetMapping("/welcome")
	public String startPage()
	{
		return "index";
	}

}
