package Predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class StudentsFilter {
    public static void main(String[] args) {

        List<String> Students = new ArrayList<>();
        Students.add("Srinivas");
        Students.add("Venu");
        Students.add("Srinu");
        Students.add("Sri");
        Students.add("Sri Krishna");
        Students.add("Venkatesh");
        Students.add("Navanitha");
        Students.add("Laxmi");
        Students.add("Vinay");

        Predicate<String>startsWithSri=name->name.startsWith("Sri");

        Students.stream()
        .filter(startsWithSri)
        .forEach(System.out::println);


    }

}
