import java.util.Scanner;

public class Home5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите длину массива: ");
        int l = sc.nextInt();
        int[] nums5 = new int[l];

        System.out.println("Введите массив: ");
        for (int i = 0; i < l; i++) {
            nums5[i] = sc.nextInt();
        }
        int max = nums5[0];
        for (int i = 0; i < l; i++) {
            if (max < nums5[i]){
                max=nums5[i];
            }
        }
        int countMax = 0;
        for (int i = 0; i < l; i++) {
            if (max == nums5[i]) {
                countMax++;
            }
        }

        int min = nums5[0];
        for (int i = 0; i < l; i++) {
            if (nums5[i] < min){
                min=nums5[i];
            }
        }

        int countMin = 0;
        for (int i = 0; i < l; i++) {
            if (min == nums5[i]) {
                countMin++;
            }
        }System.out.println("Количество максимальных элементов: "+ countMax);
        System.out.println("Количество минимальных элементов: "+ countMin);
    }
}
