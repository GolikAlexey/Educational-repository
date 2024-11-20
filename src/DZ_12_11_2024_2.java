import java.util.Scanner;
public class DZ_12_11_2024_2 {
    public static void main(String[] args) {
        int number = getNumber();
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= number+1 ; j++) {
               if (j > 1 && j <= number){
                 if(i > 1 && i < number) {
                     System.out.print("\\/");
                 } else{
                     System.out.print("==");
                 }
               }else{
                   System.out.print("=");
               }
            }
            System.out.println();
        }

    }

    public static int getNumber(){
        Scanner input = new Scanner(System.in);
        System.out.print("Введите количество символов (не менеее 3): ");
        if (input.hasNextInt()){
            int number = input.nextInt();
            if(number > 2){
                return number;
            } else{
                System.out.println("Ошибка ввода. Повторите ввод.");
                return getNumber();
            }

        } else{
            System.out.println("Ошибка ввода. Повторите ввод.");
            return getNumber();
        }
    }

}
