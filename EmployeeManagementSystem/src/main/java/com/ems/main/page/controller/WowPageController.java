package com.ems.main.page.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ems/wow")
public class WowPageController {
	
	@GetMapping("/addCompany.htm")
	public String registerCompany()
	{
		return "addCompany";
	}

}
