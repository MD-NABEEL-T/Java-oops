interface Readable{
    void read();
}
interface Writable{
    void write();
}
interface Storable{
    void store();
}
class Notme implements Readable,Writable,Storable{
    @Override
    public void read(){
        System.out.println("reading");
    }
    @Override
    public void write(){
        System.out.println("writing");
    }
    @Override
    public void store(){
        System.out.println("storing");
    }
}
public class Interface3 {
    public static void main(String []args){
        Notme nm=new Notme();
        nm.read();
        nm.write();
        nm.store();
    }
}
