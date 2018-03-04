Prototype Pattern
==================

Prototype pattern is one of the creational patterns.

Prototype pattern helps create duplicate object with better performance.

In Prototype Pattern a clone of an existing object is returned instead of creating new one.

We use Prototype Design Pattern, if the cost of creating a new object is expensive and resource intensive.

Example
-----------
The following code shows how to use Prototype Pattern to create objects.

1. First it create a Shape abstract class which implements the Cloneable interface. (Shape implements Cloneable)
2. Then it creates three concrete classes extending the Shape class.(Rectangle extends Shape)
3. After that it creates a ShapeProtoType class to return the prototype of shapes.(ShapeProtoType)


Patrón Prototype
=================

El patrón de prototipo es un patrón de diseño creacional. 

En el patrón de prototipo crea un nuevo objeto clonando un objeto existente. En Java, el método ´clone()´ es una implementación de este patrón de diseño. El patrón de prototipo puede ser una forma útil de crear copias de objetos. 

Un ejemplo de cómo puede ser útil es si un objeto original se crea con un recurso tal como un flujo de datos que puede no estar disponible en el momento en que se necesita un clon del objeto. 

Otro ejemplo es si la creación del objeto original implica un compromiso de tiempo significativo, como leer datos de una base de datos o sobre una red. Un beneficio adicional del patrón prototipo es que puede reducir la proliferación de clases en un proyecto al evitar la proliferación de fábricas.

Normalmente en Java, si desea utilizar la clonación (es decir, el patrón prototipo), puede utilizar el método ´clone()´ y la interfaz Cloneable. Por defecto, ´clone()´ realiza una copia superficial. En otro tutorial , demostramos cómo se puede usar Serializable para simplificar la copia profunda.

Sin embargo, podemos implementar nuestro propio patrón de prototipo. Para hacerlo, crearemos una interfaz de Prototipo que cuenta con un método doClone().


