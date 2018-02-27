package com.jmc.structural_patterns.decorator_pattern.interfaces;

/**
 * 
 * <b>Component:</b> define la interface de los objetos a los que se les pueden
 * adicionar responsabilidades dinámicamente.</br></br>
 * 
 * <b>ComponenteConcreteo:</b> define el objeto al que se le puede adicionar una
 * responsabilidad.</br></br>
 * 
 * <b>Decorator:</b> mantiene una referencia al objeto Component y define una interface
 * de acuerdo con la interface de Component.</br></br>
 * 
 * <b>DecoratorConcreto:</b> adiciona la responsabilidad al Component.</br></br>
 * 
 * <i>Decorator propaga los mensajes a su objeto Component. Opcionalmente puede
 * realizar operaciones antes y después de enviar el mensaje.</i></br></br>
 * 
 * 
 * Ejemplo:</br>
 * Imaginemos que vendemos automóviles y el cliente puede opcionalmente
 * adicionar ciertos componentes (climatizador, GPS, Techo solar, etc).</br>Por cada
 * componente que se adiciona, el precio varía.
 * 
 *
 */
public interface IVendible {

	public String getDescription();

	public int getPrecio();

}
