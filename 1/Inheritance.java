class A {
    public A() {
        System.out.println("A in");
    }

    public A(int a) {
        System.out.println("A in parameter");
    }
}

class B extends A {
    public B() {
        // ye super by default sob constructor pe hota hea.
        super();
        System.out.println("B in");
    }

    public B(int b) {
        super();
        System.out.println("B in parameter");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        B ans = new B(3);
    }
}
