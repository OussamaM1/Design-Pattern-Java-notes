# 👷 Builder

<b>Builder</b> is a creational design pattern that lets you construct complex objects step by step. The pattern allows you to produce different types and representations of an object using the same construction code.

## Applicability

We use the Builder pattern when

- The algorithm for creating a complex object should be independent of the
  parts that make up the object and how they're assembled.
- The construction process must allow different representations for the object
  that's constructed.

## General Structure

<p align="center">
  <img src="../../images/builder.png" width="700" />
</p>

- The Builder interface declares product construction steps that are common to all types of builders.
- Concrete Builders provide different implementations of the construction steps. Concrete builders may produce products that don’t follow the common interface.
- Products are resulting objects. Products constructed by different builders don’t have to belong to the same class hierarchy or interface.
- The Director class defines the order in which to call construction steps, so you can create and reuse specific configurations of products.

## Example

For example we have a user management module, primary entity is `User`, let’s say. Ideally and practically as well, once a user object is fully created, we will not want to change it’s state , and let’s assume, our User object has following 5 attributes i.e. firstName, lastName, age, phone and address.

In normal practice, if we want to make a immutable User class, then we must pass all five information as parameters to constructor. It will look like this:

```Java
public User (String firstName, String lastName, int age, String phone, String address){
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
    this.phone = phone;
    this.address = address;
}
```

Now what if only firstName and lastName are mandatory and rest 3 fields are optional. Problem !! We need more constructors.

Let’s solve the above problem in code. The given solution uses an additional class UserBuilder which helps us in building desired User instance with all mandatory attributes and combination of optional attributes, without losing the immutability.

Please note that the User object does not have any setter method, so its state can not be changed once it has been built. This provides the desired immutability.

```Java
public static void main(String[] args) {
    User user1 = new User.UserBuilder("Lokesh", "Gupta")
    .age(30)
    .phone("1234567")
    .address("Fake address 1234")
    .build();

    System.out.println(user1);


    User user2 = new User.UserBuilder("Super", "Man")
    //No age
    //No phone
    //no address
    .build();

    System.out.println(user2);
}
```

Output :

```
User: Lokesh,Gupta,30,1234567,Fake address 1234
User: Super,Man
```
