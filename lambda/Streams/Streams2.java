import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Explanation of the above Program:
List Creation:

The names list is created with sample strings.
Stream Operations:

forEach: Prints each name in the list.
collect: Filters names starting with 'S' and collects them into a new list.
reduce: Concatenates all names into a single string.
count: Counts the total number of names.
findFirst: Finds and prints the first name in the list.
allMatch: Checks if all names start with 'S'.
anyMatch: Checks if any name starts with 'S'.
 */

public class Streams2 {


    public static void main(String[] args) {
        System.out.println("================Terminal Operations==================");

               List<String> names = Arrays.asList(
            "Reflection", "Collection", "Stream",
            "Structure", "Sorting", "State"
        );

        System.out.println("==========For Each ============");

        names.stream().forEach(System.out::println);

        System.out.println("===========Collect============");

        List<String> result=names.stream()
        .filter(name->name.startsWith("S"))
        .collect(Collectors.toList());

            result.stream().forEach(System.out::println);


            System.out.println("============== Reduce ============= ");
            String concateNames=names.stream().reduce("", (partial,actual)->partial+" "+actual);
            System.out.println(concateNames.trim());

            System.out.println("=================Count=============");
            long count=names.stream().count();
            System.out.println(count);

            System.out.println("============find first================");
            Optional<String> s=names.stream().findFirst();
            s.ifPresent(System.out::println);

            System.out.println("===============All match ============");
            boolean allStartWithS=names.stream().allMatch(n->n.startsWith("S"));
            System.out.println(allStartWithS);

            
            System.out.println("===============Any match ============");
            boolean anyStartWithS=names.stream().anyMatch(n->n.startsWith("S"));
            System.out.println(anyStartWithS);

            

    }
    
}
