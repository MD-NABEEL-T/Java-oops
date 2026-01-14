class Car{
    String brand="Tata";
    String color="Blue";
    public String toString(){
        String myString=this.brand + " has " +this.color;
        return myString;
    }
}
public class toString {
    public static void main(String []args){
        Car c=new Car();
        // System.out.println(c.toString()));
        System.out.println(c);
    }
}

// Used when we directly want to call the object