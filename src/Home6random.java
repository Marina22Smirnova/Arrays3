import java.util.Random;
import java.util.Scanner;

public class Home6random {

    public static void main(String[] args) {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        int [][] arr6 = new int [3][4];

        for (int i = 0; i <arr6.length;i++) {
            for (int j = 0; j < arr6[0].length; j++) {
                arr6[i][j] = r.nextInt(10);
                System.out.printf("%d ",arr6[i][j]);
            }
            System.out.println();
        }
        int raws = arr6.length;
        int cols = arr6[0].length;

        System.out.println("Введите номер строки: ");
        int rawNumber = sc.nextInt();

        int min = arr6[rawNumber][0];
        for (int i = 0; i < raws; i++) {
            for (int j = 0; j < cols; j++) {
                if (arr6[rawNumber][j] < min) {
                    min = arr6[rawNumber][j];
                }
            }
        }
        System.out.println("Минимальный элемент в строке "+rawNumber+" равен "+min);

        System.out.println("Введите номер столбца: ");
        int colNumber = sc.nextInt();

        int max = arr6[0][colNumber];
        for (int i = 0; i < raws; i++) {
            for (int j = 0; j < cols; j++) {
                if (arr6[i][colNumber] > max) {
                    max = arr6[i][colNumber];
                }
            }
        }
        System.out.println("Максимальный элемент в столбце "+colNumber+" равен "+max);
    }
}
