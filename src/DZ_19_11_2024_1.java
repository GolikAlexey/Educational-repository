import java.util.Scanner;
public class DZ_19_11_2024_1 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("ВВОД КОЛИЧЕСТВА ЭЛЕМЕНТОВ В МАССИВЕ");
        int n = getNumber();
        System.out.println("ВВОД ЦЕЛОЧИСЛЕННЫХ ДАННЫХ В МАССИВ");
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
          array[i] = getNumber();
        }
        System.out.print("Данные введены.\nВаш массив: { ");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.print("}\nКоличество отрицательных элемеентов: " + otric(n, array, 0, 0));
    }

    static int getNumber(){
        System.out.print("Введите число: ");
        if (input.hasNextInt()){
            return input.nextInt();
        } else{
            System.out.println("Ошибка ввода. Повторите ввод.");
            input.nextLine();
            return getNumber();
        }
    }

    static int otric(int n, int[] array, int i, int quantity) {
        if (i < n) {
            if (array[i] < 0) {
                return otric(n, array, i+1, quantity+1);
            } else {
                return otric(n, array, i+1, quantity);
            }
        } else {
            return quantity;
        }
    }
}
