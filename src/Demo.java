public class Demo {

    public static void main(String[] args) {
        int[] nums = {5, 6, 7, 8, 9, 11, 12};
        int[] nums1 = new int[5];
        nums1[0] = 1;
        nums1[1] = 2;
        nums1[2] = 3;
        nums1[3] = 4;
        nums1[4] = 5;

        for (int i = 0; i < nums.length; i++) {
            System.out.printf("%d ", nums[i]);
            System.out.println();
        }
        for (int i = 0; i < nums1.length; i++) {
            System.out.printf("%d", nums1[i]);
            System.out.println();
        }
    }
}
