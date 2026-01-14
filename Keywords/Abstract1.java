// We use abstract methods when:
// 1️⃣ We want to force subclasses to write their own logic

// ❌ You cannot create object of abstract class
// Animal a = new Animal(); // ❌ ERROR

import polymorphism.Animal;
import polymorphism.Dog;

abstract class Animal {
    abstract void sound(); // abstract method
}
class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    void sound() {
        System.out.println("Cat meows");
    }
}

public class Abstract1{
    public static void main(String args[]){
        Dog a1 = new Dog();
        a1.sound();

        Cat a2 = new Cat();
        a2.sound();
    }
}