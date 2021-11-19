# 📝 Design-Pattern-Java-notes

## Introduction : what is design patterns ?

> In software engineering, a software design pattern is a general, reusable solution to a commonly occurring problem within a given context in software design. -Wikipedia

A Design Pattern is not a code that is ready to be used in your application, but it is a model that we can use to solve a problem,Good design patterns help make your software more flexible and reusable , They can be applied to any laguage that supports object-orientation.

## Gang of four (GOF)

In the year of 1995, four developers, Erich Gamma, Richard Helm, Ralph Johnson and John Vlissides, also known as ‘Gang of Four’ (GoF), published the book ‘Design Patterns: Elements of Reusable Object-Oriented Software’, and they introduced the concept of patterns, introducing 23 patterns of design. Those patterns from Gang of Four (GoF), are generally considered the foundation for all other patterns, and they are categorized into three groups:

- [Creational](./patterns/creational-patterns/README.md) — provide object creation mechanisms that increase flexibility and reuse of existing code.
- [Structural](./patterns/structural-patterns/README.md)— explain how to assemble objects and classes into larger structures, while keeping the structures flexible and efficient.
- [Behavioral](./patterns/behavioral-patterns/README.md) — take care of effective communication and the assignment of responsibilities between objects.

## The elements of a design pattern

The four essential elements of a design patter :

- A name — describe a design problem, the solution and the consequences.
- The problem — The context to apply the pattern.
- The solution — The elements that make up the design, the relationships, the responsibilities and collaborations.
- The consequences — The results of applying the pattern.

## The 23 patterns from the book

- [Creation Pattern](./patterns/creational-patterns/README.md)
  - [Abstract Factory](./patterns/creational-patterns/Abstract-Factory) — Provide an interface for creating families of related or dependent objects without specifying their concrete classes.
  - [Builder](./patterns/creational-patterns/Builder) — Separate the construction of a complex object from its representation so that the same construction process can create different representations.
  - [Factory Method](./patterns/creational-patterns/Factory-Method) — Define an interface for creating an object, but let subclasses decide which class to instantiate. Factory Method lets a class defer instantiation to subclasses.
  - [Prototype](./patterns/creational-patterns/Prototype) — Specify the kinds of objects to create using a prototypical instance, and create new objects by copying this prototype.
  - [Singleton](./patterns/creational-patterns/Singleton) — Ensure a class only has one instance, and provide a global point of access to it.
- [Structural Pattern](./patterns/structural-patterns/README.md)
  - [Adapter](./patterns/structural-patterns/Adapter) — Convert the interface of a class into another interface clients expect. Adapter lets classes work together that couldn’t otherwise because of incompatible interfaces.
  - [Bridge](./patterns/structural-patterns/Bridge) — Decouple an abstraction from its implementation so that the two can vary independently.
  - Composite — Compose objects into tree structures to represent part-wholehierarchies. Composite lets clients treat individual objects and compositions of objects uniformly.
  - [Decorator](./patterns/structural-patterns/Decorator) — Attach additional responsibilities to an object dynamically. Decorators provide a flexible alternative to subclassing for extending functionality.
  - Facade — Provide a unified interface to a set of interfaces in a subsystem. Facade defines a higher-level interface that makes the subsystem easier to use.
  - Flyweight — Use sharing to support large numbers of fine-grained objects
    efficiently.
  - Proxy — Provide a surrogate or placeholder for another object to control access to it.
- [Behavioral Pattern](./patterns/behavioral-patterns/README.md)
  - [Chain of Responsibility](./patterns/behavioral-patterns/Chain-of-Responsibility) — Avoid coupling the sender of a request to its receiver by giving more than one object a chance to handle the request. Chain the receiving objects and pass the request along the chain until an object handles it.
  - [Command](./patterns/behavioral-patterns/Command) — Encapsulate a request as an object, thereby letting you parameterized clients with different requests, queue or log requests, and support undoable operations.
  - Interpreter — Given a language, define a represention for its grammar along with an interpreter that uses the representation to interpret sentences in the language.
  - Iterator — Provide a way to access the elements of an aggregate object sequentially without exposing its underlying representation.
  - Mediator — Define an object that encapsulates how a set of objects interact. Mediator promotes loose coupling by keeping objects from referring to each other explicitly, and it lets you vary their interaction independently.
  - Memento — Without violating encapsulation, capture and externalize an object’s internal state so that the object can be restored to this state later.
  - [Observer](./patterns/behavioral-patterns/Observer) — Define a one-to-many dependency between objects so that when one object changes state, all its dependents are notified and updated automatically.
  - [State](./patterns/behavioral-patterns/State) — Allow an object to alter its behavior when its internal state changes. The object will appear to change its class.
  - [Strategy](./patterns/behavioral-patterns/Strategy) — Define a family of algorithms, encapsulate each one, and make them interchangeable. Strategy lets the algorithm vary independently from clients that use it.
  - Template Method — Define the skeleton of an algorithm in an operation, deferring some steps to subclasses. Template Method lets subclasses redefine certain steps of an algorithm without changing the algorithm’s structure.
  - Visitor — Represent an operation to be performed on the elements of an object structure. Visitor lets you define a new operation without changing the classes of the elements on which it operates.

## Ressources

Design Patterns: Elements of Reusable Object-Oriented Software - by (GOF)

Design Patterns : https://cs.lmu.edu/~ray/notes/designpatterns/

Refactoring guru: https://refactoring.guru/design-patterns

Examples from : https://roadmap.sh/guides/design-patterns-for-humans
