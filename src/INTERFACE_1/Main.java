package INTERFACE_1;

public class Main {
    public static void main(String[] args){
        Rectangle rect1 = new Rectangle(20, 16);
        System.out.println("Width: " + rect1.getWidth() + "  Height: " + rect1.getHeight());
        rect1.resizeWidth();
        rect1.resizeHeight();
        System.out.println("Width: " + rect1.getWidth() + "  Height: " + rect1.getHeight());
    }
}
