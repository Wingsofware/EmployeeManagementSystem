package com.ems.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.ems.main.entity.Department;
import com.ems.main.entity.Designation;
import com.ems.main.service.CompanyService;

@RestController
@RequestMapping("/ems/user")
public class UserController {
	
	@Autowired
	private CompanyService companyService;
	
	@PostMapping("/addDepartment")
	public ModelAndView addDepartment(@ModelAttribute("department") Department department,BindingResult result)
	{
		ModelAndView mv=new ModelAndView();
		if(result.hasErrors())
		{
			mv.addObject("error",result);
			mv.setViewName("addDepartment");
		}
		else
		{	
			companyService.addDepartment(department);
			mv.addObject("success", department.getName()+" added successfully!!");
			mv.setViewName("addDepartment");
		}
		return mv;
	}
	
	@PostMapping("/updateDepartment")
	public ModelAndView updateDepartment(@ModelAttribute("department") Department department,BindingResult result)
	{
		ModelAndView mv=new ModelAndView();
		if(result.hasErrors())
		{
			mv.addObject("error",result);
			mv.setViewName("updateDepartment");
		}
		else
		{	
			companyService.updateDepartment(department);
			mv.addObject("success", department.getName()+" updated successfully!!");
			mv.setViewName("updateDepartment");
		}
		return mv;
	}

	@GetMapping("/getDepartment/{did}")
	public ModelAndView getDepartment(@PathVariable("did") long did)
	{
		ModelAndView mv=new ModelAndView();
		mv.addObject("department",companyService.getDepartment(did));
		mv.setViewName("updateDepartment");
		return mv;
	}
	
	@GetMapping("/getDepartmentsByCompany/{cid}")
	public List<Department> getDepartmentsByCompany(@PathVariable("cid") long cid)
	{
		return companyService.getDepartmentsByCompany(cid);
	}
	
	@PostMapping("/addDesignation")
	public ModelAndView addDesignation(@ModelAttribute("designation") Designation designation,BindingResult result)
	{
		ModelAndView mv=new ModelAndView();
		if(result.hasErrors())
		{
			mv.addObject("error",result);
			mv.setViewName("addDesignation");
		}
		else
		{	
			companyService.addDesignation(designation);
			mv.addObject("success", designation.getName()+" added successfully!!");
			mv.setViewName("addDesignation");
		}
		return mv;
	}
	
	@PostMapping("/updateDesignation")
	public ModelAndView updateDesignation(@ModelAttribute("designation") Designation designation,BindingResult result)
	{
		ModelAndView mv=new ModelAndView();
		if(result.hasErrors())
		{
			mv.addObject("error",result);
			mv.setViewName("updateDesignation");
		}
		else
		{	
			companyService.updateDesignation(designation);
			mv.addObject("success", designation.getName()+" updated successfully!!");
			mv.setViewName("updateDesignation");
		}
		return mv;
	}

	@GetMapping("/getDesignation/{dsId}")
	public ModelAndView getDesignation(@PathVariable("dsId") long dsId)
	{
		ModelAndView mv=new ModelAndView();
		mv.addObject("designation",companyService.getDesignation(dsId));
		mv.setViewName("updateDesignation");
		return mv;
	}
	
	@GetMapping("/getDesignationsByDepartment/{did}")
	public List<Designation> getDesignationsByDepartment(@PathVariable("did") long did)
	{
		return companyService.getDesignationsByDepartment(did);
	}
	
	@GetMapping("/getDesignationsByCompany/{did}")
	public List<Designation> getDesignationsByCompany(@PathVariable("cid") long cid)
	{
		return companyService.getDesignationsByCompany(cid);
	}
	
}
