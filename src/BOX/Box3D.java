package BOX;

public class Box3D extends Box {
    private double height_box;
    public Box3D(Box other, double height_box){
        super(other);
        this.height_box = height_box;
    }

    public double getHeight_box() {
        return height_box;
    }

//    public void setHeight_box(double height_box) {
//        if(height_box > 0){
//            this.height_box = height_box;
//        }
//    }
}
