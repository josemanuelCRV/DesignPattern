package com.jmc.structural_patterns.decorator_pattern.decorator;

import com.jmc.structural_patterns.decorator_pattern.interfaces.IVendible;

public abstract class AutoDecorator implements IVendible {

	private IVendible vendible;

	public AutoDecorator(IVendible iVend) {
		this.vendible = iVend;
	}

	// setters&getters
	public IVendible getVendible() {
		return vendible;
	}

	public void setVendible(IVendible vendible) {
		this.vendible = vendible;
	}

	
	
}
