package com.ems.main.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ems.main.entity.Department;
import com.ems.main.entity.Designation;
import com.ems.main.service.CompanyService;

@RestController
@RequestMapping("/ems/rest/user")
public class UserRestController {
	
	@Autowired
	private CompanyService companyService;
	
	@PostMapping("/addDepartment")
	public Department addDepartment(@ModelAttribute("department") Department department,BindingResult result)
	{
		return companyService.addDepartment(department);
	}
	
	@PostMapping("/updateDepartment")
	public Department updateDepartment(@ModelAttribute("department") Department department)
	{
		return companyService.updateDepartment(department);
	}

	@GetMapping("/getDepartment/{did}")
	public Department getDepartment(@PathVariable("did") long did)
	{
		return companyService.getDepartment(did);
	}
	
	@GetMapping("/getDepartmentsByCompany/{cid}")
	public List<Department> getDepartmentsByCompanyCid(@PathVariable("cid") long cid)
	{
		return companyService.getDepartmentsByCompany(cid);
	}
	
	@GetMapping("/getDepartmentsByCompany")
	public List<Department> getDepartmentsByCompany()
	{
		long cid=1;
		return companyService.getDepartmentsByCompany(cid);
	}
	
	@PostMapping("/addDesignation")
	public Designation addDesignation(@ModelAttribute("designation") Designation designation)
	{
		return companyService.addDesignation(designation);
	}
	
	@PostMapping("/updateDesignation")
	public Designation updateDesignation(@ModelAttribute("designation") Designation designation)
	{
		return companyService.updateDesignation(designation);
	}

	@GetMapping("/getDesignation/{dsId}")
	public Designation getDesignation(@PathVariable("dsId") long dsId)
	{
		return companyService.getDesignation(dsId);
	}
	
	@GetMapping("/getDesignationsByDepartment/{did}")
	public List<Designation> getDesignationsByDepartment(@PathVariable("did") long did)
	{
		return companyService.getDesignationsByDepartment(did);
	}
	
	@GetMapping("/getDesignationsByCompany/{cid}")
	public List<Designation> getDesignationsByCompany(@PathVariable("cid") long cid)
	{
		return companyService.getDesignationsByCompany(cid);
	}

}
