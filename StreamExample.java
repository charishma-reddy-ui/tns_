package tns_;
import java.util.*;
import java.util.stream.*;

public class StreamExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

        List<Integer> result = numbers.stream()
            .filter(n -> n % 2 == 0)    // step 1: filter even numbers
            .map(n -> n * 2)            // step 2: double each number
            .collect(Collectors.toList());  // step 3: collect result

        System.out.println(result);  // Output: [4, 8, 12]
    }
}
