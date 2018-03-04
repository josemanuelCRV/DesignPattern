Facade Pattern
================
El patrón de fachada es un patrón de diseño estructural. 

En el patrón de fachada, se usa una clase de fachada para proporcionar una interfaz única para un conjunto de clases. 

La fachada simplifica la interacción de un cliente con un sistema complejo al ubicar las interacciones en una única interfaz. Como resultado, el cliente puede interactuar con un solo objeto en lugar de tener que interactuar directamente de manera complicada con los objetos que componen el subsistema.

Ejemplo
--------
Como ejemplo, supongamos que tenemos tres clases horriblemente escritas. De acuerdo con los nombres de clases y métodos (y la falta de documentación), sería muy difícil para un cliente interactuar con estas clases.

La clase [](https://github.com/josemanuelCRV/DesignPattern/tree/master/src/main/java/com/jmc/structural_patterns/facade_pattern/facadeExample "Fachada") simplifica y expone al cliente los métodos para interactuar con las clases *Class1*, *Class2* y *Class3*.