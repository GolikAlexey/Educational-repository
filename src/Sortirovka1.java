public class Sortirovka1 {
    public static void main(String[] args) {
        int[] massiv = new int[]{25, 478, 985, 23, 59, 95, 32, 81, 79, 2};
        int n;
        int min = massiv[0];
        for (int i = 0; i < massiv.length; i++) {
            for (int j = i; j < massiv.length; j++) {
                if (massiv[j] < min) {
                    n = min;
                    min = massiv[j];
                    massiv[j] = n;
                }
            }
            massiv[i] = min;
            if (i < massiv.length-1) {
                min = massiv[i+1];
            }
        }

        for (int i = 0; i < massiv.length; i++) {
            System.out.print(massiv[i] + " ");
        }
    }
}
