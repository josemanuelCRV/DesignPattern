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