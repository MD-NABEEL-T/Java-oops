package basics;

class Student{
    String name;
    int age;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
}

public class Pen{
    String color;
    String type;//ball or gell pen
    
    public void write(){
        System.out.println("Writing .........");
    }
    public void printtr(){
        System.out.println(this.color);
    }
}

public class oops{
    public static void main(String []args){
        Pen pen1 = new Pen();
        pen1.color="Blue";
        pen1.type="ball point pen";
        pen1.write();

        Pen pen2 = new Pen();
        pen2.color="pink";
        pen2.printtr();

        Student s1=new Student();
        s1.name="tony ";
        s1.age=20;
        s1.printInfo();
    }

}