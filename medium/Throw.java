public class Throw {
    public static void main(String []args){
        try{
            int a=10;
            throw new Exception();
            // also can throw like throw new ArithmeticException();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }    
}
