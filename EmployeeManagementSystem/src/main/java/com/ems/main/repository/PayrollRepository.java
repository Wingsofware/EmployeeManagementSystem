package com.ems.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ems.main.entity.Payroll;

public interface PayrollRepository extends JpaRepository<Payroll, Long> {

}
