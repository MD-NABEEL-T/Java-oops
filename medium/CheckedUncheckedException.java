// Unchecked Exception
// 🔎 Why unchecked?
// Compiler ❌ does NOT force handling
// Error happens at runtime

// class Calc{
//     void div(){
//         int a=10/0;
//     }
// }
// public class CheckedUncheckedException{
//     public static void main(String []args){
//         Calc c=new Calc();
//         c.div();
//     }
// }


// Checked Exception
class Calc{
    void div()  throws Exception{
        int a=10/0;
    }
}
public class CheckedUncheckedException{
    public static void main(String []args){
        Calc c=new Calc();
        try{
        c.div();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
