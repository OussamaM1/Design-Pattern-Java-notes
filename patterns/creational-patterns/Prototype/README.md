# Prototype

<b>Prototype</b>

## Applicability

Use the Prototype pattern when a system should be independent of how its
products are created, composed, and represented; and

- When the classes to instantiate are specified at run-time, for example, by
  dynamic loading; or
- To avoid building a class hierarchy offactories that parallels the class hierarchy of products; or
- When instances of a class can have one of only a few different combinations
  of state. It may be more convenient to install a corresponding number of
  prototypes and clone them rather than instantiating the class manually, each
  time with the appropriate state.

## General Structure

<p align="center">
  <img src="../../images/prototype.png" width="700" />
</p>

- Prototype : declares an interface for cloning itself.
- ConcretePrototype : implements an operation for cloning itself.
- Client : creates a new object by asking a prototype to clone itself.

## Example
