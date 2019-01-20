package com.ems.main.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="department")
@Data
public class Department implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long did;
	private String name;
	@ManyToOne
	@JoinColumn(name="cid",referencedColumnName="cid")
	private Company company;
	@OneToMany(mappedBy="department")
	private List<Designation> designation;

}
