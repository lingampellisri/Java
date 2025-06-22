import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 
 * Sorting the Person details based on the Name , Age and also and Salary
 * 
 */

class Person {
    String Name;
    Integer Age;
    Double Salary;

    public Person(String Name, Integer Age, Double Salary) {
        this.Name = Name;
        this.Age = Age;
        this.Salary = Salary;
    }

    public String getName() {
        return Name;
    }

    public Integer getAge() {
        return Age;
    }

    public Double getSalary() {
        return Salary;
    }


@Override
public String toString() {
    return 
            "Name='" + Name + '\'' +
            ", Age=" + Age +
            ", Salary=" + Salary +"\n"
            ;
}

}

public class Day3 {

    public static int compareByName(Person a,Person b)
    {
        return a.getName().compareTo(b.getName());
    }

    public static int compareByAge(Person a,Person b)
    {
        return a.getAge().compareTo(b.getAge());
    }

        public static int compareBySalary(Person a,Person b)
    {
        return a.getSalary().compareTo(b.getSalary());
    }



    public static void main(String[] args) {

        List<Person>persons=new ArrayList<>();
        
        persons.add(new Person("Srinivas", 22, 20000.0));
          persons.add(new Person("Venu", 25, 50000.0));

            persons.add(new Person("Narendra", 21, 30000.0));

              persons.add(new Person("Srujan", 23, 50000.0));

                persons.add(new Person("Navanitha", 21, 30000.0));
                  persons.add(new Person("Ankitha", 23, 60000.0));
                      persons.add(new Person("anvitha", 22, 30000.0));

                System.out.println("******************Sort by Name*******************");


                Collections.sort(persons,Day3::compareByName);

                System.out.println(persons);

                System.out.println("******************Sort by Age*******************");

                Collections.sort(persons,Day3::compareByAge);

                System.out.println(persons);



                System.out.println("******************Sort by Salary*******************");

                Collections.sort(persons,Day3::compareBySalary);

                System.out.println(persons);




    }

}
