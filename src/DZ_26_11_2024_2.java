import java.util.Scanner;
public class DZ_26_11_2024_2 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        String str1;
        String str2;
        System.out.print("Введите строку: ");
        str1 = input.nextLine();
        str1 = str1.replaceAll("\s", "");
        char[] expanding = new char[str1.length()];
        for (int i = 0; i < str1.length(); i++) {
            expanding[str1.length()-1-i] = str1.charAt(i);
        }
        str2 = new String(expanding);
        System.out.println(str2.equalsIgnoreCase(str1)?"Это палиндром":"Это НЕ палиндром");
    }
}
