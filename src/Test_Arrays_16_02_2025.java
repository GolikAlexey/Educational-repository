import java.util.ArrayList;

public class Test_Arrays_16_02_2025 {
    public static void main(String[] args) {
        int[] array1 = {912, 8, 5, 11, 3, 198, 512, 850, 211, 1};
        int[] array2 = {2, 179, 5, 8, 215, 3, 912, 850, 14, 9};

        Integer[] uniqueElements = findUniqueElements(array1, array2);

        System.out.print("Уникальные элементы: ");
        for (int i =0; i < uniqueElements.length; i++) {
            System.out.print(uniqueElements[i] + "  ");
        }
    }

    public static Integer[] findUniqueElements(int[] array1, int[] array2) {
        ArrayList<Integer> uniqueArray = new ArrayList<>();
        for (int i = 0; i < array1.length; i++) {
            boolean repeat = false;
            for (int j = 0; j < array2.length; j++) {
                if(array1[i] == array2[j]){
                    repeat = true;
                    break;
                }
            }
            if (repeat == false){
                uniqueArray.add(array1[i]);
            }
        }

        for (int i = 0; i < array2.length; i++) {
            boolean repeat = false;
            for (int j = 0; j < array1.length; j++) {
                if(array2[i] == array1[j]){
                    repeat = true;
                    break;
                }
            }
            if (repeat == false){
                uniqueArray.add(array2[i]);
            }
        }

        Integer[] result = uniqueArray.toArray(new Integer[0]);

        return result;
    }
}
