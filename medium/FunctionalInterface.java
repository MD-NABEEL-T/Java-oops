// This is FUNCTIONAL INTERFACE
interface A{
    void display();
}
public class FunctionalInterface {
    public static void main(String []args){
        A a=new A(){
            public void display(){
                System.out.print("alright");
            }
        };
        a.display();
    }
}

// A a = new A(){
//     public void display(){
//         System.out.print("alright");
//     }
// };
// This is called an ANONYMOUS CLASS.

// Anonymous = no name