package employe_Management;

import java.util.ArrayList;
import java.util.List;
import employe_Management.Employee;

public class EmployeService {

    public static List<Employee> employes = new ArrayList<>();

    public static void getAllEmployees() {
        employes.forEach((emp) -> System.out.println(emp));
    }

    public static boolean addEmpployee(employe_Management.Employee emp) {
        return employes.add(emp);

    }

    public static int SortByName(employe_Management.Employee e1, employe_Management.Employee e2) {
        return e1.getFullName().compareTo(e2.getFullName());
    }

    public static int SortByAge(employe_Management.Employee e1, employe_Management.Employee e2) {
        return e1.getAge().compareTo(e2.getAge());
    }

    public static int SortById(employe_Management.Employee e1, employe_Management.Employee e2) {
        return e1.getEmpId().compareTo(e2.getEmpId());
    }

    public static int SortByDepartment(employe_Management.Employee e1, employe_Management.Employee e2) {
        return e1.getDepartment().compareTo(e2.getDepartment());
    }

    public static int SortBySalary(employe_Management.Employee e1, employe_Management.Employee e2) {
        return e1.getSalary().compareTo(e2.getSalary());
    }

    public static int sortByAgeThenName(Employee e1,Employee e2)
    {
        int result=e1.getAge().compareTo(e2.getAge());
        if(result==0)
        {
            return e1.getFullName().compareTo(e2.getFullName());
        }
        else{
            return result;
        }
    }


    /**
     * import java.util.Comparator;

        Collections.sort(EmployeService.employes, 
            Comparator.comparing(Employee::getAge)
                    .thenComparing(Employee::getFullName)
        );
     * 
     */

}
