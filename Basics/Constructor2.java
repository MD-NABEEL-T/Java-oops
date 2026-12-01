package basics;
public class Constructor2{
    // CONSTRUCTOR OVERLOADING
    Constructor2(){
        System.out.println("Nabeel");
    }
    Constructor2(int a){//this constructor only will be executed based on the input 
        System.out.println("I can do this all day ok");
        System.out.println(a);
    }
    public static void main(String []args){
        Constructor2 obj1= new Constructor2(60);
        // Constructor2 obj2= new Constructor2();
        // if two object created means it will execute for two times
    }
}

// Constructor is used to initialize the values