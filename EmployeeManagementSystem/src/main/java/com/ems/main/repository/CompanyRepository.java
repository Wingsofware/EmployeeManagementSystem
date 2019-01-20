package com.ems.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ems.main.entity.Company;

public interface CompanyRepository extends JpaRepository<Company, Long> {

}
