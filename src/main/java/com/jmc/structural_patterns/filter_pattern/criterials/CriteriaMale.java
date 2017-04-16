package com.jmc.structural_patterns.filter_pattern.criterials;

import java.util.ArrayList;
import java.util.List;

import com.jmc.structural_patterns.filter_pattern.interfaces.ICriteria;
import com.jmc.structural_patterns.filter_pattern.models.Employee;

public class CriteriaMale implements ICriteria {

	public List<Employee> meetCriteria(List<Employee> persons) {
		List<Employee> malePersons = new ArrayList<Employee>();

		for (Employee person : persons) {
			
			if (person.getGender().equalsIgnoreCase("Male")) {
				malePersons.add(person);
			}
		}

		return malePersons;
	}
	

}
