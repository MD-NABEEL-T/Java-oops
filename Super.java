class Animal{
    Animal(String name){
        System.out.println(name);
    }
    void makeSound(){
        System.out.println("raarrar");
    }
    int age=4;
}
class Dog extends Animal{
    Dog(){
        super("Iron Man");
        super.makeSound();
        System.out.println(super.age=5);
        System.out.println("Dog");
    }
}

public class Super{
    public static void main(String []args){{
        Dog d=new Dog();
        // when this object is created then animal constructor is also called if it needs parameter then how can we pass the param so we pass it from Dog class using Super keyword
    }}
}