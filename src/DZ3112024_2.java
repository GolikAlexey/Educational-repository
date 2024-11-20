import java.util.Scanner;
public class DZ3112024_2 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("ВЫЧИСЛЕНИЕ  ПЛОЩАДИ  ФИГУР\n-----------------------------\nВыбор фигуры:\n1 - треугольник\n2 - прямоугольник\n3 - круг");
        System.out.print("Введите тип фигуры: ");
        byte vvod = input.nextByte();
        if (vvod < 1 || vvod > 3){
            System.out.println("Некорректный ввод данных. Вы должны ввести 1, 2 или 3.");
        }
        else if (vvod == 1){
            float a, b, c, p;
            System.out.println("Введите стороны треугольника:");
            System.out.print("a = ");
            a = input.nextFloat();
            if (a <= 0.){
                System.out.println("Некорректный ввод данных");
            } else{
                System.out.print("b = ");
                b = input.nextFloat();
                if (b <= 0.){
                    System.out.println("Некорректный ввод данных");
                } else {
                    System.out.print("c = ");
                    c = input.nextFloat();
                    if (c <= 0.){
                        System.out.println("Некорректный ввод данных");
                    } else{
                        p = (a+b+c)/2f;
                        System.out.printf("Площадь треугольника равна: %.2f", Math.sqrt(p*(p-a)*(p-b)*(p-c)));
                    }
                }
            }
        }
        else if (vvod == 2){
            float a, b;
            System.out.println("Введите длину и ширину прямоугольника:");
            System.out.print("a = ");
            a = input.nextFloat();
            if (a <= 0.){
                System.out.println("Некорректный ввод данных");
            } else {
                System.out.print("b = ");
                b = input.nextFloat();
                if (b <= 0.){
                    System.out.println("Некорректный ввод данных");
                } else {
                    System.out.printf("Площадь прямоугольника: %.2f", a*b);
                }
            }
        }
        else if (vvod == 3){
            float radius;
            System.out.print("Введите радиус круга: ");
            radius = input.nextFloat();
            if (radius <= 0){
                System.out.println("Некорректный ввод данных");
            } else{
                System.out.printf("Площадь круга: %.2f", Math.PI * Math.pow(radius, 2));
            }
        }
    }
}
