import java.io.FileWriter;
public class FileWriterrr {
    public static void main(String []args){
            try{
            FileWriter fw=new FileWriter("Ironman.txt",true);
            // true because we are saying there is already a file ok and i am gonna append 
            fw.write("I can do this all day");
            // write() will replace the existing code so use append
            fw.append(" Alright bhai");
            fw.close();
            // we have to close the file after completion
            System.out.println("Success");
            }
            catch(Exception e){System.out.println(e);}

    }

}
