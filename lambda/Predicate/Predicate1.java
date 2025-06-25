package Predicate;

import java.util.function.Predicate;

/**
 * A Functional Interface is an Interface which allows only one Abstract method within the Interface scope. 
 * There are some predefined functional interface in Java like Predicate,
 *  consumer, supplier etc. The return type of a Lambda function (introduced in JDK 1.8) is a also functional interface.
 *  The Functional Interface PREDICATE is defined in the java.util.function package.
 *  It improves manageability of code, helps in unit-testing them separately
 */

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
