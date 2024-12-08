import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Homework_9_12_2024_1 {
    public static void main(String[] args) {
        String phones = "+7 499 456-45-78, +74994564578, 7 (499) 456 45 78, 7 (499) 456-45-78";
        String pattern = "\\+?7\\s?\\(?499\\)?\\s?\\d{3}(\\s|-)?\\d{2}(\\s|-)?\\d{2}";
        Pattern regex = Pattern.compile(pattern);
        Matcher matcher = regex.matcher(phones);
        while(matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
