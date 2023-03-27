package fold;

public class oper3 extends oper2 {
    public int powe(int base, int pow) {
        int res = 1;
        for (int index = 1; index <= pow; index++) {
            res = res * base;
        }
        return res;
    }
}
