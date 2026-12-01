package basics;
class ConsChain {
    ConsChain() {
        System.out.println("Default constructor");
    }

    ConsChain(int a) {
        this();  // calls default constructor
        System.out.println("Parameterized constructor");
    }

    public static void main(String[] args) {
        ConsChain t = new ConsChain(10);
    }
}
// 📌 Rules
// this() must be first line in constructor
// Used for constructor chaining

// ❌ Where this CANNOT be used
// 🚫 Inside static methods
// Because static belongs to class, not object.