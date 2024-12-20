package Person;

public class Teacher extends Human{
    private String scientific_degree;
    private String faculty;
    private String lesson;
    private int teaching_experience;
    private int teaching_load;

    public Teacher(String lastName, String firstName, int age, String scientific_degree, String faculty, String lesson, int teaching_experience, int teaching_load){
        super(lastName, firstName, age);
        setScientificDegree(scientific_degree);
        setFaculty(faculty);
        setLesson(lesson);
        setTeachingExperience(teaching_experience);
        setTeachingLoad(teaching_load);
        System.out.println("TeacherConstructor:\t" + Integer.toHexString(hashCode()));
    }

    public String getScientificDegree() {
        return scientific_degree;
    }

    public void setScientificDegree(String speciality) {
        this.scientific_degree = scientific_degree;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String group) {
        this.faculty = faculty;
    }

    public String getLesson() {
        return lesson;
    }

    public void setLesson(String lesson) {
        this.lesson = lesson;
    }

    public int getTeachingExperience() {
        return teaching_experience;
    }

    public void setTeachingExperience(int teaching_experience) {
        this.teaching_experience = teaching_experience;
    }

    public int getTeachingLoad() {
        return teaching_load;
    }

    public void setTeachingLoad(int teaching_load) {
        this.teaching_load = teaching_load;
    }

    @Override
    public String toString() {
        return super.toString() + " Teacher{" +
                "scientific_degree='" + scientific_degree + '\'' +
                ", faculty='" + faculty + '\'' +
                ", lesson=" + lesson +
                ", teaching_experience=" + teaching_experience +
                ", teaching_load=" + teaching_load +
                '}';
    }
}