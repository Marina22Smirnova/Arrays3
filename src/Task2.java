import java.util.Random;

public class Task2 {

    public static void main(String[] args) {
        Random r = new Random();
        int numbers[] = new int[20];

        for (int i = 0; i < 20; i++) {
            numbers[i] = r.nextInt();
        }
        System.out.println();

        for (int i = 0; i < 20; i++) {
            for (int j = i + 1; j < 20; j++)
                if (numbers[i] == numbers[j]) {
                    numbers[j] = r.nextInt();
                }
        }
        for (int i = 0; i < 20; i++) {
            numbers[i] = r.nextInt();
        }
    }
}