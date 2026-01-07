public class demo{
    public static int evenorodd(int num){
        if(num%2==0){
            System.out.print("Even");
        }
        else System.out.print("odd");
        return(num);
    }
    public static void main(String []args){
        int n=9;
        evenorodd(n);
        System.out.println();
        demo obj=new demo();
        obj.evenorodd(n);
    }
}