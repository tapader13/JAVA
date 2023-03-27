//import java.util.Random;

public class twoDArr {
    public static void main(String[] args) {
        int arr[][] = new int[3][3];
        int arr1[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        // initialize
        for (int index = 0; index < 3; index++) {
            for (int index1 = 0; index1 < 3; index1++) {
                arr[index][index1] = (int) (Math.random() * 100);
            }

        }
        // print
        for (int index = 0; index < 3; index++) {
            for (int index1 = 0; index1 < 3; index1++) {
                System.out.print(" " + arr[index][index1]);
            }
            System.out.println();
        }
        System.out.println("The value is " + arr1[1][0]);
        for (int index = 0; index < 3; index++) {
            for (int index1 = 0; index1 < 3; index1++) {
                System.out.print(" " + arr1[index][index1]);
            }
            System.out.println();
        }
        // enhence method
        for (int n[] : arr1) {
            for (int m : n) {
                System.out.print(" " + m);
            }
            System.out.println();

        }
    }
}
