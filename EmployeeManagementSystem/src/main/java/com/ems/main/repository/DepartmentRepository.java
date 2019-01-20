package com.ems.main.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ems.main.entity.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
	
	public List<Department> findByCompanyCid(long cid);

}
