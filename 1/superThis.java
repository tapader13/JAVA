class A {
    public A() {

        System.out.println("A in");

    }

    public A(int a) {
        this();
        System.out.println("A in parameter");
    }
}

class B extends A {
    // private static int b;

    public B() {
        // ye super apna upper class ko call karta hea.Agar upper class nehi mila to eye
        // object ko extends korte hea.

        // super(b);
        System.out.println("B in");
    }

    public B(int b) {
        // ye khud ka constructor ko call korte hea.
        // super(b);
        System.out.println("B in parameter");
    }
}

public class superThis {

    public static void main(String[] args) {
        // B ans = new B(3);
        B ans = new B();
    }

}
