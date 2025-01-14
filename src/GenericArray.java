import java.util.Scanner;
public class GenericArray {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        byte n;
        n = getQuantity();
        Integer[] array_int = new Integer[n];
        for (int i = 0; i < array_int.length; i++) {
            System.out.print("-> ");
            array_int[i] = input.nextInt();
        }
        n = getQuantity();
        String[] array_string = new String[n];
        input.nextLine();
        for (int i = 0; i < array_string.length; i++) {
            System.out.print("-> ");
            array_string[i] = input.nextLine();
        }
        printArray(array_int);
        printArray(array_string);
    }

    static <T> void printArray(T[] inputArray){
        for(T element : inputArray){
            System.out.print(element + " ");
        }
        System.out.println();
    }

    static byte getQuantity(){
        byte n;
        System.out.print("Введите количество элементов массива: ");
        if(input.hasNextByte()){
            n = input.nextByte();
            if(n>0){
                return n;
            }else{
                System.out.println("Ошибка ввода. Повторите ввод.");
                return getQuantity();
            }
        }else{
            System.out.println("Ошибка ввода. Повторите ввод.");
            input.nextLine();
            return getQuantity();
        }
    }
}
