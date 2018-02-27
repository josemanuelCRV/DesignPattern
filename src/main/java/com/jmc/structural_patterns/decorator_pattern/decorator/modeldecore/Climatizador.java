package com.jmc.structural_patterns.decorator_pattern.decorator.modeldecore;

import com.jmc.structural_patterns.decorator_pattern.decorator.AutoDecorator;
import com.jmc.structural_patterns.decorator_pattern.interfaces.IVendible;

public class Climatizador extends AutoDecorator{

	public Climatizador(IVendible iVend) {
		super(iVend);
	}

	public String getDescription() {
		return getVendible().getDescription() + " Climatizador, ";
	}

	public int getPrecio() {
		return getVendible().getPrecio() + 5500;
	}

}
