public class multiple {
    public static void main(String[] args) {
        int n1 = 0;
        int n2 = 5;
        String str = null;
        int arr[] = new int[3];
        try {
            n2 = n2 / n1;
            System.out.println(n2);
            System.out.println(arr[3]);
            System.out.println(str.length());
        } catch (ArithmeticException e) {
            System.out.println("Not divided by zero");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Enter some valid index");
        } catch (Exception e) {
            System.out.println("Something went wrong...");
            // System.out.println("Something went wrong..." + e);
        }

    }
}
