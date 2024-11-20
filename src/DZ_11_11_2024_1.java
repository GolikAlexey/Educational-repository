import java.util.Scanner;
public class DZ_11_11_2024_1 {
    public static void main(String[] args) {
        System.out.println("ВЫЧИСЛЕНИЕ  ПЛОЩАДИ  ФИГУР\n-----------------------------\nВыбор фигуры:\n1 - треугольник\n2 - прямоугольник\n3 - круг");
        byte vybor = vybor_figury();
        if (vybor == 1) {
            Rectangle();
        } else if (vybor == 2) {
            Triangle();
        } else if (vybor == 3) {
            Circle();
        }
    }

    public static byte vybor_figury() {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите тип фигуры: ");
        if(input.hasNextByte()) {
            byte vybor = input.nextByte();
            if (vybor == 1 || vybor == 2 || vybor == 3){
                return vybor;
            } else {
                System.out.println("Ошибка ввода. Вы должны ввести 1, 2 или 3. Повторите ввод.");
                return vybor_figury();
            }
        } else {
            System.out.println("Ошибка ввода. Вы должны ввести 1, 2 или 3. Повторите ввод.");
            return vybor_figury();
        }
    }

    public static void Rectangle(){
        float a, b;
        System.out.println("Введите длину и ширину прямоугольника:");
        System.out.print("a = ");
        a = vvod();
        System.out.print("b = ");
        b = vvod();
        System.out.printf("Площадь прямоугольника: %.2f", a * b);
    }

    public static void Triangle() {
        float osnovanie, vysota;
        System.out.print("Введите основание треугольника: ");
        osnovanie = vvod();
        System.out.print("Введите высоту треугольника: ");
        vysota = vvod();
        System.out.printf("Площадь треугольника: %.2f", osnovanie * vysota / 2);
    }

    public static void Circle(){
        float radius;
        System.out.print("Введите радиус круга: ");
        radius = vvod();
        System.out.printf("Площадь круга: %.2f", Math.PI * Math.pow(radius, 2));

    }

    public static float vvod() {
        Scanner input = new Scanner(System.in);
        if(input.hasNextFloat()) {
            float vvod = input.nextFloat();
            if (vvod > 0){
                return vvod;
            } else {
                System.out.print("Некорректный ввод данных.\nВведите число заново: ");
                return vvod();
            }
        } else {
            System.out.print("Некорректный ввод данных.\nВведите число заново: ");
            return vvod();
        }
    }

}
