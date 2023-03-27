import java.util.Scanner;

public class jaggedArr {
    // import java.util.Random;

    public static void main(String[] args) {
        int arr[][] = new int[3][];
        arr[0] = new int[3];
        arr[1] = new int[4];
        arr[2] = new int[2];
        Scanner sc = new Scanner(System.in);
        // initialize
        System.out.println("Enter row element");
        for (int index = 0; index < 3; index++) {
            for (int index1 = 0; index1 < arr[index].length; index1++) {
                arr[index][index1] = sc.nextInt();
            }

        }
        sc.close();
        // print
        // enhence method
        for (int n[] : arr) {
            for (int m : n) {
                System.out.print(" " + m);
            }
            System.out.println();

        }
    }

}
