// If a variable is private,
// 👉 you cannot access it directly from outside the class.

// So:
// setter = controlled way to put value
// getter = controlled way to take value
// This is encapsulation.


class EncapsulationDemo {

    // private data (hidden)
    private int id;
    private String name;

    // setter for id
    public void setId(int id) {
        this.id = id;
    }

    // getter for id
    public int getId() {
        return id;
    }

    // setter for name
    public void setName(String name) {
        this.name = name;
    }

    // getter for name
    public String getName() {
        return name;
    }
}

public class Main {
    public static void main(String[] args) {

        Student s = new Student();

        // setting values using setters
        s.setId(1);
        s.setName("Nabeel");

        // getting values using getters
        System.out.println(s.getId());
        System.out.println(s.getName());
    }
}
