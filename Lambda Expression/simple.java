@FunctionalInterface
interface name {
    void myName(int i);
}

public class simple {
    public static void main(String[] args) {
        name nm = i -> System.out.println("Md. Minhaj Uddin Tapader." + " Roll " + i);

        nm.myName(13);
    }
}