Flyweight Pattern
==================

El patrón flyweight (peso-mosca) es un patrón de diseño estructural. 

En el patrón Flyweight, en lugar de crear grandes cantidades de objetos similares, los objetos se reutilizan. Esto se puede usar para reducir los requisitos de memoria y el tiempo de creación de instancias y los costos relacionados.

Las similitudes entre los objetos se almacenan dentro de los objetos, y las diferencias se mueven fuera de los objetos y se colocan en el código del cliente. Estas diferencias se transmiten a los objetos cuando es necesario a través de llamadas de método en los objetos.
 - Una interfaz Flyweight declara estos métodos. 
 - Una clase Concrete Flyweight implementa la interfaz Flyweight que se usa para realizar operaciones basadas en un estado externo y también almacena el estado común.
 - Una fábrica Flyweight se utiliza para crear y devolver objetos Flyweight.


Ejemplo:
---------
Ahora, veamos un ejemplo del patrón de diseño Flyweight. 

- Crearemos una interfaz Flyweight con un método *doMath()* que se usará para realizar una operación matemática en dos enteros pasados ​​como parámetros.
 - FlyweightAdder y FlyweightMultiuplier son clases concretas de la interfaz Flyweight.
 - FlyweightFactory es nuestra fábrica de flyweight. Utiliza el patrón singleton para que solo tengamos una instancia de fábrica para crear objetos flyweight...FlyweightAdder,FlyweightMultiplier... 

 
 
 
 