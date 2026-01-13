interface A{
    void display();
}
public class LambdaExpression {
    public static void main(String []args){
        // A a = new A() {
        // public void display() {System.out.println("Display method implementation");}
        // };
        // instead of above we use lambda expression below
        A a=()->{System.out.print("alright");};
        a.display();
    }
}

// Lambda expression is a shortcut to write an anonymous class for a functional interface.