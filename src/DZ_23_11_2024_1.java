import java.util.Scanner;
public class DZ_23_11_2024_1 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int n_big = 0;
        int n_little = 0;
        String str = getString();
        for (int i = 0; i < str.length(); i++) {
           int code = str.codePointAt(i);
           if (code > 64 && code <91){
               n_big++;
           } else if (code > 96 && code <123){
               n_little++;
           }
        }
        System.out.print("Количество строчных букв: " + n_little + "\nКоличество прописных букв: " + n_big);
    }
    public static String getString(){
        System.out.print("Введите строку английскими буквами: ");
        String str = input.nextLine();
        for (int i = 0; i < str.length(); i ++) {
            int code = str.codePointAt(i);
            if (code < 32 || code > 122){
                System.out.println("Необходимо ввести строку именно английскими буквами. Повторите ввод.");
                return getString();
            }
        }
        return str;
    }
}
