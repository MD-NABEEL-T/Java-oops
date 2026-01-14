import java.io.FileReader;
public class FileReader1{
    public static void main(String []args){
        try{
        FileReader f=new FileReader("Captain.txt");
        int oneCharacter=f.read();

        //System.out.print(oneCharacter);
        // //will print number like 104 if there exist text or else print -1 if no text

        System.out.print((char)oneCharacter);// WILL PRINT THE CHARACTER


        // instead of printing one character at once we use 
        while(oneCharacter!=-1){
            oneCharacter=f.read();
            System.out.print((char)oneCharacter);
        }

        f.close();

        }catch(Exception e){System.out.println(e);}
    }
}
