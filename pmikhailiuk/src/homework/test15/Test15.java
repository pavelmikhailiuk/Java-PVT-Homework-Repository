package homework.test15;

/**
 * Created by Natashka on 08.02.2015.
 */
public class Test15 {
    public static void main(String[] args) {
        int[][] array = new int[9][9];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (((j >= i) && (i + j) <= array.length-1) || ((j <= i) && (i + j) >= array.length-1)) {
                    array[i][j] = 1;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
