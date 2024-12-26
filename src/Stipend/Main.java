package Stipend;
public class Main {
    public static void main(String[] args) {
        Student S1 = new Student("Иван", "Иванов", "РТФ-Б-2301", Math.ceil(10*(Math.random()+4))/10);
        Aspirant A1 = new Aspirant("Пётр", "Петров", "РТФ-А-2401", Math.ceil(10*(Math.random()+4))/10, "Нанотехнологии в приборостроении");
        System.out.println(S1.getLastname() + " " + S1.getName() + ", группа: " + S1.getGroup() + ", средний балл: " + S1.getAverageGrade() + ", сумма стипендии: " + S1.stipend());
        System.out.println(A1.getLastname() + " " + A1.getName() + ", группа: " + A1.getGroup() + ", тема диссертации: " + A1.getDissertation() + ", средний балл: " + A1.getAverageGrade() + ", сумма стипендии: " + A1.stipend());
    }
}
