import java.util.TreeMap;

public class Map_8_02_2025_1 {
    public static void main(String[] args) {
        TreeMap<Character, Integer> map1 = new TreeMap<>();
        TreeMap<Integer, Character> map2 = new TreeMap<>();

        map1.put('X', 1);
        map1.put('Y', 2);
        map1.put('Z', 3);

        System.out.print("{");
        map1.forEach((k, v) -> System.out.print(k + "=" + v + ", "));
        System.out.println("\b\b}");

        Character[] array_keys = map1.keySet().toArray(new Character[3]);
        Integer[] array_values = map1.values().toArray(new Integer[3]);

        for (byte i = 0; i < 3; i++) {
            map2.put(array_values[i], array_keys[i]);            
        }

        System.out.print("{");
        map2.forEach((k, v) -> System.out.print(k + "=" + "[" + v + "], "));
        System.out.println("\b\b}");
    }
}
