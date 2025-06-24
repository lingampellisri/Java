package comparator.Student_Management;

public class Student {

    Integer Roll;

    String fullName;
    Integer Rank;
    String Branch;
    String Clg;

    public Student(Integer roll, String fullName, Integer rank, String branch, String clg) {
        Roll = roll;
        this.fullName = fullName;
        Rank = rank;
        Branch = branch;
        Clg = clg;
    }

    public Integer getRoll() {
        return Roll;
    }

    public void setRoll(Integer roll) {
        Roll = roll;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Integer getRank() {
        return Rank;
    }

    public void setRank(Integer rank) {
        Rank = rank;
    }

    public String getBranch() {
        return Branch;
    }

    public void setBranch(String branch) {
        Branch = branch;
    }

    public String getClg() {
        return Clg;
    }

    public void setClg(String clg) {
        Clg = clg;
    }




    @Override
    public String toString()
    {
        return "Roll :"+Roll+", FullName :"+fullName+", Rank :"+Rank+", Branch :"+Branch+", Clg :"+Clg+"\n";
    }

}
