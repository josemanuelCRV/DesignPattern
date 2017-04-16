package com.jmc.creational_patterns.prototype_pattern.models;

/**
 * First it create a Shape abstract class which implements the Cloneable
 * interface.
 */
public abstract class Shape implements Cloneable {

	private String id;
	protected String type;

	abstract void draw();

	public String getType() {
		return type;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Object clone() {
		Object clone = null;
		try {
			clone = super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return clone;
	}

}
