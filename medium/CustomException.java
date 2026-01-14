// Creating our own Exception
import java.util.Scanner;
class NotValidException extends Exception {

}
public class CustomException{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        try{
            int age=sc.nextInt();
            if(age<18) {throw new NotValidException();}
        }
            catch(Exception e){
            System.out.println(e);
        }
    }
}