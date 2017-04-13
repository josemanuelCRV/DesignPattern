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