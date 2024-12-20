package Person;

public class Main {
    public static void main(String[] args) {
        Human human = new Human("Батодалаева", "Даша", 16);
        System.out.println(human);
//        System.out.println(human.toString());

        Student student = new Student("Загидуллина", "Линара", 32, "Математика", "MM_220", 90, 95);
        System.out.println(student);

        Teacher teacher = new Teacher("Петрова", "Ирина", 41,"Кандидат наук", "Экономический", "Менеджмент", 17, 23);
        System.out.println(teacher);
    }
}
