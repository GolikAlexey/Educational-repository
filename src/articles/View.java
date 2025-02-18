package articles;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class View {
    Scanner input = new Scanner(System.in);
    public String waitUserAnswer(){
        System.out.println("================ Ввод пользовательских данных ================");
        System.out.println("Действия со статьями:");
        System.out.println("1 - создание статьи" +
                "\n2 - просмотр статей" +
                "\nq - выход из программы");
        System.out.print("Выберите вариант действия: ");
        String userAnswer = input.nextLine();
        System.out.println("==============================================================");
        return userAnswer;
    }
    public Map addUserArticle(){
        Map<String, String> dictArticle = new LinkedHashMap<>();
        dictArticle.put("название", "");
        dictArticle.put("автора", "");
        dictArticle.put("количество страниц", "");
        dictArticle.put("описание", "");
        System.out.println("================ Создание статьи ================");
        for (Map.Entry<String, String> el : dictArticle.entrySet()){
            System.out.print("Введите " + el.getKey() + " статьи: ");
            dictArticle.put(el.getKey(), input.nextLine());
        }
        System.out.println("==============================================================");
        return dictArticle;
    }
    public void showAllArticles(Collection articles){
        System.out.println("====================== Список статей ========================");
        for (var element : articles){
            System.out.println(element);
        }
        System.out.println("==============================================================");
    }
}
