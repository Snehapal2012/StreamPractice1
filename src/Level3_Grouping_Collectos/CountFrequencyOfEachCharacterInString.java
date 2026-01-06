package Level3_Grouping_Collectos;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountFrequencyOfEachCharacterInString {
    public static void main(String[] args) {
        String s="Sanjana";
        Map<Character,Long> count=s.chars().filter(i->i!=' ').mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(count);

    }
}
