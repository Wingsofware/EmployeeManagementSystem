package com.ems.main.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="payroll")
@Data
public class Payroll implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long pid;
	private String date;
	private Double netAmount;
	private boolean paid;
	@ManyToOne
	@JoinColumn(name="eid",referencedColumnName="eid")
	private Employee employee;
	@ManyToOne
	@JoinColumn(name="cid",referencedColumnName="cid")
	private Company company;
	@OneToOne
	@JoinColumn(name="dedId",referencedColumnName="dedId")
	private Deductions deductions;
	@OneToOne
	@JoinColumn(name="benId",referencedColumnName="benId")
	private Benefits benefits;
	
}
