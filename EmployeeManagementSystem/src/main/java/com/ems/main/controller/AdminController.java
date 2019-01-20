package com.ems.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ems.main.entity.User;
import com.ems.main.service.CompanyService;

@Controller
@Scope("session")
public class AdminController {
	
	@Autowired
	private CompanyService companyService;
	@Autowired
	private User user;

	@GetMapping("/user/admin/index")
	public String indexPage()
	{
		return "index";
	}
	
	@RequestMapping("/welcome")
	public ModelAndView welcomePage()
	{
		ModelAndView mv=new ModelAndView();
		mv.setViewName("welcome");
		return mv;
	}
	
	
	
}
