package com.ems.main.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ems.main.entity.Designation;

public interface DesignationRepository extends JpaRepository<Designation, Long> {
	
	public List<Designation> findByDepartmentDid(long did);
	
	public List<Designation> findByCompanyCid(long did);

}
