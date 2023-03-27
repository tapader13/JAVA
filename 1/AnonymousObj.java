class ano {

    public ano() {
        System.out.println("Anonymous object called.");
    }

    public void name() {
        System.out.println("Method called.");
    }

}

public class AnonymousObj {
    public static void main(String[] args) {
        // yeha pe reference stack nahihe.but yeha pe ak masla aur hea - object ko reuse
        // nahi kar payenge.
        new ano().name();
        new ano().name();

    }
}
