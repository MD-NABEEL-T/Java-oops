class Person{
    String name;
    Person(String name){
        this.name=name;
    }
}

class Employee extends Person{
    Employee(String name){
        super(name);
    }
}
public class Super2{
    public static void main(String []args){
        Employee E1=new Employee("Nabeel");
    }
}

// overview of how super works