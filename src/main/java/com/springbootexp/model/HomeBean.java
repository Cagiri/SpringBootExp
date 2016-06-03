package com.springbootexp.model;

import java.io.Serializable;

import org.springframework.web.bind.annotation.ControllerAdvice;

@ControllerAdvice
public class HomeBean implements Serializable{

	private static final long serialVersionUID = 2314538258770716569L;

	public HomeBean() {
		name = "Example Main Page...";
	}
	
	private String name = "Example Main Page...";

	public void setName(String name_) {
		this.name = name_;
	}

	public String getName() {
		return this.name;
	}
}
