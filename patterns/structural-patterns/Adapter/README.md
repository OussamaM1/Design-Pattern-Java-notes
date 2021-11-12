# 🔌 Adapter

<b>Adapter</b> is a structural design pattern that allows objects with incompatible interfaces to collaborate.

## Applicability

Use the Adapter pattern when

- you want to use an existing class, and its interface does not match the one
  you need.
- you want to create a reusable class that cooperates with unrelated orunforeseen classes, that is, classes that don't necessarily have compatible interfaces.
- (object adapter only) you need to use several existing subclasses, but it's unpractical to adapt their interface by subclassing every one. An object adapter
  can adapt the interface of its parent class.

## General structure

<b>Object Adapter</b> :
This implementation uses the object composition principle: the adapter implements the interface of one object and wraps the other one. It can be implemented in all popular programming languages.

<p align="center">
  <img src="../../images/adapter.png" width="700" />
</p>

- Target : defines the domain-specific interface that Client uses.
- Client : collaborateswith objects conforming to the Target interface.
- Adaptee : defines an existing interface that needs adapting.
- Adapter :adapts the interface of Adaptec to the Target interface

## Example

Consider that you have some pictures in your memory card and you need to transfer them to your computer. In order to transfer them you need some kind of adapter that is compatible with your computer ports so that you can attach memory card to your computer. In this case card reader is an adapter. Another example would be the famous power adapter; a three legged plug can't be connected to a two pronged outlet, it needs to use a power adapter that makes it compatible with the two pronged outlet. Yet another example would be a translator translating words spoken by one person to another
