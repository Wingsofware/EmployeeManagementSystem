package com.ems.main.entity;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Scope("session")
@Data
public class User {
	
	private String name;
	private String company;

}
