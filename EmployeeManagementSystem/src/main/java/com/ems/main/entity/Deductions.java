package com.ems.main.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="deduction")
@Data
public class Deductions implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long dedId;
	private String date;
	@ManyToOne
	@JoinColumn(name="eid",referencedColumnName="eid")
	private Employee employee;
	@ManyToOne
	@JoinColumn(name="cid",referencedColumnName="cid")
	private Company company;
	private Double pf;

}
