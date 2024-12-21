package BOX;

public class Box {
    private double length_box;
    private double width_box;

    public Box(double length_box, double width_box){
        this.length_box = length_box;
        this.width_box = width_box;
    }

    public Box(Box other){
        this.length_box = other.length_box;
        this.width_box = other.width_box;
    }

    public double getLength_box() {
        return length_box;
    }

//    public void setLength_box(double length_box) {
//        if (length_box > 0) {
//            this.length_box = length_box;
//        }
//    }

    public double getWidth_box() {
        return width_box;
    }

//    public void setWidth_box(double width_box) {
//        if(width_box > 0){
//            this.width_box = width_box;
//        }
//    }
}
