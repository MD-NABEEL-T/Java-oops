abstract class Animal{
    abstract void makeSound();

    String name;
    Animal(String name){
        this.name=name;
        System.out.println(name);
    }
}

class Dog extends Animal{
    Dog(String name){
        super(name);
    }
    @Override
    void makeSound(){
        System.out.println("Bow Bow");
    }
}
public class Abstract2 {
    public static void main(String []args){
        Dog d1=new Dog("Tommy");
        
    }
}
