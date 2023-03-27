import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        int arr1[] = { 1, 2, 4 };

        // for-each loop
        // for (int c : arr1) {
        // System.out.print(" " + c);
        // }

        for (int index = 0; index < n; index++) {
            arr[index] = sc.nextInt();
        }
        sc.close();
        for (int index = 0; index < n; index++) {
            System.out.print(" " + arr[index]);
        }
        System.out.println();
        for (int index = 0; index < 3; index++) {
            System.out.print(" " + arr1[index]);
        }
    }
}
