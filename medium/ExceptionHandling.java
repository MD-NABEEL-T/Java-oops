import java.util.InputMismatchException;
import java.util.Scanner;
public class ExceptionHandling{
    public static void main(String []args){
        Scanner s=new Scanner(System.in);
        try{
            int a=s.nextInt();
            System.out.println(10/a);
        }
        catch(InputMismatchException e){
            System.out.println("wrong type");
        }
        catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }
        catch(Exception e){
            System.out.println("Error");
        }
        finally{
            System.out.println("Alright done");
        }
        s.close();
    }
}