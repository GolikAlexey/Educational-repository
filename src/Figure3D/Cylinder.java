package Figure3D;

public class Cylinder extends GeometricObject{
    private int radius;
    private int height;
    public Cylinder (String name, int radius, int height){
        super(name);
        this.radius = radius;
        this.height = height;
    }

    @Override
    public void volume() {
        System.out.printf("Фигура: %s,  Объём фигуры: %.2f\n", getName(), Math.PI * Math.pow(radius, 2) * height);
    }
}
