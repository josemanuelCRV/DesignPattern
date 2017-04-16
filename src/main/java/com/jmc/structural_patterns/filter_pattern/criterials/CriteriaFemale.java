package com.jmc.structural_patterns.filter_pattern.criterials;

import java.util.ArrayList;
import java.util.List;

import com.jmc.structural_patterns.filter_pattern.interfaces.ICriteria;
import com.jmc.structural_patterns.filter_pattern.models.Employee;

public class CriteriaFemale implements ICriteria {

	List<Employee> femalePersons = new ArrayList<Employee>();

	public List<Employee> meetCriteria(List<Employee> persons) {

		for (Employee person : persons) {
			if (person.getGender().equalsIgnoreCase("Female")) {
				femalePersons.add(person);
			}
		}

		return femalePersons;
	}

}
