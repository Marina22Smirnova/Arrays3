import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        int[] nums = new int[10];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            nums[i]= sc.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(nums[i]);
        }
    }
}
