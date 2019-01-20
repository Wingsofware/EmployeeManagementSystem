package com.ems.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ems.main.entity.Company;
import com.ems.main.entity.Department;
import com.ems.main.entity.Designation;
import com.ems.main.entity.Employee;
import com.ems.main.repository.CompanyRepository;
import com.ems.main.repository.DepartmentRepository;
import com.ems.main.repository.DesignationRepository;
import com.ems.main.repository.EmployeeRepository;

@Service
public class CompanyService {
	
	@Autowired
	private CompanyRepository companyRepository;
	@Autowired
	private DepartmentRepository departmentRepository;
	@Autowired
	private DesignationRepository designationRepository;
	@Autowired
	private EmployeeRepository employeeRepository;
	
	public Company addCompany(Company company)
	{
		return companyRepository.save(company);
	}
	public Company updateCompany(Company company)
	{
		return companyRepository.saveAndFlush(company);
	}
	public Company getCompany(long cid)
	{
		return companyRepository.findById(cid).get();
	}
	public List<Company> getCompanies()
	{
		return companyRepository.findAll();
	}
	
	public void deleteCompany(long cid)
	{
		companyRepository.deleteById(cid);
	}
	
	public Department addDepartment(Department department) {
		
		return departmentRepository.save(department);
	}
	
	public Department updateDepartment(Department department) {
		
		return departmentRepository.saveAndFlush(department);
	}
	
	public Department getDepartment(long did) {
		
		return departmentRepository.findById(did).get();
	}
	
	public List<Department> getDepartmentsByCompany(long cid) {
		return departmentRepository.findByCompanyCid(cid);
	}
	
	public void deleteDepartment(long did)
	{
		departmentRepository.deleteById(did);
	}
	
	public Designation addDesignation(Designation designation) {
		
		return designationRepository.save(designation);
	}
	
	public Designation updateDesignation(Designation designation) {
		
		return designationRepository.saveAndFlush(designation);
	}
	
	public Designation getDesignation(long dsId) {
		
		return designationRepository.findById(dsId).get();
	}
	
	public List<Designation> getDesignationsByDepartment(long did) {
		return designationRepository.findByDepartmentDid(did);
	}
	
	public List<Designation> getDesignationsByCompany(long cid) {
		return designationRepository.findByCompanyCid(cid);
	}
	
	public void deleteDesignation(long did)
	{
		designationRepository.deleteById(did);
	}
	
	public Employee addEmployee(Employee employee)
	{
		return employeeRepository.save(employee);
	}
	public Employee updateEmployee(Employee employee)
	{
		return employeeRepository.saveAndFlush(employee);
	}
	public Employee getEmployee(long eid)
	{
		return employeeRepository.findById(eid).get();
	}
	public List<Employee> getEmployeesByDesignation(long dsId)
	{
		return employeeRepository.findByDesignationDsId(dsId);
	}
	
	public List<Employee> getEmployeesByDepartment(long did)
	{
		return employeeRepository.findByDesignationDsId(did);
	}
	
	public List<Employee> getEmployeesByCompany(long cid)
	{
		return employeeRepository.findByDesignationDsId(cid);
	}
	
	public void deleteEmployee(long cid)
	{
		employeeRepository.deleteById(cid);
	}
}
