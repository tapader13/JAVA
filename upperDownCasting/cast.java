class A {
    public void show() {
        System.out.println("A in");
    }
}

class B extends A {
    public void show1() {
        System.out.println("B in");
    }
}

class C extends B {
    public void show2() {
        System.out.println("C in");
    }
}

public class cast {
    public static void main(String[] args) {
        A res = new C();
        res.show();

        // C res1 = (C) res;
        // res1.show2();
        // A rs = new A();
        C res1 = (C) res;
        res1.show2();
    }
}