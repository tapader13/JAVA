class A {
    public void ansA() {
        System.out.println("A in");
    }

}

class B extends A {
    public void ansB() {
        System.out.println("B in");
    }
}

public class anonymousInnerClass {
    public static void main(String[] args) {
        B res = new B() {
            public void ansA() {
                System.out.println("A anonymous in");
            }
        };
        res.ansA();
    }
}
