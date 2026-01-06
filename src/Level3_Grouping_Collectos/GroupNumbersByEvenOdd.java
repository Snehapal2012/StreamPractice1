package Level3_Grouping_Collectos;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupNumbersByEvenOdd {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(2,3,4,5,6,7,8,9,10);
        Map<Boolean,List<Integer>> even=list.stream().collect(Collectors.groupingBy(i->i%2==0));
        System.out.println(even);
    }
}
