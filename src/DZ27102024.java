import java.util.Scanner;
public class DZ27102024 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int A;
        int B;
        int[] array;
        System.out.print("Введите начало диапазона: ");
        A = input.nextInt();
        System.out.print("Введите конец диапазона: ");
        B = input.nextInt();
        System.out.println();
        array = new int[B-A+1];
        array[0] = A;
        System.out.print(array[0] + " ");
        for (int i=1; i <= B-A; i++) {
            array[i] = array[i-1] + 1;
            System.out.print(array[i] + " ");
        }
    }
}
