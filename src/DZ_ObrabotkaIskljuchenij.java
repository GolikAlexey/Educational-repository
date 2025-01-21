import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DZ_ObrabotkaIskljuchenij {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Введите строку: ");
            String vvod = input.nextLine();
            System.out.println("\nИсходная строка: " + vvod);
            try {
                verificationLitter(vvod);
                System.out.println("Строка содержит гласные буквы.");
            } catch (ExceptionString e) {
                System.out.println(e.getMessage());
            }
        }
        public static void verificationLitter(String stringInput) throws ExceptionString {
            String shablon = "[AEIOUYaeiouyАОЭЕЁИЫУЮЯаоэеиыуёюя]+";
            Pattern pattern1 = Pattern.compile(shablon);
            Matcher matcher1 = pattern1.matcher(stringInput.toLowerCase());
            if (!matcher1.find()) {
                throw new ExceptionString("Ошибка.\nСтрока не содержит гласные буквы.");
            }
        }

}

class ExceptionString extends Exception {
    public ExceptionString(String message) {
        super(message);
    }
}
