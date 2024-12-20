package Area;

public class Main {
    public static void main(String[] args) {
        System.out.println("РАСЧЁТ ПЛОЩАДЕЙ ГЕОМЕТРИЧЕСКИХ ФИГУР\n");
        System.out.printf("Площадь треугольника по формуле Герона (3, 4, 5): %1.1f\n", Area.areaTriangleGeron(3, 4, 5));
        System.out.printf("Площадь треугольника через основание и высоту(6, 7): %1.1f\n", Area.areaTriangle(6, 7));
        System.out.printf("Площадь квадрата (7): %1.0f\n", Area.areaSquare(7));
        System.out.printf("Площадь прямоугольника (2, 6): %1.0f\n", Area.areaRectangle(2, 6));
        System.out.println("Количество подсчётов площади: " + Area.getCount());
    }
}
