# ☕ Decorator

<b>Decorator</b> is a structural design pattern that lets you attach new behaviors to objects by placing these objects inside special wrapper objects that contain the behaviors.

## Applicability

Use Decorator

- to add responsibilities to individual objects dynamically and transparently,
  that is, without affecting other objects.
- forresponsibilities that canbe withdrawn.
- when extension by subclassing is impractical. Sometimes a large number
  of independent extensions are possible and would produce an explosion of
  subclasses to support every combination. Or a class definition maybe hidden
  or otherwise unavailable for subclassing.

## General Structure

<p align="center">
  <img src="../../images/decorator.png" width="700" />
</p>

- Component : defines the interface for objects that can have responsibilities added to them dynamically.
- ConcreteComponent : defines an object towhich additional responsibilities canbe attached.
- Decorator : maintains a reference to a Component object and defines an interface that conforms to Component's interface.
- ConcreteDecorator : adds responsibilities to the component.

## Example

For example we have a car mangement system , suppose we want to buy a basicCar but with more features like (speed regulator , AC , Navigation system ...)

<p align="center">
  <img src="../../images/decorator-example.png" width="700" />
</p>
