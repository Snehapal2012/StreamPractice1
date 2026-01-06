package Level0_warm_up;

import java.util.Arrays;
import java.util.List;

public class CountElementsPresentInList {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(2,3,4,5,6,7,8,9,10);
        Long result=list.stream().count();
        System.out.println(result);
    }
}
