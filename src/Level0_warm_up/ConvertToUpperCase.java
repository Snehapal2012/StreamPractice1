package Level0_warm_up;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertToUpperCase {
    public static void main(String[] args) {
        List<String> lists= Arrays.asList("Sneha","Nilesh","Sangita","Sekhar","Prity");
        List<String> result=lists.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(result);
    }

}
