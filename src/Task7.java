import java.util.Random;

public class Task7 {

    public static void main(String[] args) {
        Random r = new Random();
        int[] arr7 = new int[10];

        for (int i = 0; i < arr7.length; i++) {
            arr7[i] = r.nextInt(12);
            System.out.print(arr7[i] + " ");
        }
        System.out.println();

        int element2 = arr7[2];
        int element5 = arr7[5];
        for (int i = 0; i < arr7.length; i++) {
            arr7[2] = arr7[5];
            arr7[2] = element5;
            arr7[5] = element2;

            System.out.print(arr7[i] + " ");
        }
        System.out.println();

        int element3 = arr7[3];
        int max = arr7[0];
        for (int i = 0; i < arr7.length; i++) {
            if (arr7[i] > max) {
                arr7[i] = max;

                System.out.println(arr7[i]);
            }
        }
        System.out.println("Максимальный элемент: " + max);
    }
}
