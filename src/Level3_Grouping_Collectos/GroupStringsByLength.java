package Level3_Grouping_Collectos;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupStringsByLength {
    public static void main(String[] args) {
        List<String> lists= Arrays.asList("Sneha","Nilesh","Sangita","Sekhar","Prity");
        Map<Integer,List<String>> ans= lists.stream().collect(Collectors.groupingBy(String::length));
        System.out.println(ans);
    }
}
