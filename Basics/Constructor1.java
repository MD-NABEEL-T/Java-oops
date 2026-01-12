public class Constructor1{
    int age;
    String name;
    public static void main(String []args){
        int a;
        // System.out.println(a);
        // it shows error as not initialized .
        // whereas when we use object it does not show error because of constructor.
        Constructor obj = new Constructor();
        System.out.println(obj.name);//null
        System.out.println(obj.age);//0
    }
}

// TO UNDERSTAND CONSTRUCTOR CHECK OUT THE CONSTRUCTOR2 FILE