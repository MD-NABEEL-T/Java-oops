// here i did not use return type for vehicle Type but when you are free do it ok
abstract class Vehicle{
    abstract void drive();

    final void startEngine(){
        System.out.println("Start Engine");
    }
    
    static void getVehicleType(String vehicleType){
        System.out.println(vehicleType);
    }
}

class Car extends Vehicle{
    Car(String vehicleType){
        super.startEngine();
        // Static methods are NOT called with super
        // super(vehicleType);
        Vehicle.getVehicleType(vehicleType);

    }
// 👉 super can only be used inside a constructor or method, NOT directly inside the class body.
    void drive(){
        System.out.println("Drives at right 2nd lane of the service road");
    }
}

class Motorcycle extends Vehicle{
    Motorcycle(String vehicleType){
        super.startEngine();
        Vehicle.getVehicleType(vehicleType);
    }
    void drive(){
        System.out.println("Drive at left 1st lane of the service road");
    }
}
public class Abstract3{
    public static void main(String []args){
        Motorcycle bike1=new Motorcycle("Splendor");
        bike1.drive();

        Car car1=new Car("Tata ");
        car1.drive();
    }
}
