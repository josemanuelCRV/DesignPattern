package com.jmc.structural_patterns.decorator_pattern.decorator.modeldecore;

import com.jmc.structural_patterns.decorator_pattern.decorator.AutoDecorator;
import com.jmc.structural_patterns.decorator_pattern.interfaces.IVendible;

public class GpsModule extends AutoDecorator{

	public GpsModule(IVendible iVend) {
		super(iVend);
	}

	public String getDescription() {
		return getVendible().getDescription() + " GPS Premium Position Service,";
	}

	public int getPrecio() {
		return getVendible().getPrecio() + 4800;
	}

}
