import java.util.Random;

public class Task8 {

    public static void main(String[] args) {
        Random r = new Random();
        int[][] array = new int[3][3];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                array[i][j] = r.nextInt(10);
                System.out.printf("%d ",array[i][j]);
            }
        System.out.println();
        }
        int indexRight = array[0][array.length-1];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
            }
        }
        System.out.println("Верхний правый элемент "+indexRight);

        int indexLeft = array[array.length-1][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
            }
        }
        System.out.println("Нижний левый элемент "+indexLeft);
    }
}
