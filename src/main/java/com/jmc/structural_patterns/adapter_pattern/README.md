Adapter Pattern
===============

We use the adapter in real life a lot. For example, we use a memory card adapter to connect a memory card and a computer since the computer only support one type of memory card and our card is not compatible with the computer.

Adapter is a converter between two incompatible entities. Adapter pattern is a structural pattern.

In Java design pattern, Adapter pattern works as a bridge between two incompatible interfaces.

By using the adapter pattern we can unify the two incompatible interfaces.

Example
----------


1. First we create a Player interface to play any time of media files.
2. Create AudioInterfaces and VideoInterfaces with play method for each one.
2. MyPlayer is the adapter, it unifies the interface of playing media files.
