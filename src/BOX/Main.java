package BOX;

public class Main {
    public static void main(String[] args) {
        Box S1 = new Box(5.0, 3.0);
        Box3D V1 = new Box3D(S1, 2.0);
        System.out.printf("Объект Box3D {длина: %.1f, ширина: %.1f, высота: %.1f}\n", V1.getLength_box(), V1.getWidth_box(), V1.getHeight_box());
        System.out.printf("Объём: %.1f", V1.getLength_box()*V1.getWidth_box()*V1.getHeight_box());
    }
}