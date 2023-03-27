//import java.util.Scanner;

class InnerbasicClass {
    int n = 7;

    public int add(int n1, int n2) {
        int r = n1 + n2;
        return r;
    }

    public String getBook(int val) {
        if (val >= 500) {
            return "Quran";
        }
        return "Nothing";
    }

}

public class basicClass {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter number a :");
        // int a = sc.nextInt();
        // System.out.print("Enter number b :");
        // int b = sc.nextInt();
        // sc.close();
        InnerbasicClass ans = new InnerbasicClass();
        InnerbasicClass ans1 = new InnerbasicClass();
        // agar 1 object ko change koroge t effect seref 1 object pei porega.
        ans1.n = 10;
        System.out.println(ans.n);
        System.out.println(ans1.n);
        // int answer = ans.add(a, b);
        // System.out.println(answer);
        // String str = ans.getBook(a);
        // System.out.println(str);
    }
}
