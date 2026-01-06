package Level2_Aggregations_Math;

import java.util.Arrays;
import java.util.List;

public class AverageOfNumbers {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(2,3,4,5,6,7,8,9,10);
        Float result=(float)list.stream().mapToInt(Integer::intValue).average().orElseThrow();
        System.out.println(result);
    }
}
