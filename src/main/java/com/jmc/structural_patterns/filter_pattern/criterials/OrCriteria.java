package com.jmc.structural_patterns.filter_pattern.criterials;

import java.util.List;

import com.jmc.structural_patterns.filter_pattern.interfaces.ICriteria;
import com.jmc.structural_patterns.filter_pattern.models.Employee;

public class OrCriteria implements ICriteria {

	private ICriteria criteria;
	private ICriteria otherCriteria;

	// Constructor using fields
	public OrCriteria(ICriteria criteria, ICriteria otherCriteria) {
		super();
		this.criteria = criteria;
		this.otherCriteria = otherCriteria;
	}

	
	public List<Employee> meetCriteria(List<Employee> persons) {
		
		List<Employee> firstCriteriaItems = criteria.meetCriteria(persons);
		List<Employee> otherCriteriaItems = otherCriteria.meetCriteria(persons);

		for (Employee person : otherCriteriaItems) {
			if (!firstCriteriaItems.contains(person)) {
				firstCriteriaItems.add(person);		
			}
		}
		return firstCriteriaItems;
	}

}
