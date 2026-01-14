import java.io.BufferedReader;
import java.io.FileReader;
public class FileReader2 {
    public static void main(String []args){
        try{
            FileReader fr=new FileReader("Captain.txt");
            BufferedReader br=new BufferedReader(fr);
            String line=br.readLine();

            while(line!=null){
                System.out.println(line);
                line=br.readLine();
            }
            br.close();
        }catch(Exception e){System.out.print(e);}
    }
}
