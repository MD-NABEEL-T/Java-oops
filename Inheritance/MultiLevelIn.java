package inheritance;
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
class Puppy extends Dog{
    void weep(){
        System.out.println("weep");
    }
}
public class MultiLevelIn{
    public static void main(String[] args){
        Puppy p=new Puppy();
        p.bark();
    }
}