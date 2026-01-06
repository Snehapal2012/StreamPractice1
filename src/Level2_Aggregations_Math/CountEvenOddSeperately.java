package Level2_Aggregations_Math;

import java.util.Arrays;
import java.util.List;

public class CountEvenOddSeperately {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(2,3,4,5,6,7,8,9,10);
        int evenCount=(int)list.stream().filter(i->i%2==0).count();
        System.out.println(evenCount);
        int oddCount=(int)list.stream().filter(i->i%2!=0).count();
        System.out.println(oddCount);
    }
}
