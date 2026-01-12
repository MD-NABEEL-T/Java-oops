// ✅  ONLY ONE public class is allowed per .java file
// And filename MUST match that public class name.

// public → accessible everywhere
// default(no keyword) → same package only
// private → same class only
// protected → same package or it is accessible from other package only through extending the parent class of another package as a subclass in this package

🔐 Access Modifiers in Java (One Clean Example)
👉 Class in same package
// File: AccessDemo.java
package test;

public class AccessDemo {

    public int a = 10;        // public
    protected int b = 20;     // protected
    int c = 30;               // default (no keyword)
    private int d = 40;       // private

    public void show() {
        System.out.println(a); // ✅ accessible
        System.out.println(b); // ✅ accessible
        System.out.println(c); // ✅ accessible
        System.out.println(d); // ✅ accessible
    }
}

👉 Another class in SAME package
// File: SamePackage.java
package test;

public class SamePackage {
    public static void main(String[] args) {

        AccessDemo obj = new AccessDemo();

        System.out.println(obj.a); // ✅ public
        System.out.println(obj.b); // ✅ protected because same package
        System.out.println(obj.c); // ✅ default
        // System.out.println(obj.d); ❌ private (not accessible)
    }
}

👉 Subclass in DIFFERENT package
// File: SubClass.java
package demo;

import test.AccessDemo;

public class SubClass extends AccessDemo {
    public static void main(String[] args) {

        SubClass obj = new SubClass();

        System.out.println(obj.a); // ✅ public
        System.out.println(obj.b); // ✅ protected (via inheritance)
        // System.out.println(obj.c); ❌ default
        // System.out.println(obj.d); ❌ private
    }
}
