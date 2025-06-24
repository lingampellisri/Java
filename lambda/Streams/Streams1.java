import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Streams1 {
 
    
    public static void main(String[] args) {

              List<List<String>> listOfLists = Arrays.asList(
            Arrays.asList("Reflection", "Collection", "Stream"),
            Arrays.asList("Structure", "State", "Flow"),
            Arrays.asList("Sorting", "Mapping", "Reduction", "Stream")
        );

        Set<String>intermediate=new HashSet<>();


        List<String>result= listOfLists.stream()
                .flatMap(List::stream)
                .filter(s->s.startsWith("S"))
                .map(String::toUpperCase)
                .distinct()
                .sorted()
                .peek(s->intermediate.add(s))
                .collect(Collectors.toList());

                System.out.println("===============Intermediate Results=================");

                intermediate.forEach(System.out::println);

            System.out.println("=============Final Results===============");

            result.forEach(s->System.out.println(s));

                
                

        
        
    }

}
