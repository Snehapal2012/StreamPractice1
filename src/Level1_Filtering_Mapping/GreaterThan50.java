package Level1_Filtering_Mapping;

import java.util.Arrays;
import java.util.List;

public class GreaterThan50 {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(20,65,35,18,97,46);
        /*
         * map() cannot be used to select elements.
         It is used to transform elements.

         Why map() will not work

         You want:

         Print values greater than 50

         That means:

         Keep some elements

         Discard others

         This is exactly what filter() does.

         What map() actually does

         map():

         Takes one element

         Converts it into another element

         Does not remove anything
         **/
        list.stream().filter(i->i>50).forEach(System.out::println);
    }
}
