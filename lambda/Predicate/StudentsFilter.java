package Predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import javax.xml.stream.events.StartDocument;

public class StudentsFilter {
    public static void main(String[] args) {

        List<String> Students = new ArrayList<>();
        Students.add("Srinivasa");
        Students.add("Venu");
        Students.add("Srinu Kinga");
        Students.add("Sri");
        Students.add("Sri Krishna");
        Students.add("Venkatesh");
        Students.add("Navanitha");
        Students.add("Laxmi");
        Students.add("Vinay");

        Predicate<String> startsWithSri = name -> name.startsWith("Sri");
        Predicate<String> endsWithA = name -> name.endsWith("a");

        // boolean result=startsWithSri.and(endsWithA).test(
        // "Sri Krishna"
        // );

        // System.out.println(result);
        System.out.println("================Student with Sri Filtered================");

        Students.stream()
                .filter(startsWithSri)
                .forEach(System.out::println);

        System.out.println("===================Students With Start is Sri and End is a==================");

        Students.stream()
                .filter(startsWithSri.and(endsWithA))
                .forEach(System.out::println);


                 System.out.println("===================Students With Start is Sri Or End is a==================");

        Students.stream()
                .filter(startsWithSri.or(endsWithA))
                .forEach(System.out::println);


    }

}
