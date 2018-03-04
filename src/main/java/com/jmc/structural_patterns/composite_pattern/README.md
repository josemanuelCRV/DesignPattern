Patrón Compuesto
===================
El patrón compuesto es un patrón de diseño estructural. 

En el patrón Composite, existe una estructura de árbol donde se pueden realizar operaciones idénticas en hojas y nodos. 

- Un nodo en un árbol es una clase que puede tener hijos. Una clase de nodo es una clase 'compuesta'. 

- Una hoja en un árbol es una clase "primitiva" que no tiene hijos. 

- Los hijos de un compuesto pueden ser hojas u otros materiales compuestos.

La clase hoja y la clase compuesta comparten una interfaz común 'componente' que define las operaciones comunes que se pueden realizar en hojas y compuestos. Cuando se realiza una operación en un compuesto, esta operación se realiza en todos los elementos secundarios del compuesto, ya sean hojas o compuestos. Por lo tanto, el patrón compuesto se puede usar para realizar operaciones comunes en los objetos que componen un árbol.

La descripción del patrón Composite define la interacción del cliente con la estructura del árbol a través de una interfaz de componente, donde esta interfaz incluye las operaciones comunes en las clases compuestas y hoja, y las operaciones add / remove / get en los compuestos del árbol. 

Esto parece un poco incómodo ya que una hoja no implementa las operaciones add / remove / get. Quizá, en Java tiene más sentido definir las operaciones comunes de hoja / compuesto en una interfaz Componente, pero colocar las operaciones compuestas add / remove / get en una interfaz separada o simplemente implementarlas en la clase compuesta.

Ejemplo
--------
Ahora veremos un ejemplo del patrón compuesto. 

Primero, declararemos una interfaz de componente que declara las operaciones que son comunes para la clase compuesta y la clase hoja. Esto nos permite realizar operaciones en materiales compuestos y deja de usar una interfaz estándar.


<p>
<img src="https://upload.wikimedia.org/wikipedia/commons/thumb/5/5a/Composite_UML_class_diagram_%28fixed%29.svg/600px-Composite_UML_class_diagram_%28fixed%29.svg.png">UML Composite Pattern</img>
</p>