package Level0;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SquareOfEachNumber {
    public static void main(String[] args) {
        //Square of each number in the list and collect them
        List<Integer> list= Arrays.asList(2,3,4,5,6,7,8,9,10);
        //filter must return boolean
        /*
        You want to square each number and collect the results.
         That means you should use map, not filter.

         filter → keeps or removes elements

         map → transforms elements
         **/

        List<Integer> result=list.stream().map(i->i*i).collect(Collectors.toList());
        System.out.println(result);
    }
}
