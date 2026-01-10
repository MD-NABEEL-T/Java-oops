import Animal;
import Dog;

package Inheritance;
class Animal{ //super class
    void eat(){ System.out.println("Eats");}
}
class Dog extends Animal{ //derived class
    void bark(){System.out.println("Barks");}
}
public class SingleIn{
    public static void main(String[] args){
        Dog d=new Dog();
        d.eat();
        d.bark();
    }
}

// Single inheritance - one super class and one derived class 
