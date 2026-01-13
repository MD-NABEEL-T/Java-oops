interface A {
    void display();   // ✅ ONLY abstract method

    default void show() {   // ✅ default method
        System.out.println("This is default method");
    }
}

public class FunctionalInterface2 {
    public static void main(String[] args) {

        A a = new A() {
            public void display() {
                System.out.println("Display method implementation");
            }
        };

        a.display(); // abstract method
        a.show();    // default method
    }
}
