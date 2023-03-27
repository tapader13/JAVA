class A {
    public void ansA() {
        System.out.println("A in");
    }

    class B {
        public void ansB() {
            System.out.println("B in");
        }
    }
}

// outer class ko static nahi bana sakta.
public class innerClass {
    public static void main(String[] args) {
        A res = new A();
        // res.ansA();

        A.B res1 = res.new B();
        res1.ansB();

    }
}
