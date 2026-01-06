package Level2;

import java.util.Arrays;
import java.util.List;

public class SumOfAll {
    public static void main(String[] args) {
        /*
        Why mapToInt() is used
Short answer

mapToInt() converts a Stream of objects (Stream<Integer>) into a primitive stream (IntStream).

That gives you:

Better performance

Built-in numeric operations like sum(), average(), max()

What happens without mapToInt()
list.stream()
    .map(i -> i)
    .sum();   // ❌ compile-time error


Why?

Stream<Integer> does not have sum()

What mapToInt() does
list.stream()
    .mapToInt(Integer::intValue)
    .sum();

Conversion:
Stream<Integer>  →  IntStream


Now you can call:

sum()

average()

max()

min()
         */
        List<Integer> list= Arrays.asList(2,3,4,5,6,7,8,9,10);
        int result=list.stream().mapToInt(Integer::intValue).sum();
        System.out.println(result);
    }
}
