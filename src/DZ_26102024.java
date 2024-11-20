import java.util.Scanner;
public class DZ_26102024 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите количество звёздочек в основании (оно должно быть несчётным и не меньше 3): ");
        int osn = input.nextInt();
        if (osn % 2 == 0 || osn <= 2){
            System.out.println("\nНекорректный ввод данных. Количество звёздочек должно быть несчётным и не меньше 3.");
        } else {
            for (int i = 0; i <= osn/2; i++) {
                for (int j = 1; j <= osn; j++) {
                    if (j>=(osn+1)/2 - i && j<=(osn+1)/2 + i){
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                    if (j==osn){
                        System.out.println();
                    }
                }

            }
        }
    }
}
