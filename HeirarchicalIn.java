class Animal{
    void eat(){ 
        System.out.println("Eats");
        }
}
class Dog extends Animal{
    void bark(){
        System.out.println("Barks");
        }
}
class Cat extends Animal{
    void meow(){
        System.out.println("meowwwwwww");
    }
}
public class HeirarchicalIn{
    public static void main(String []args){
        Cat c=new Cat();
        c.eat();
        c.meow();

    }
}