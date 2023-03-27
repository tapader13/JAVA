
import java.util.Collection;
import java.util.Iterator;
import java.util.TreeSet;

public class tree {
    public static void main(String[] args) {
        // Integer---generic
        Collection<Integer> ls = new TreeSet<Integer>();
        // just enter uniqe value.Also not sorted.
        ls.add(1);
        ls.add(2);
        ls.add(3);
        ls.add(4);
        ls.add(2);
        Iterator<Integer> val = ls.iterator();
        while (val.hasNext()) {
            System.out.print(val.next());
        }
        // for (int n : ls) {
        // System.out.print(n + " ");
        // }
    }
}
