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
@Table(name = "designation")
@Data
public class Designation implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long dsId;
	private String name;
	@ManyToOne
	@JoinColumn(name="did",referencedColumnName="did")
	private Department department;
	@ManyToOne
	@JoinColumn(name="cid",referencedColumnName="cid")
	private Company company;
	
}
