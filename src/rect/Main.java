package rect;

public class Main {
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(4, 15);
        rect1.setLength(3);
        rect1.setWidth(9);
        System.out.println("Длина прямоугольника: " + rect1.getLength());
        System.out.println("Ширина прямоугольника: " + rect1.getWidth());
        System.out.println("Площадь прямоугольника: " + rect1.getArea());
        System.out.println("Периметр прямоугольника: " + rect1.getPerimeter());
        System.out.println("Гипотенуза прямоугольника: " + rect1.getHypotenuse());
        System.out.println("\nРисунок прямоугольника:");
        rect1.getImage();
    }
}
