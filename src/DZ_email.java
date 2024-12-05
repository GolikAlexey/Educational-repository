import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class DZ_email {
    public static void main(String[] args) {
        String email = "123456@i.ru, 123_456@ru.name.ru, login@i.ru, логин-1@i.ru, login.3@i.ru, login.3-67@i.ru, 1login@ru.name.ru";
        //String pattern = "[1-9]";
        String pattern = "([\\wА-Яа-яЁё.-]+)[@](i.|ru.name.)ru";
        Pattern regex = Pattern.compile(pattern);
        Matcher matcher = regex.matcher(email);
        System.out.print("[");
        while(matcher.find()){
            System.out.print("'" + matcher.group() + "', ");
        }
        System.out.print("\b\b]");
    }
}
