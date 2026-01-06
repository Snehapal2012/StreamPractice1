package Level1;

import java.util.Arrays;
import java.util.List;

public class FilterNamesStartWithS {
    public static void main(String[] args) {
        List<String> lists= Arrays.asList("Sneha","Nilesh","Sangita","Sekhar","Prity");
        List<String> result=lists.stream().filter(i->i.startsWith("S")).toList();
        System.out.println(result);
    }
}
