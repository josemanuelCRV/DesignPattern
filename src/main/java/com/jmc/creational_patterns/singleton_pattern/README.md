Singleton Pattern
=================

Singleton pattern is a creational pattern.

This pattern involves only a single class which is responsible to creates its own object.

The class ensures that only single object get created.

This class provides a way to access its only object.

For example, when design a user interface, we may only have one main application windows. We can use the Singleton Pattern to ensure that there is only one instance of the MainApplicationWindow object.


Example
-------------------
* The following code is going to create a MainWindow class.

* MainWindow class have its constructor as private and have a static instance of itself.

* MainWindow class provides a static method to get its static instance to outside world.

* Main, our demo class will use MainWindow class to get a MainWindow object.



Patrón Singleton
=================
Un singleton es una clase que se instancia solo una vez. Esto se logra normalmente creando un campo estático en la clase que representa la clase. 

Existe un método estático en la clase para obtener la instancia de la clase y normalmente se denomina algo como getInstance(). 

La creación del objeto al que hace referencia el campo estático se puede realizar cuando la clase se inicializa o la primera vez que se llama a getInstance(). 

La clase singleton normalmente tiene un constructor privado para evitar que la clase singleton sea instanciada a través de un constructor. Por el contrario, la instancia del singleton se obtiene a través del método estático getInstance().

Otros ejemplos
-------------------
La clase SingletonExample es un ejemplo de una clase singleton típica. 
- Contiene un campo de SingletonExample estático privado. 
- Tiene un constructor privado para que la clase no pueda ser instanciada por clases externas. 
- Tiene un método público static getInstance() que devuelve la única instancia de SingletonExample. 
- Si esta instancia no existe, el método getInstance() la crea. 

La clase SingletonExample tiene un método público sayHello() que se puede usar para probar el singleton.

La clase DemoSingleton obtiene una clase singleton SingletonExample a través de la llamada al método estático SingletonExample.getInstance(). Llamamos al método de prueba sayHello() en la clase singleton. Al ejecutar la clase Demo, se emite "Hello" a la salida estándar.