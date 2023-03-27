import java.util.Scanner;

public class first {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any string_ ");
        // nextline or next ka farak ye hea _ ak t puri line ko input lega or dusra sref
        // one word ko input lega.
        String str = sc.nextLine();
        String str1 = sc.next();
        sc.close();
        System.out.println(str);
        System.out.println(str1);

        // char ch = 'y';
        // ch++;

        // float ch = 4.6f;
        // int x = (int) ch;
        // System.out.println(x);

        // Scanner scn = new Scanner(System.in);
        // System.out.print("Enter num 1_ ");
        // int a = scn.nextInt();
        // System.out.print("Enter num 2_ ");
        // int b = scn.nextInt();
        // System.out.print("Enter num 3_ ");
        // int c = scn.nextInt();

        // scn.close();

        // for (int index = 1; index <= 5; index++) {
        // System.out.println("Day " + index);
        // System.out.print("Office start :");
        // for (int indexi = 1; indexi <= 9; indexi++) {
        // if ((indexi + 8) <= 12) {
        // System.out.print(" " + (indexi + 8));
        // } else {
        // System.out.print(" " + (indexi - 4));
        // }

        // }
        // System.out.println(" end .");
        // }

        // while (a < 5) {
        // System.out.println("tapader " + a);
        // a++;
        // }

        // int result = a > b ? 1 : a > c ? 2 : 3;
        // System.out.println(result);

        // if (a > b && a > c) {
        // System.out.print("a is bigger ");
        // System.out.println(a);
        // } else if (b > a && b > c) {
        // System.out.print("b is bigger ");
        // System.out.println(b);
        // } else {
        // System.out.print("c is bigger ");
        // System.out.println(c);
        // }
        // boolean compare = a == b;
        // System.out.println(compare);

    }
}