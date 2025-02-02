import java.util.Scanner;
import java.util.TreeSet;

public class Homework_Set {
    public static void main(String[] args) {
        TreeSet<Integer> integers = new TreeSet<>();
        for (byte i = 0; i < 5; i++) {
            integers.add(getNumber());
        }
        System.out.println("Наименьший элемент: " + integers.first());
    }

    static int getNumber(){
        Scanner input = new Scanner(System.in);
        System.out.print("-> ");
        if(input.hasNextInt()){
            return input.nextInt();
        }else{
            System.out.println("Ошибка ввода. Повторите ввод.");
            return getNumber();
        }
    }
}
