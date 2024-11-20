public class DZ_3112024_1 {
    public static void main(String[] args) {
        int[][] array1 = new int[3][4];
        int[][] array2 = new int[3][4];
        int a = 1;
        for (byte i = 0; i < array1.length; i++) {
            for (byte j = 0; j <= array1.length; j++) {
                array1[i][j] = a;
                a++;
                System.out.print(array1[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
        a = 1;
        for (byte i = 0; i < array2.length; i++) {
            for (byte j = 0; j <= array2.length; j++) {
                array2[i][j] = a*a;
                a++;
                System.out.print(array2[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
