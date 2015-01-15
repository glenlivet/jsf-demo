package org.ikgroup.controller;

import java.io.Serializable;

import javax.inject.Named;

import org.springframework.context.annotation.Scope;

@Named
@Scope("session")
public class HelloBean implements Serializable {
	
	private static final long serialVersionUID = 8587749574409590389L;
	
	private String name = "world";
 
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
