package com.ems.main.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ems.main.entity.Company;
import com.ems.main.service.CompanyService;

@RestController
@RequestMapping("/ems/rest/wow")
public class WowRestController {
	
	@Autowired
	private CompanyService companyService;
	
	@GetMapping("/getAllCompanies")
	public List<Company> getAllCompanies()
	{
		return companyService.getCompanies();
	}

}
