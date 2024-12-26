package Stipend;

public class Student {
    private String lastname;
    private String name;
    private String group;
    private double average_grade;

    public Student(String lastname, String name, String group, double average_grade) {
        this.lastname = lastname;
        this.name = name;
        this.group = group;
        this.average_grade = average_grade;
    }

    public String getLastname() {
        return lastname;
    }

    public String getName() {
        return name;
    }

    public String getGroup() {
        return group;
    }

    public double getAverageGrade() {
        return average_grade;
    }

    public int stipend(){
        if (average_grade == 5.0){
            return 1000;
        } else {
            return 800;
        }
    }
}
