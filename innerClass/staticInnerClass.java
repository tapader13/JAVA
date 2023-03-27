class A {
    public void ansA() {
        System.out.println("A in");
    }

    static class B {
        public void ansB() {
            System.out.println("B in");
        }
    }
}

public class staticInnerClass {
    public static void main(String[] args) {
        A.B res1 = new A.B();
        res1.ansB();

    }
}
