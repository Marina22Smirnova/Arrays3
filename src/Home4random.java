import java.util.Random;
import java.util.Scanner;

public class Home4random {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        System.out.println("Введите длину массива: ");
        int l = sc.nextInt();
        int[] nums4 = new int[l];
        for (int i = 0; i < nums4.length; i++) {
            nums4[i]=r.nextInt();
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


