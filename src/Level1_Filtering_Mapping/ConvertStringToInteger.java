package Level1_Filtering_Mapping;

import java.util.Arrays;
import java.util.List;

public class ConvertStringToInteger {
    public static void main(String[] args) {
        List<String> lists= Arrays.asList("12","23","34","45","56");
        List<Integer> result=lists.stream().map(Integer::parseInt).toList();
        System.out.println(result);
    }
}
