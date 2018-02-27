package com.jmc.structural_patterns.decorator_pattern.interfaces.impl.ModelsAutos;

import com.jmc.structural_patterns.decorator_pattern.interfaces.impl.AutoImpl;

/**
 * Bien, hasta aquí clases comunes de negocio: una interface {@link IVendible} que implementa la
 * clase {@link AutoImpl} y dos tipos de Auto {@link Ferrari} y {@link Porsche}.
 * 
 * Ahora veremos en que consiste el Decorator y los decoradores:
 * @see com.jmc.structural_patterns.decorator_pattern.decorator.AutoDecorator
 *
 */
public class Porsche extends AutoImpl{

	
	public String getDescription() {

		return "Porsche Carrera 4s, ";
	}

	public int getPrecio() {

		return 137834;
	}

}
