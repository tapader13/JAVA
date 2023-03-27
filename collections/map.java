import java.util.HashMap;
import java.util.Map;

public class map {
    public static void main(String[] args) {
        Map<String, Integer> ls = new HashMap<>();
        ls.put("minhaj", 1);
        ls.put("uddin", 2);
        ls.put("tapader", 3);
        ls.put("muhammod", 4);
        System.out.println(ls.keySet());
        for (String key : ls.keySet()) {
            System.out.println(key + "___" + ls.get(key));
        }

    }
}
