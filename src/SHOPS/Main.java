package SHOPS;

import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        char command;
        boolean quit = false;
        TreeSet<String> shops = new TreeSet<>();

        System.out.println("СПИСОК КОМАНД\nq - выход из программы\n1 - вывести список магазинов\n2 - ввести название магазина для просмотра\n3 - добавить новый магазин\n4 - удалить магазин из списка");

        while(quit == false){
            System.out.print("\nВведите команду: ");
            command = input.next().charAt(0);
            input.nextLine();
            switch(command){
                case 'q':
                    //сохранение
                    quit = true;
                    break;
                case '2':
                    shop(shops);
                    break;
                case '3':
                    System.out.print("\nВведите название нового магазина: ");
                    shops.add(input.nextLine());
                    System.out.println("Новый магазин добавлен в список");
                    break;
                default:
                    System.out.println("Введена несуществующая команда");
                    break;
            }
        }
    }

    static void shop(TreeSet<String> shops){
        char command_shop;
        boolean quit_in_gm = false;
        String shop;
        System.out.print("\nВведите название магазина: ");
        shop = input.nextLine();
        System.out.println(shop); //тестовая
        //Проверить, равен ли shop одному из магазинов списка
        System.out.println("Список команд:\n8 - вывести список товаров\n9 - добавить новый товар\n0 - вернуться в главное меню");
        while(quit_in_gm == false){
            System.out.print("\nВведите команду: ");
            command_shop = input.next().charAt(0);
            switch(command_shop){
                case '9':
                    Tovar new_tovar = new Tovar(null, null, 0, 1,true);
                    new_tovar.setName();
                    new_tovar.setCode();
                    new_tovar.setPrice();
                    new_tovar.setQuantity();
                    new_tovar.setUnit();
                    break;
                case '0':
                    System.out.println("Выход в главное меню");
                    quit_in_gm = true;
                    break;
                default:
                    System.out.println("Введена несуществующая команда");
                    break;
            }
        }
    }
}
