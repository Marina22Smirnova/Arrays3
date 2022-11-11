import java.util.Random;
import java.util.Scanner;

public class Home4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //Random r = new Random();
        //System.out.println("Введите длину массива: ");
        //int l = sc.nextInt();
        int[] nums4 = {-1, 1, -2, 2, -3, 3};
        for (int i = 0; i < nums4.length; i++) {
            System.out.println(nums4[i]);
        }
        System.out.println();
        System.out.println("Положительные числа массива: ");
        for (int i = 0; i < nums4.length; i++) {
            if (nums4[i] >= 0) {
                System.out.print(nums4[i] + " ");
            }
        }
        System.out.println();
        System.out.println("Отрицательные числа массива: ");
        for (int i = 0; i < nums4.length; i++) {
            if (nums4[i] < 0) {
                System.out.print(nums4[i] + " ");
            }
        }
    }
}
