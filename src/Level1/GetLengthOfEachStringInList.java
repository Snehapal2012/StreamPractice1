package Level1;

import java.util.Arrays;
import java.util.List;

public class GetLengthOfEachStringInList {
    public static void main(String[] args) {
        List<String> lists= Arrays.asList("Sneha","Nilesh","Sangita","Sekhar","Prity");
        List<Integer> result=lists.stream().map(i->i.length()).toList();
        System.out.println(result);
    }
}
