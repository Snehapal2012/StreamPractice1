package Level3_Grouping_Collectos;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountFrequencyOfWordsInSentence {
    public static void main(String[] args) {
        String s="Today is tuesday tomorrow is wednesday";
        Map<String,Long> count= Arrays.stream(s.split(" ")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(count);
    }
}
