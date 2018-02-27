package com.jmc.structural_patterns.decorator_pattern.decorator.modeldecore;

import com.jmc.structural_patterns.decorator_pattern.decorator.AutoDecorator;
import com.jmc.structural_patterns.decorator_pattern.interfaces.IVendible;

public class TechoSolar extends AutoDecorator{

	public TechoSolar(IVendible iVend) {
		super(iVend);
	}

	public String getDescription() {
		return getVendible().getDescription() + " Techo solar polarizado y panorámico, ";
	}

	public int getPrecio() {
		return getVendible().getPrecio() + 4600;
	}

}
