import java.util.*;
// method overloading or function overloading
public class overloading {
    void display(){
        System.out.print("Hello");
    }

    void display(int a){
        System.out.print("world");
    }

    void display(double a){
        System.out.print("ok");
    }

    public static void main(String []args){
        overloading obj=new overloading();
        obj.display(3);
        obj.display(0.677558);
        // if you dont put param or if you put param then other method will work 
    }
}