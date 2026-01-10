package Keywords;
// The use of this keyword is to eliminate the confusion between class attributes and parameters with same name 

public class ThisKeyWord{
    String myName;
    void display(String myName){
        // myName=myName will show null so ,
        this.myName=myName;
    }
    public static void main(String []args){
        ThisKeyWord t= new ThisKeyWord();
        t.display("Nabeel");
        System.out.print(t.myName);
    }
}