package com.jmc.structural_patterns.filter_pattern.interfaces;

import java.util.List;

import com.jmc.structural_patterns.filter_pattern.models.Employee;

public interface ICriteria {
	
	public List<Employee> meetCriteria(List<Employee> persons);

}
