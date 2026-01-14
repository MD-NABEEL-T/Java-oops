class Animal {
    void sound() {
        System.out.println("Animal makes sound");
    }
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

public class DynamicDispatch {
    public static void main(String[] args) {

        Animal a;   // parent reference

        a = new Dog();   // upcasting
        a.sound();       // Dog barks

        a = new Cat();   // upcasting
        a.sound();       // Cat meows
    }
}
// 🔥 WHY DO WE EVEN NEED THIS?
// Imagine WITHOUT upcasting 😐
// Dog d = new Dog();
// Cat c = new Cat();
// Cow cow = new Cow();


// You’d need separate variables for everything 🤢


// Upcasting = parent reference → child object
// Dynamic Method Dispatch = JVM decides which method to run at runtime

// Dynamic Method Dispatch means: when the same method is overridden in child classes, JVM decides at runtime which version to execute based on the object, not the reference.