Decorator Pattern
=================

Decorator pattern adds new functionality an existing object without chaining its structure.

It is a structural pattern as it acts as a wrapper to existing class.

Decorator pattern creates a decorator class to wrap the original class and provides additional functionality.

Example
--------
1. Component: define la interface de los objetos a los que se les pueden adicionar responsabilidades dinámicamente.
2. ComponenteConcreteo: define el objeto al que se le puede adicionar una responsabilidad.
3. Decorator: mantiene una referencia al objeto Component y define una interface de acuerdo con la interface de Component.
4. DecoratorConcreto: adiciona la responsabilidad al Component.
5. Decorator propaga los mensajes a su objeto Component. Opcionalmente puede realizar operaciones antes y después de enviar el mensaje.

<p>
<img src="https://upload.wikimedia.org/wikipedia/commons/thumb/e/e9/Decorator_UML_class_diagram.svg/400px-Decorator_UML_class_diagram.svg.png">UML Decorator Pattern</img>
</p>

