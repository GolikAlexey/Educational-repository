import java.util.function.Predicate;

public class StringCheck {
    public static void main(String[] args) {
        String str1 = "";
        String str2 = "Заполненная строка";
        Predicate<String> check = str -> str.equals("");
        System.out.println("Строка 1: " + str1 + "\nПустая ли строка? " + check.test(str1) + "\n");
        System.out.println("Строка 2: " + str2 + "\nПустая ли строка? " + check.test(str2));
    }
}
