Patrón de Proxy
================

El patrón proxy es un patrón de diseño estructural.

En el patrón proxy, una clase proxy se usa para controlar el acceso a otra clase. Las razones de este control pueden variar. Por ejemplo, un proxy puede evitar la creación de instancias de un objeto hasta que el objeto sea necesario. Esto puede ser útil si el objeto requiere mucho tiempo o recursos para crearse. Otra razón para usar un proxy es controlar los derechos de acceso a un objeto. Una solicitud del cliente puede requerir ciertas credenciales para acceder al objeto.

Ahora, veremos un ejemplo del patrón de proxy. 

- 1º) Crearemos una clase abstracta llamada Thing con un mensaje básico *sayHello()* que incluye la fecha/hora en que se muestra el mensaje.
- 2º) Creamos FastThing que será una subclase que extiende de Thing.
- 3º) Creamos SlowThing que será otra subclase que extiende de Thing, pero que su constructor tarda 5 segundos en ejecutarse.
- 4º) Creamos nuestra clase Proxy con dos objetos *proxy/slowThing* y un método *sayHello()* que utiliza el patrón singleton para que solo tengamos una instancia de slowThing y además invoca finalmente al método  *sayHello()* de SlowThing.
Solo se crearán objetos costosos de tipo SlowThing bajo demanda, al invocarse el método del proxy *sayHello()*.




 