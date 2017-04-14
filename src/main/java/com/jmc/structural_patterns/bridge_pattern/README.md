Bridge Pattern
===============

Bridge pattern decouples an definition from its implementation. It is a structural pattern.

This pattern involves an interface which acts as a bridge. The bridge makes the concrete classes independent from interface implementer classes.

El puente hace que las clases concretas (Circle) sean independientes de las clases implementadoras de interfaces.(BlackPrinter)
Both types of classes can be altered without affecting each other.

Example
----------

1. Create a interface Printer.(IPrinter)
2. Create concrete classes implement interfaces class.(ColorPrinter BlackPrinter implements Printer)
3. Create abstract class Shape, it work like Bridge.Constructor Shape receive IPrinte by parameter.
4. Circle class extends the abstract class Shape. Constructor for Circle defined with parameters and invoke to implicit super() constructor Shape(). Also, implement the method draw() from abstract class Shape inheritanced.
5. Finally, we can create any Shape independent from interface implemented in classes.
 
