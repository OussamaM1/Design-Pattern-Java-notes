# Creational patterns

These patterns provide various object creation mechanisms, which increase flexibility and reuse of existing code.

## Table of contents :

| Scope      | Class                               | Object                                                                                  |
| ---------- | ----------------------------------- | --------------------------------------------------------------------------------------- |
| Creational | [Factory Method](./Factory-Method/) | [Abstract Factory](./Abstract-Factory) , Builder , Prototype , [Singleton](./Singleton) |

## Note :

Some further explanation of what <b>scope</b> means, and how it impacts each design pattern is essential when it comes to classifying each design pattern. Scope refers to the extent of the design pattern, or how much it affects and can affect. In the case of object-oriented programming, the scope of a design pattern can extend only to a <b>class</b>, or to an instance of that class, called an <b>object</b>.

- Class scope :
  - Focuses on the relationships between classes and their
    subclasses.
  - Reuse by inheritance
- Object scope :
  - Focuses on the relationships between objects.
  - Reuse by composition

### Composition vs inheritance

|            | Inheritance                                                                                                      | Composition                               |
| ---------- | ---------------------------------------------------------------------------------------------------------------- | ----------------------------------------- |
| Basic      | Inheritance is an "is-a" relationship                                                                            | Composition is a "has-a" relationship     |
| Code reuse | In Inheritance, a class can extend only one interface, therefore, you can reuse your code only in one class only | We can reuse code in multiple class       |
| Scope      | Inheritance provides its features at compile time                                                                | Composition is easily achieved at runtime |

### exemple :

Car <b>has a</b> engine and Car <b>is a</b> Automobile.

```Java
class Engine {} // The engine class.

class Automobile {} // Automobile class which is parent to Car class.

class Car extends Automobile { // Car is an automobile => Car class extends Automobile

  private Engine engine ; // Car has an Engine => Car class has an instance of Engine (Object).

}

```
