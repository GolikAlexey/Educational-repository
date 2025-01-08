package Figure3D;

class Glob extends GeometricObject{
    private int radius;
    public Glob (String name, int radius){
        super(name);
        this.radius = radius;
    }

    @Override
    public void volume(){
        System.out.printf("Фигура: %s,  Объём фигуры: %.2f\n", getName(), Math.PI*Math.pow(radius, 3)*4/3);
    }
}
