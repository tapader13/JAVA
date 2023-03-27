import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class arrayList {
    public static void main(String[] args) {
        List<Integer> ls = new ArrayList<>();
        ls.add(1);
        ls.add(2);
        ls.add(6);
        ls.add(4);
        ls.add(5);
        Collections.sort(ls);
        System.out.println(ls);
    }
}