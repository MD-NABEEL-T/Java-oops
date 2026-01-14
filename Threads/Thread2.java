class A extends Thread{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("This run function will run when you start the thread");
            try{
                Thread.sleep(10);
            }catch(Exception e){System.out.println(e);}
        }
    }
    void disp(){
        System.out.println("lalaa");
    }
}
class B extends Thread{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("alright this will also run when start ");
        }
        try{
        Thread.sleep(10);
        }catch(Exception e){System.out.println(e);}
    }
    
}
public class Thread2 {
    public static void main(String []args){
        A a=new A();
        a.start();//start() belongs to thread class ok
        B b=new B();
        b.start();
    }
}
// RUN THIS TO SEE THE MAGIC