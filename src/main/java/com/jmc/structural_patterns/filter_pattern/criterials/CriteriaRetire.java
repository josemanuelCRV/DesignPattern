package com.jmc.structural_patterns.filter_pattern.criterials;

import java.util.ArrayList;
import java.util.List;

import com.jmc.structural_patterns.filter_pattern.interfaces.ICriteria;
import com.jmc.structural_patterns.filter_pattern.models.Employee;

public class CriteriaRetire implements ICriteria {

	List<Employee> singlePersons = new ArrayList<Employee>();

	public List<Employee> meetCriteria(List<Employee> persons) {

		for (Employee person : persons) {

			if (person.getRetireStatus().equalsIgnoreCase("YES")) {
				singlePersons.add(person);
			}

		}

		return singlePersons;
	}

}
