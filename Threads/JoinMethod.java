class Doable extends Thread{
    int j=0;
    public void run(){
        j=50;
    }
}
public class JoinMethod {
    public static void main(String []args){
        Doable d=new Doable();

        // d.start();
        // System.out.println(d.j);
        // the above will print j as 0 because main method does not wait ok so inorder to make it wait we perform this step below

        d.start();
        try{
            d.join();
        }catch(Exception e){System.out.println(e);}
        System.out.println(d.j);
        // Now it shows j as 50
    }
}
