package Cars;

import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        byte n;
        Automobile car1 = new Automobile("X7 M50i", "2011", "BMW", "530 л.с.", "white", "108000 $");
        printAutomobile(car1);
        System.out.print("Хотите ли вы ввести данные нового автомобиля?\n1 - Да\n0 - Нет\n");
        n = getChoice();
        if (n ==1){
            input.nextLine();
            Automobile car2 = new Automobile(null, null, null,null,null, null);
            System.out.print("Введите название модели: ");
            car2.setName(getData());
            System.out.print("Введите год выпуска: ");
            car2.setYear(getData());
            System.out.print("Введите бренд автомобиля: ");
            car2.setBrand(getData());
            System.out.print("Введите мощность двигателя: ");
            car2.setPower(getData());
            System.out.print("Введите цвет автомобиля: ");
            car2.setColor(getData());
            System.out.print("Введите цену: ");
            car2.setPrice(getData());
            printAutomobile(car2);
        }
    }
    public static void printAutomobile(Automobile car){
        System.out.println("********** Данные автомобиля **********");
        System.out.println("Название модели: " + car.getName());
        System.out.println("Год выпуска: " + car.getYear());
        System.out.println("Производитель: " + car.getBrand());
        System.out.println("Мощность двигателя: " + car.getPower());
        System.out.println("Цвет машины: " + car.getColor());
        System.out.println("Цена: " + car.getPrice());
        System.out.println("========================================");
    }
    static byte getChoice(){
        byte n;
        System.out.print("Введите 1 или 0: ");
        if(input.hasNextByte()){
            n = input.nextByte();
            if (n == 0 || n == 1){
                return n;
            }else{
                System.out.print("Ошибка ввода. Повторите ввод: ");
                return getChoice();
            }
        }else{
            input.nextLine();
            System.out.print("Ошибка ввода. Повторите ввод: ");
            return getChoice();
        }
    }
    static String getData(){
        return input.nextLine();
    }
}
