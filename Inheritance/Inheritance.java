package inheritance;
class Dad{
    int money=10223;
}
class Son extends Dad{

}
public class Inheritance{
    public static void main(String []args){
        Son s=new Son();
        System.out.print(s.money);
    }
}

// FOUR TYPES : single,multilevel,Heirarchical,Hybrid = multi level+Heirarchical also multiple inheritance(interface)