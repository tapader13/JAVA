public class threeDArr {
    // import java.util.Random;

    public static void main(String[] args) {
        int arr[][][] = new int[3][3][3];

        // initialize
        for (int index = 0; index < 3; index++) {
            for (int index1 = 0; index1 < 3; index1++) {
                for (int index2 = 0; index2 < 3; index2++) {
                    arr[index][index1][index2] = (int) (Math.random() * 100);
                    System.out.print(" " + arr[index][index1][index2]);
                }
            }

        }
        System.out.println();
        System.out.println(arr[0][1][0]);
        // print
        // enhence method
        for (int n[][] : arr) {
            for (int m[] : n) {
                for (int j : m) {
                    System.out.print(" " + j);
                }
                System.out.println();
            }
            System.out.println();

        }
    }

}
