Factory Pattern
===============

Factory pattern is a creational pattern as this pattern provides better ways to create an object.

In Factory pattern, we create object without exposing the creation logic to the client.

Example
-------------------
In the following sections we will show how to use Factory Pattern to create objects.

The objects created by the factory pattern would be shape objects, such as Circle, Rectangle.

1. First we design an interface to represent Shape. (IShape)
2. Then we create concrete classes implementing the interface.(Rectangle implements IShape)
3. The core factory pattern is a Factory class. The following code shows how to create a Factory class for Shape objects.
The ShapeFactory class creates Shape object based on the String value passed in to the getShape() method. If the String value is CIRCLE, it will create a Circle object.(ShapeFactory)
4. The following code has main method and it uses the Factory class to get object of concrete class by passing an information such as type.(MainFactoryPatern)


Patrón Factory 
===============

El patrón de fábrica o Factoría (también conocido como patrón de método de fábrica) es un patrón de diseño creacional. 
Una factoría es una clase Java que se utiliza para encapsular código de creación de objetos. 
Una clase de factoría crea una instancia y devuelve un tipo particular de objeto en función de los datos pasados ​​a la factoría. Los diferentes tipos de objetos que se devuelven de una factoría suelen ser subclases de una clase principal común.

Los datos pasados ​​desde el código de llamada a la factoría se pueden pasar cuando se crea la factoría o cuando se llama al método de factoría para crear un objeto. Este método creacional a menudo se llama algo como getInstance o getClass.

Otros ejemplos
-------------------
Como ejemplo simple, tenemos una clase AnimalFactory que devolverá un objeto animal en función de la entrada de datos.
Para comenzar, aquí hay una clase de Animal abstracta. La fábrica devolverá una subclase instanciada de Animal.
Animal tiene un único método abstracto, makeSound().


Una fábrica también se puede usar junto con el patrón singleton. Es común que un singleton devuelva una instancia de fábrica. Para hacer esto, podríamos reemplazar:

```java
AnimalFactory animalFactory = new AnimalFactory();
```
Por
```java
AnimalFactory animalFactory = AnimalFactory.getAnimalFactoryInstance();
```

En este ejemplo, AnimalFactory.getAnimalFactoryInstance () se implementará para devolver un objeto estático de AnimalFactory. Esto da como resultado la creación de una instancia y el uso de una sola fábrica, en lugar de requerir la creación de una nueva fábrica cada vez que la fábrica necesita ser utilizada.
