package Level2_Aggregations_Math;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MaxAndMin {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(2,3,4,5,6,7,8,9,10);
        int maxi=list.stream().max(Comparator.naturalOrder()).get();
        int mini=list.stream().min(Comparator.naturalOrder()).get();
        int maxi2=list.stream().mapToInt(Integer::intValue).max().orElseThrow();
        int mini2=list.stream().mapToInt(Integer::intValue).min().orElseThrow();
        System.out.println(maxi2);
        System.out.println(mini2);
    }
}
