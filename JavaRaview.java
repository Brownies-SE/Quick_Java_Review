
public interface JavaRaview  {

    // String name;

    // public void sayName() {
    //     System.out.println("My name!");
    // }

    // public void sayName(String name) {
    //     System.out.println("My name is: " + name);
    // }

    // This would be used if you had another class with a method called saySomething()
    // public void saySomething() {

    // }

    // private String flavor;

    // public void setFlavor(String newFlavor) {
    //     flavor = newFlavor;
    // }

    // public String getFlavor() {
    //     return flavor;
    // }

    // public void openBag() {
    //     System.out.println("The bag is opened");
    // }
    
    final String flavor = "Beef";

    void openBag();
}

/*
Polymorphism - We can have multiple methods with the same name but with different paramaters.
1 method can have many forms. Overloading a method or overwriting a method. Overwriting includes a new class and extending that class. 

Inheritence - Means that we are using extends, we are inheriting the methods and variables from the other class. Good for the
reusability of code. Current class is bottom class and the one it extends is usually the super class.

Encapsulation - Use setters and getters to grab the private variables. We use this because many variables are usually private and its easier to do things through methods.

Interface - A list of variables and methods (Just this). Just change public class JavaReview tp public interface JavaReview
access modifiers - Making a variable public or private.

Abstraction - Everything that the user needs is there, everything else is hidden.

Classes are blueprints for objects, onjects represent real world objects using variables and methods.
*/