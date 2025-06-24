package comparator.Student_Management;

import java.util.Comparator;
import comparator.Student_Management.Student;

public class StudentSortByRoll implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'compare'");

        return o1.getRoll().compareTo(o2.getRoll());

                //Optional


        // return o1.getRoll()-o2.getRoll();

    }
    
}
