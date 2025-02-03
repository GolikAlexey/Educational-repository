import java.util.HashMap;

public class Homework_HashMap {
    public static void main(String[] args) {
        Color c1 = new Color("RED");
        Color c2 = new Color("ORANGE");
        Color c3 = new Color("AQUA");
        Color c4 = new Color("PINK");
        Color c5 = new Color("GRAY");
        Color c6 = new Color("BLUE");
        Color c7 = new Color("WHITE");
        Color c8 = new Color("BLACK");
        Color c9 = new Color("YELLOW");
        Color c10 = new Color("BROWN");

        HashMap<String, Color> colors = new HashMap<>();

        colors.put("red", c1);
        colors.put("orange", c2);
        colors.put("aqua", c3);
        colors.put("pink", c4);
        colors.put("gray", c5);
        colors.put("blue", c6);
        colors.put("white", c7);
        colors.put("black", c8);
        colors.put("yellow", c9);
        colors.put("brown", c10);

        colors.forEach((k, v) -> System.out.println(k + ": " + v.getName()));
    }
}

class Color{
    private String name;

    public Color(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
