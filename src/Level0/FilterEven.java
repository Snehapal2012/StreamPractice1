package Level0;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterEven {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(20,65,35,18,97,46);
        list.stream().filter(i->i%2==0).forEach(System.out::println);
        List<Integer> result=list.stream().filter(i->i%2==0).collect(Collectors.toList());
        System.out.println(result);
    }
}
