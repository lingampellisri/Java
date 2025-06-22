
// package lambda;

import java.util.*;

interface stringFunction
{
    String Greet(String str);
}

public class Day1
{
    public static void main(String[] args) {


        stringFunction exclaim=s->s+"!";
        stringFunction  ask=s->s+" World! fuck offffffffffffffffffffffffffffffffffff";

        stringFunction myFrd=(s)->{String str=s+" you should Earn the Money Before you should expireee!"; return str;};
        
        printFormatString("Hello", exclaim);
        printFormatString("Hello", ask);
        printFormatString("Srinivas", ask);
        printFormatString("Kamal Hassan", ask);
        printFormatString("Srinivas Lingampelli ", myFrd);

    //   System.out.println("Hello World");  
    }

    public static void printFormatString(String str,stringFunction format)
    {
        String result=format.Greet(str);
        System.out.println(result);
    }
}