class myException extends Exception {
    public myException(String str) {
        super(str);
    }
}

public class throExpton {
    public static void main(String[] args) {
        int n1 = -3;
        int n2 = 8;
        try {
            n1 = n1 * n2;
            if (n1 < 0) {
                throw new myException("Area kokhonoi negative hoy na tai___");
            } else {
                System.out.println("Area: " + n1);
            }
        } catch (myException e) {
            System.out.println("Area: " + n1);
            System.out.println(e.getMessage());
            int res = n1 * -1;
            System.out.println(res);
        }
    }
}
