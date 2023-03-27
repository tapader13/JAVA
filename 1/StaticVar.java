class stat {
    String name;
    int price;
    // common object create karne kaliye.isko class name se access korna porta hea.
    static String brand;

    public void res() {
        System.out.println(name + " " + price + " " + brand);
    }
}

public class StaticVar {
    public static void main(String[] args) {
        stat st = new stat();

        st.name = "minhaj";
        st.price = 1000;
        stat.brand = "manikpur";
        stat st1 = new stat();

        st1.name = "tapader";
        st1.price = 5000;
        st.res();
        st1.res();

    }
}
