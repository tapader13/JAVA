class A {
    public void show() {
        System.out.println("A in");
    }
}

class B extends A {
    public void show() {
        System.out.println("B in");
    }
}

class C extends B {
    public void show() {
        System.out.println("C in");
    }
}

public class runtimePolymorpisom {
    public static void main(String[] args) {
        A res = new A();
        res.show();
        res = new B();
        res.show();
        res = new C();
        res.show();
    }
}