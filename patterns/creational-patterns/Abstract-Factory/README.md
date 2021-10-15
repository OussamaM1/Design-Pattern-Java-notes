# 🔨 Abstract factory

<b>Abstract Factory</b> is a creational design pattern that lets you produce families of related objects without specifying their concrete classes.

## Applicability

We use the Abstract Factory pattern when :

- System should be independent of how its products are created, composed,
  and represented.
- System should be configured with one of multiple families of products.
- Family of related product objects is designed to be used together, and you
  need to enforce this constraint.
- We want to provide a class library of products, and you want to reveal just
  their interfaces, not their implementations.

## General Structure
