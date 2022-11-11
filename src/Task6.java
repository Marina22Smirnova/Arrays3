import java.util.Random;

public class Task6 {

    public static void main(String[] args) {

        int[] arr6 = new int[10];
        Random r = new Random();

        for (int i = 0; i < arr6.length; i++) {
            arr6[i] = r.nextInt( 10);
            System.out.print(arr6[i]+" ");
        }
        System.out.println();
        int min = arr6[0];
        int indexMin = 0;
        for(int i = 0; i < arr6.length;i++){
            if (arr6[i]<min){
                min = arr6[i];
                indexMin = i;
            }
        }
        System.out.println("Минимум равен "+min);

        int max = arr6[0];
        int indexMax = 0;
        for(int i = 0; i < arr6.length;i++){
            if (arr6[i]>max){
                max = arr6[i];
                indexMax = i;
            }
        }
        System.out.println("Максимум равен "+max);

        int difference = max - min;
        System.out.println("Максимальный элемент больше минимального на "+difference);

        System.out.println("Индекс максимального элемента равен: "+indexMax);

        System.out.println("Индекс минимального элемента равен: "+indexMin);

    }

}
