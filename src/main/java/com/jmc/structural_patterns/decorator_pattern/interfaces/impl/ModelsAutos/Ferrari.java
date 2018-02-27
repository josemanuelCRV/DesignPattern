package com.jmc.structural_patterns.decorator_pattern.interfaces.impl.ModelsAutos;

import com.jmc.structural_patterns.decorator_pattern.interfaces.impl.AutoImpl;

public class Ferrari extends AutoImpl{

	public String getDescription() {

		return "Ferrari Maranello, ";
	}

	public int getPrecio() {
		return 219587;
	}

}
