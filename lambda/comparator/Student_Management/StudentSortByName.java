package comparator.Student_Management;

import java.util.Comparator;
import comparator.Student_Management.Student;

public class StudentSortByName implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'compare'");

        return o1.getFullName().compareTo(o2.getFullName());

                //Optional


        // return o1.getRoll()-o2.getRoll();

    }
    
}
