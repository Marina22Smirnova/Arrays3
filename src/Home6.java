import java.util.Scanner;

public class Home6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] nums6 = new int[][]{
                {2, 3}, //00 01
                {4, 5}, //10 11
                {6, 7}  //20 21
        };
        for (int i = 0; i < nums6.length; i++) {
            for (int j = 0; j < nums6[0].length; j++) {
                System.out.printf("%d ", nums6[i][j]);
            }
            System.out.println();
        }

        int raws = nums6.length;
        int cols = nums6[0].length;

        System.out.println("Введите номер строки: ");
        int rawNumber = sc.nextInt();

        int min = nums6[rawNumber][0];
        for (int i = 0; i < raws; i++) {
            for (int j = 0; j < cols; j++) {
                if (nums6[rawNumber][j] < min) {
                    min = nums6[rawNumber][j];
                }
            }
        }
        System.out.println("Минимальный элемент в строке "+rawNumber+" равен "+min);

        System.out.println("Введите номер столбца: ");
        int colNumber = sc.nextInt();

        int max = nums6[0][colNumber];
        for (int i = 0; i < raws; i++) {
            for (int j = 0; j < cols; j++) {
                if (nums6[i][colNumber] > max) {
                    max = nums6[i][colNumber];
                }
            }
        }
        System.out.println("Максимальный элемент в столбце "+colNumber+" равен "+max);
    }
}

