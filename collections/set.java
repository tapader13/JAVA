import java.util.HashSet;
import java.util.Set;

public class set {
    public static void main(String[] args) {
        Set<Integer> ls = new HashSet<Integer>();
        // just enter uniqe value.Also not sorted.
        ls.add(1);
        ls.add(2);
        ls.add(3);
        ls.add(4);
        ls.add(2);

        for (int n : ls) {
            System.out.print(n + " ");
        }
    }
}
