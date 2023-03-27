public class simple {
    public static void main(String[] args) {
        int i = 6;
        int j = 7;
        int k;
        try {
            k = i / j;
            System.out.println(k);
        } catch (Exception e) {
            System.out.println("Wrong...");
        }

    }
}