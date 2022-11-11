import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите длину массива: ");
        int n = sc.nextInt();
        int[] numbers = new int[n];

        System.out.println("Задайте массив: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }
        System.out.println("Введите номер элемента массива: ");
        int elementNumber = sc.nextInt();
        for (int i = 0; i < numbers.length; i++) {
            i = elementNumber;
            double sq = Math.sqrt(numbers[i]);
            System.out.printf("Корень квадратный из %d равен %f", numbers[i], sq);
        }
/*
            System.out.println();
        System.out.println("Введите первый номер элемента массива: ");
        int num1 = sc.nextInt();
        for (int i = 0; i < numbers.length; i++) {
            i = num1;
        }
        System.out.println("Введите второй номер элемента массива: ");
        int num2 = sc.nextInt();
        for (int i = 0; i < numbers.length; i++) {
            i = num2;
        }
        int average = (num1 + num2) / 2;
        System.out.println("Среднее арифметическое из " + num1 + " " + "и " + num2 + " " + "равно " + average);
    }*/
    }
}
