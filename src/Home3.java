public class Home3 {

    public static void main(String[] args) {
        int nums3[] = new int[12];
        for (int i = 11; i >= 0; i--) {
            nums3[i] = i + 1;
            System.out.print(nums3[i] + " ");
        }
        System.out.println();

        int sum = 0;
        for (int i = 11; i >= 0; i--) {
            sum += nums3[i];
        }
        System.out.println("Сумма всех элементов массива равна " + sum);

        int product = 1;
        for (int i = 11; i >=0; i--) {
            product *= nums3[i];
        }
        System.out.println("Произведение всех элементов масссива равно " + product);

        double powSum = 0;
        for (int i = 11; i >= 0; i--) {
            double pow = Math.pow(nums3[i], 2);
            powSum += pow;
        }
        System.out.println("Сумма квадратов всех элементов равна " + powSum);

        int sum6 = 0;
        for (int i = 11; i >= 6; i--) {
            sum6+=nums3[i];
        }
        System.out.println("Сумма первых шести элементов равна "+sum6);
    }
}