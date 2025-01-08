package Figure3D;

public class Pyramid extends GeometricObject {
    private double square;
    private int height;
    public Pyramid (String name, double square, int height){
        super(name);
        this.square = square;
        this.height = height;
    }

    @Override
    public void volume() {
        System.out.printf("Фигура: %s,  Объём фигуры: %.2f\n", getName(), square * height / 3);
    }
}
