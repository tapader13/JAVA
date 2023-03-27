import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class stream {
    public static void main(String[] args) {
        List<Integer> val = Arrays.asList(1, 2, 6, 5, 4, 6, 7, 8);
        // Stream<Integer> answer = val.stream()
        int answer = val.stream()
                .filter(n -> n % 2 != 0)
                .map(n -> n * 3)
                .sorted()
                .reduce(0, (a, b) -> a + b);
        System.out.println(answer);
        // answer.forEach(n -> System.out.print(n + " "));
    }
}
