
abstract class A {
    public abstract void ansA();

    public abstract void ansB();
}

public class abstrtWithAnynms {
    public static void main(String[] args) {
        A res = new A() {
            public void ansA() {
                System.out.println("A abstract anonymous in");
            }

            public void ansB() {
                System.out.println("B abstract anonymous in");
            }
        };
        res.ansA();
        res.ansB();
    }
}
