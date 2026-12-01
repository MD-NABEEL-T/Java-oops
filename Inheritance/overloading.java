package inheritance;
import java.util.*;
// method overloading or function overloading
public class overloading {
    void display(){
        System.out.print("Hello");
    }

    void display(int a){
        System.out.print("world");
    }

    public static void main(String []args){
        overloading obj=new overloading();
        obj.display(3);
        // if you dont put param or if you put param then other method will work 
    }
}