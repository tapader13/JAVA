// final class A {
class A {
    // agar method ke age se final laga dia t eye overriting rukh de ga.
    // public final void show() {
    public void show() {
        System.out.println("A in");
    }
}

// agar class ke age se final laga dia t eye inherit rukh de ga.
class B extends A {

    public void show() {
        System.out.println("B in");
    }
}

public class finalClass {
    public static void main(String[] args) {
        B b = new B();
        b.show();
    }

}
