
final means no modification allowed.

1️⃣ final variable
👉 Value cannot be changed
final int x = 10;
x = 20; // ❌ ERROR

2️⃣ final method
👉 Method cannot be overridden
class A {
    final void show() {
        System.out.println("Hello");
    }
}
class B extends A {
    // void show() { }  // ❌ ERROR
}


3️⃣ final class
👉 Class cannot be inherited
final class A {
}

// class B extends A { }  // ❌ ERROR


Very common INTERVIEW Q 🔥
❓ Can a final variable be empty?
👉 Yes, but only once
final int x;
x = 10; // allowed
x = 20; // ❌ not allowed
