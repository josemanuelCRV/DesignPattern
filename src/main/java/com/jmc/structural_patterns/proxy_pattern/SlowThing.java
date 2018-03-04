package com.jmc.structural_patterns.proxy_pattern;

/**
 * SlowThing también es subclase de Thing. Sin embargo, su constructor tarda 5
 * segundos en ejecutarse.
 * 
 * @author josem
 *
 */
public class SlowThing extends Thing {

	public SlowThing() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
