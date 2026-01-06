package Level0;

import java.util.Arrays;
import java.util.List;

public class ConvertListToStream {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(20,65,35,18,97,46);
        list.stream().forEach(System.out::println);
    }
}
