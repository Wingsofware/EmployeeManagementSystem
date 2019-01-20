package com.ems.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ems.main.entity.Attendance;

public interface AttendanceRepository extends JpaRepository<Attendance, Long> {

}
