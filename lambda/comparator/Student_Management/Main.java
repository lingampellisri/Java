package comparator.Student_Management;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import comparator.Student_Management.Student;

public class Main {
    public static void main(String[] args) {
      
        List<Student> students = new ArrayList<>();

        students.add(new Student(101, "Anil Kumar", 15, "CSE", "NIT Warangal"));
        students.add(new Student(102, "Bhavya Reddy", 5, "ECE", "IIIT Hyderabad"));
        students.add(new Student(103, "Charan Teja", 12, "EEE", "BITS Pilani"));
        students.add(new Student(104, "Deepika Sharma", 7, "CSE", "IIT Bombay"));
        students.add(new Student(105, "Eshwar Rao", 20, "ME", "IIT Madras"));
        students.add(new Student(106, "Farhana Sheikh", 3, "CSE", "IIT Delhi"));
        students.add(new Student(107, "Gopi Krishna", 18, "Civil", "IIT Kanpur"));
        students.add(new Student(108, "Hema Latha", 9, "IT", "NIT Trichy"));
        students.add(new Student(109, "Indu Priya", 1, "CSE", "IIT Bombay"));
        students.add(new Student(110, "Jayant Verma", 11, "ECE", "BITS Goa"));

        
          System.out.println("==================Welcome to Student Management==================");
        System.out.println(students);


             System.out.println("==================Sort by Roll Number==================");
             Collections.sort(students,new StudentSortByRoll());
             System.out.println(students);

             
             System.out.println("==================Sort by Name==================");
             Collections.sort(students,new StudentSortByName());
             System.out.println(students);

             
             System.out.println("==================Sort by Branch==================");
             Collections.sort(students,new StudentSortByBranch());
             System.out.println(students);



    }
}
