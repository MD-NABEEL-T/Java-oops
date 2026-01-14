import java.io.FileWriter;
import java.io.BufferedWriter;
public class BufferedWriterr {
    public static void main(String []args){
        try{

        FileWriter fw=new FileWriter("Captain.txt",true);
        BufferedWriter bw=new BufferedWriter(fw);

            // BufferedWriter bw = new BufferedWriter(new FileWriter("data.txt"));
            
        bw.newLine();
        bw.write("All set");
        bw.newLine();
        bw.close();
        System.out.println("Success");
        }
        catch(Exception e) {System.out.println(e);}
    }
}
