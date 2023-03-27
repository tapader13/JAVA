class A {
    String st;
    int n;

    public void show() {
        System.out.println(st + " " + n);
    }

    public String toString() {
        return "ball";
    }

    public boolean equals(A that) {
        if (this.n == that.n && this.st.equals(that.st)) {
            return true;
        } else {
            return false;
        }
    }
}

public class object {
    public static void main(String[] args) {
        A result1 = new A();

        result1.st = "uddin";
        result1.n = 13;
        A result2 = new A();

        result2.st = "uddin";
        result2.n = 13;
        boolean ans = result1.equals(result2);
        // boolean ans = result1==result2;
        // by default object ka sat like toString() call hota hea.
        // System.out.println(ans.toString());
        System.out.println(ans);
    }
}