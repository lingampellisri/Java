package comparator.Student_Management;

import java.util.Comparator;
import comparator.Student_Management.Student;

public class SortByNameAndBranch implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'compare'");


        int result=o1.getFullName().compareTo(o2.getFullName());

        if(result==0)
        return o1.getBranch().compareTo(o2.getBranch());

        return result;
                //Optional


        // return o1.getRoll()-o2.getRoll();

    }
    
}
