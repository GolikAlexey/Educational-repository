package Figure3D;

public class Main {
    public static void main(String[] args) {
        Glob figure1 = new Glob ("шар", 5);
        Cylinder figure2 = new Cylinder("цилиндр", 5, 9);
        Pyramid figure3 = new Pyramid("пирамида", 50.29, 12);
        figure1.volume();
        figure2.volume();
        figure3.volume();
    }
}
