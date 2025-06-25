package Predicate;

import java.util.function.Predicate;

public class Predicate1 {

    public static void main(String[] args) {
    System.out.println("Welcome to the Precicates tutorial ");
 
    Predicate<Integer>isEven=num->num%2==0;
    System.out.println(isEven.test(10));

    Predicate<String>startsWithS=name->name.startsWith("S");
    System.out.println(startsWithS.test("Srinivas"));
      System.out.println(startsWithS.test("Navanitha"));

    

    }
    
}
