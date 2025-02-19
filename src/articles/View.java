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
                "\n3 - просмотр определенной статьи" +
                "\n4 - удаление статьи" +
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
        for (Object element : articles){
            System.out.println(element);
        }
        System.out.println("==============================================================");
    }

    public String getUserArticle(){
        System.out.println("====================== Ввод названия статьи ========================");
        System.out.print("-> ");
        String user_article = input.nextLine();
        System.out.println("==============================================================");
        return user_article;
    }
    public void showSingleArticles(Map article){
        System.out.println("====================== Просмотр статьи ========================");
        for (Object el: article.entrySet()){
            System.out.println(el);
        }
        System.out.println("==============================================================");
    }
    public void showIncorrectTitleError(String userTitle){
        System.out.println("====================== Сообщение об ошибке ========================");
        System.out.println("Статьи с названием " + userTitle + " не существует");
        System.out.println("==============================================================");
    }
    public void removeSingleArticle(Article article){
        System.out.println("====================== Удаление статьи ========================");
        System.out.println("Статья " + article + " - была удалена");
        System.out.println("==============================================================");
    }
    public void showIncorrectAnswerError(String answer){
        System.out.println("====================== Сообщение об ошибке ========================");
        System.out.println("Варианта " + answer + " не существует");
        System.out.println("==============================================================");
    }
}
