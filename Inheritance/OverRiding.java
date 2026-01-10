import Animal;
import Dog;

package Inheritance;
class Animal{
    String name;
    void makeSound(){
        System.out.println("rrrrrrr");
    }
}
class Dog extends Animal{
    void makeSound(){
        System.out.println("rarara");
    }
}

public class OverRiding{
    public static void main(String []args){
        Dog d=new Dog();
        d.makeSound();
    }
}