package com.jmc.structural_patterns.filter_pattern.models;

public class Employee {

	private String name;
	private String gender;
	private String retireStatus;

	public Employee(String name, String gender, String retireStatus) {
		super();
		this.name = name;
		this.gender = gender;
		this.retireStatus = retireStatus;
	}

	public String getName() {
		return name;
	}

	public String getGender() {
		return gender;
	}

	public String getRetireStatus() {
		return retireStatus;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", gender=" + gender + ", retireStatus=" + retireStatus + "]";
	}

	
	
	
}
