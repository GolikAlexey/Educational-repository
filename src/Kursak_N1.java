import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Kursak_N1 {
    public static void main(String[] args) {
        try {
            File file = new File("Baza.txt");
            if (file.createNewFile()) {
                System.out.println("Файл создан");
            } else {
                System.out.println("Файл уже существует");
            }
        } catch (IOException e) {
            System.out.println("Ошибка при создании файла");
            e.printStackTrace();
        }
        byte vvod;
        String name;
        Scanner input = new Scanner(System.in, "cp866");
        String[][] magaziny = new String[8][4];


        System.out.println("\nБАЗА ДАННЫХ \"МАГАЗИНЫ\"\n");
        System.out.print("Для добавления новых магазинов и товаров введите цифру 1\nДля просмотра базы данных введите цифру 2\n\nВвод: ");
        vvod = input.nextByte();
        if (vvod == 1){
            // Сохранять новый магазин и товар в файл Baza.txt
        } else if (vvod == 2) {
            // Наполнить массив magaziny данными из файла Baza.txt
            // Вывести список магазинов в алфавитном порядке

            magaziny[0][0] = "Командор";
            magaziny[0][1] = "Яблоки";
            magaziny[0][2] = "Груши";
            magaziny[0][3] = "Творог";
            magaziny[1][0] = "Пятёрочка";
            magaziny[1][1] = "Сок";
            magaziny[1][2] = "Шоколадка";
            magaziny[1][3] = "Сыр";

            System.out.print("\nСписок магазинов:\n--------------------\n");
            for(int i=0; i<=7; i++){
                System.out.println(magaziny[i][0]);
            }

            input.nextLine();
            System.out.print("\nВведите название магазина: ");
            name = input.nextLine();
            //System.out.println(name);
            //System.out.println(magaziny[0][0]);
            for (int i=0; i<=7; i++) {
                if (name.equalsIgnoreCase(magaziny[i][0])){
                    System.out.println("\nТовары этого магазина:\n");
                    for (int j=1; j<=3; j++) {
                        System.out.println(magaziny[i][j] + "\n------------------------------");
                    }
                    break;
                }
                else {
                    if (i == 7){
                        System.out.println("\nВведённый Вами магазин отсутствует в базе данных\n");
                    }
                }

            }
        } else {
            System.out.println("\nВы должны ввести 1 или 2");
        }
    }
}