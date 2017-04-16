package com.jmc.structural_patterns.filter_pattern.criterials;

import java.util.List;

import com.jmc.structural_patterns.filter_pattern.interfaces.ICriteria;
import com.jmc.structural_patterns.filter_pattern.models.Employee;

public class AndCriteria implements ICriteria {

	private ICriteria criteria;
	private ICriteria otherCriteria;

	// constructor class using fields
	public AndCriteria(ICriteria criteria, ICriteria otherCriteria) {
		super();
		this.criteria = criteria;
		this.otherCriteria = otherCriteria;
	}

	public List<Employee> meetCriteria(List<Employee> persons) {
		List<Employee> firstCriteriaPersons = criteria.meetCriteria(persons);
		return otherCriteria.meetCriteria(firstCriteriaPersons);
	}
}
