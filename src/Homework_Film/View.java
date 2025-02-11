package Homework_Film;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class View {
    Scanner input = new Scanner(System.in);
    public String waitUserAnswer(){
        System.out.println("===== Редактирование данных каталога фильмов =====");
        System.out.println("Действия с фильмами:");
        System.out.println("1 - добавление фильма" +
                "\n2 - каталог фильмов" +
                "\n3 - просмотр выбранного фильма" +
                "\n4 - удаление фильма" +
                "\nq - выход из программы");
        System.out.print("Выберите вариант действия: ");
        String userAnswer = input.nextLine();
        System.out.println("==============================================================");
        return userAnswer;
    }
    public Map addUserFilm(){
        Map<String, String> dictFilm = new LinkedHashMap<>();
        dictFilm.put("название", "");
        dictFilm.put("жанр", "");
        dictFilm.put("режиссёра", "");
        dictFilm.put("год выпуска", "");
        dictFilm.put("студию", "");
        dictFilm.put("актёров", "");
        System.out.println("================ Добавление фильма ================");
        for (Map.Entry<String, String> el : dictFilm.entrySet()){
            System.out.print("Введите " + el.getKey() + " фильма: ");
            dictFilm.put(el.getKey(), input.nextLine());
        }
        System.out.println("==============================================================");
        return dictFilm;
    }
    public void showAllFilms(Collection films){
        System.out.println("====================== Каталог фильмов ========================");
        for (var element : films){
            System.out.println(element);
        }
        System.out.println("==============================================================");
    }
}
