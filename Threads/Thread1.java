class A extends Thread{
    public void run(){
        System.out.println("This run function will run when you start the thread");
    }
    void disp(){
        System.out.println("lalaa");
    }
}
class B extends Thread{
    public void run(){
        System.out.println("alright this will also run when start ");
    }
}
public class Thread1 {
    public static void main(String []args){
        A a=new A();
        a.start();//start() belongs to thread class ok
        B b=new B();
        b.start();
    }
}
