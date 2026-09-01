class Animal{
    Animal(){
        System.out.println("Animal");
    }
}
class Dog extends Animal{
    Dog(){
        System.out.println("Dog");
    }
}

public class Super{
    public static void main(String []args){{
        Dog d=new Dog();
    }}
}