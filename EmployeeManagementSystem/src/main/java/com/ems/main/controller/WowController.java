package com.ems.main.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import com.ems.main.entity.Company;
import com.ems.main.entity.User;
import com.ems.main.service.CompanyService;

@RestController
@RequestMapping("/ems/wow")
@Scope("session")
public class WowController {
	
	@Autowired
	private CompanyService companyService;
	
	@Autowired
	private User user;

	@PostMapping("/addCompany")
	public ModelAndView addCompany(@ModelAttribute("company") Company company,BindingResult result)
	{
		ModelAndView mv=new ModelAndView();
		if(result.hasErrors())
		{
			mv.addObject("error",result);
			mv.setViewName("addCompany");
		}
		else
		{	
			companyService.addCompany(company);
			mv.addObject("success", company.getName()+" added successfully!!");
			mv.setViewName("addCompany");
		}
		return mv;
	}
	
	@PostMapping("/updateCompany")
	public ModelAndView updateCompany(@ModelAttribute("company") Company company,BindingResult result)
	{
		ModelAndView mv=new ModelAndView();
		if(result.hasErrors())
		{
			mv.addObject("error",result);
			mv.setViewName("updateCompany");
		}
		else
		{
			companyService.addCompany(company);
			mv.addObject("success", company.getName()+" updated successfully!!");
			mv.setViewName("updateCompany");
		}
		return mv;
	}
	
	@GetMapping("/getCompany/{cid}")
	public ModelAndView getCompany(@PathVariable("cid") long cid)
	{
		ModelAndView mv=new ModelAndView();
		mv.addObject("company",companyService.getCompany(cid));
		mv.setViewName("updateCompany");
		return mv;
	}
	
	@GetMapping("/getCompanies")
	public ModelAndView getCompanies()
	{
		ModelAndView mv=new ModelAndView();
		mv.addObject("company",companyService.getCompanies());
		mv.setViewName("companies");
		return mv;
	}
	
	@GetMapping("/deleteCompany/{cid}")
	public ModelAndView deleteCompany(@PathVariable("cid") long cid)
	{
		ModelAndView mv=new ModelAndView();
		companyService.deleteCompany(cid);
		mv.setViewName("companies");
		return mv;
	}
	
}
