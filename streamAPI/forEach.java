import java.util.Arrays;
import java.util.List;

public class forEach {
    public static void main(String[] args) {
        List<Integer> val = Arrays.asList(1, 2, 6, 5, 4, 6, 7, 8);
        val.forEach(n -> System.out.print(n + " "));
    }
}