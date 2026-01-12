interface Showable{
    void disp();
}

interface Printable{
    void disp();
}

class Alright implements Showable,Printable{
    void disp(){
        System.out.println("I am Iron Man");
    }
}
public class Inheritance2{
    public static void main(String []args){
        Alright a=new Alright();
        a.disp();
    }
}