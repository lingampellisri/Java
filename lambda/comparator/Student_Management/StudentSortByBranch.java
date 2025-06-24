package comparator.Student_Management;

import java.util.Comparator;
import comparator.Student_Management.Student;

public class StudentSortByBranch implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'compare'");

        return o1.getBranch().compareTo(o2.getBranch());

                //Optional


        // return o1.getRoll()-o2.getRoll();

    }
    
}
