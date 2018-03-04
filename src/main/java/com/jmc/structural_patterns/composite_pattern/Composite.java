package com.jmc.structural_patterns.composite_pattern;

import java.util.ArrayList;
import java.util.List;

/**
 * La clase compuesta implementa la interfaz del componente. Implementa los
 * métodos sayHello() y sayGoodbye() llamando a estos mismos métodos en todos
 * sus elementos secundarios, que son Componentes (ya que pueden ser tanto
 * objetos Hoja como Compuesto, que implementan la interfaz Componente).
 *
 */
public class Composite implements Component {

	List<Component> components = new ArrayList<Component>();

	public void sayHello() {
		for (Component component : components) {
			component.sayHello();
		}
	}

	public void sayGoodbye() {
		for (Component component : components) {
			component.sayGoodbye();
		}
	}

	
	public void add(Component component) {
		components.add(component);
	}

	public void remove(Component component) {
		components.remove(component);
	}

	public List<Component> getComponents() {
		return components;
	}

	public Component getComponent(int index) {
		return components.get(index);
	}

}
