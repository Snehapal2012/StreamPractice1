package Level1_Filtering_Mapping;

import java.util.Arrays;
import java.util.List;

public class RemoveNullFromList {
    public static void main(String[] args) {
        List<String> lists= Arrays.asList("Sneha",null,"Nilesh",null,"Sangita","Sekhar",null,"Prity");
        List<String> result=lists.stream().filter(i->i!=null).toList();
        System.out.println(result);
    }
}
