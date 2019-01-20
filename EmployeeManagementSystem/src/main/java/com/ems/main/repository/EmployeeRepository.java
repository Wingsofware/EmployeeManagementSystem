package com.ems.main.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ems.main.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
	
	public List<Employee> findByDesignationDsId(long dsId);
	
	public List<Employee> findByDepartmentDid(long did);
	
	public List<Employee> findByCompanyCid(long cid);

}
