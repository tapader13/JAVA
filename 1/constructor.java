class stat {
    String name;
    int price;
    // common object create karne kaliye.isko class name se access korna porta hea.
    static String brand;
    static {
        brand = "Apple";
        System.out.println("Static called");
    }

    public stat() {
        name = "minhaj";
        price = 13;
        System.out.println("Constructor called");
    }

    public void res() {
        System.out.println(name + " " + price + " " + brand);
    }

}

public class constructor {

    public static void main(String[] args) throws ClassNotFoundException {
        // aise lika t class load ho jayga.class load hogiya t static block call ho
        // jayga.
        Class.forName("stat");
        // static ak bar e call hota hea.
        // stat st = new stat();
        // stat st1 = new stat();

    }

}
