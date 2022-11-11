import java.util.Random;

public class Task5 {

    public static void main(String[] args) {

        Random r = new Random();
        int[] nums = new int[3];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = r.nextInt();

            if (nums[i] > 0) {
                System.out.println(nums[i]);
            }

            if (nums[i] < 100 && nums[i]>0) {
                System.out.println(nums[i]);
            }
        }
    }
}
