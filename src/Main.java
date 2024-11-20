import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
//        System.out.println("hello");
//        byte a = (byte) (Math.random()*9);
//       System.out.println(a);
        byte[] array = new byte [20];
        for (byte i = 0; i < array.length; i++) {
            array[i] = (byte) (Math.random() * 71 + 19);
        }
        System.out.println(Arrays.toString(array));
    }
}