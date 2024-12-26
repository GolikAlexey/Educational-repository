package Stipend;

public class Aspirant extends Student{
    private String dissertation;

    public Aspirant(String lastname, String name, String group, double average_grade, String dissertation) {
        super(lastname, name, group, average_grade);
        this.dissertation = dissertation;
    }

    public String getDissertation() {
        return dissertation;
    }

    @Override
    public int stipend(){
        return super.stipend()+1000;
    }
}
