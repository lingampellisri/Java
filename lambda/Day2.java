import java.util.*;
public class Day2 {

    public static void PrintNames(String s)
    {
        System.out.println(s);
    }
    public static void main(String[] args) {
        System.out.println("Hello World Welcome");

        String Names[]={"Sri","Venu","Krishna","Ram","Visshuuuu"};

      Arrays.stream(Names).forEach(Day2::PrintNames);

    }
    
}
