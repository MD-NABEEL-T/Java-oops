// This is FUNCTIONAL INTERFACE - A functional interface is an interface that has EXACTLY ONE abstract method.

// 🔥 Important rule (very exam-friendly)
// Only abstract methods are counted
// default + static methods ❌ don’t matter


interface A{
    void display();
}
public class FunctionalInterface {
    public static void main(String []args){
        A a=new A(){
            public void display(){
                System.out.print("alright");
            }
        };
        a.display();
    }
}
// interface A{
//     void display();
// }
// ✔ A → Functional Interface

// A a = new A(){
//     public void display(){
//         System.out.print("alright");
//     }
// };
// This is called an ANONYMOUS CLASS.
// Anonymous = no name

// 3️⃣ Relationship in one sentence 🧠

// A functional interface defines what must be done
// An anonymous class defines how it is done (once)