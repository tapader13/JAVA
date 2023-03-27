import java.util.Scanner;

public class tryFinally {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        try {

            System.out.println("Enter number");
            num = sc.nextInt();
            if (num == 0) {
                throw new Exception("Zero not allowed.");
            } else {
                System.out.println(num);
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            // ai block always call hobe.
            sc.close();
        }
    }
}