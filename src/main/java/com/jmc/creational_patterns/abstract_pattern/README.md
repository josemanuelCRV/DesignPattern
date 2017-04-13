Abstract Factory Pattern
===============

Abstract Factory pattern is another creational pattern.

Abstract Factory patterns, also called as Factory of factories, have a factory which creates other factories.

When using Abstract Factory pattern, we first use super factory to create factory, then use the created factory to create objects.


Example
-------------------
The following code shows how to use abstract factory pattern.

We are going to create shapes and Printers. For shapes, we would have circle, rectangle and square. 
For printers we will have paper Printer, Web Printer and screen Printer.

1. For shape we will create Shape interface.(IShape)
2. Then we create concrete classes implementing the Shape interface.(Rectangle implements Shape)
3. After that we create an interface for Printers.(IPrinter)
4. Then we create concrete classes implementing the Printer interface.(PaperPrinter,WebPrinter,ScreenPrinter)
5. Finally we create an abstract class to get factories for Printer and Shape Objects.(AbstractFactory)
6. Finally we create Factory classes extending AbstractFactory to generate object of concrete class based on given information. (ShapeFactory extends AbstractFactory)
7. Create a Factory generator/producer class to get factories by passing an information such as Shape or Printer.(FactoryProducer)
8. The following code shows how to use the abstract factory patterns. (Main)