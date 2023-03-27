
public class Calc {
    public static void main(String[] args) {
        oper3 op = new oper3();
        int res1 = op.add(1, 2);
        int res2 = op.sub(5, 2);
        int res3 = op.mul(1, 2);
        int res4 = op.div(5, 2);
        int res5 = op.powe(3, 4);
        System.out.println(res1 + " " + res2 + " " + res3 + " " + res4 + " " + res5);
    }
}
