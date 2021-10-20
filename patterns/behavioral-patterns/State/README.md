# 💢 State

<b>State</b> is a behavioral design pattern that lets an object alter its behavior when its internal state changes. It appears as if the object changed its class.

## Applicability

We use the State pattern in either of the following cases:

- An object's behavior depends on its state, and it must change its behavior at
  run-time depending on that state.
- Operations have large, multipart conditional statements that depend on the
  object's state. This state is usually represented by one or more enumerated
  constants. Often, several operations will contain this same conditional structure. The Statepattern puts each branch ofthe conditional in a separate class.This lets you treat the object's state as an object in its own right that can vary
  independently from other objects.

## General Structure

<p align="center">
  <img src="../../images/state.png" width="700" />
</p>
