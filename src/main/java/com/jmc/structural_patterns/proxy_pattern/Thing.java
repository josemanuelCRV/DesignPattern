package com.jmc.structural_patterns.proxy_pattern;

import java.util.Date;

public abstract class Thing {

	public void sayHello() {
		System.out.println(this.getClass().getSimpleName() + " says howdy at " + new Date());
	}
}
