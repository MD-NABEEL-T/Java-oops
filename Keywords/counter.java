class counter{
    int normCount=0;
    static int staticCount=0;

    counter(){
        normCount++;
        staticCount++;
    }
    void disp(){
        System.out.println(normCount);
        System.out.println(staticCount);
    }
}
public class StaticKeyWord2{
    public static void main(String []args){
        counter c1=new counter();
        c1.disp();
        counter c2=new counter();
        c2.disp();
        counter c3=new counter();
        c3.disp();
    }
}