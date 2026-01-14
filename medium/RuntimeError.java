import java.util.Scanner;
public class RuntimeError{
    public static void main(String []args){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        // runtime error if user types "abc"
        System.out.println(n);
        // If input = abc
        // 💥 InputMismatchException

        
        if(n==0){
            // runtime error
        }
        else{
            System.out.println(n/10); 
        }
    }
}