import java.util.Scanner;

interface LetterCounter{
    int countLetter(String word);
}

interface WordComparison{
    void comparison(int a, int b, String w1, String w2);
}

public class DogCatString {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Введите первое слово: ");
        String word1 = input.nextLine();
        System.out.print("Введите второе слово: ");
        String word2 = input.nextLine();

        LetterCounter count = (word) -> word.length();

        int count1 = count.countLetter(word1);
        int count2 = count.countLetter(word2);

        WordComparison comparisonString = (a, b, w1, w2) -> {
            if (a == b) {
                System.out.println("Оба слова имеют одинаковое количество букв");
            }else {
                System.out.printf("Самое короткое слово: %s", a<b?w1:w2);
            }
        };

        comparisonString.comparison(count1, count2, word1, word2);
    }
}
