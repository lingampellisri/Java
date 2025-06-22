package employe_Management;

import java.util.*;

public class Employee {

    private Integer empId;
    private String fullName;
    private Integer Age;
    private String department;
    private Double Salary;

    public Employee(Integer empId, String fullName, Integer age, String department, Double salary) {
        this.empId = empId;
        this.fullName = fullName;
        Age = age;
        this.department = department;
        Salary = salary;
    }

    public Integer getEmpId() {
        return empId;
    }

    public String getFullName() {
        return fullName;
    }

    public Integer getAge() {
        return Age;
    }

    public String getDepartment() {
        return department;
    }

    public Double getSalary() {
        return Salary;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setAge(int age) {
        Age = age;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setSalary(double salary) {
        Salary = salary;
    }

    @Override
    public String toString() {
        return "Id : " + empId + " FullName :" + fullName + " Age :" + Age + " department :" + department + " Salary :"
                + Salary;
    }

}
