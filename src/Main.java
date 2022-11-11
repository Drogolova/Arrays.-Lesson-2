import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        int[] arr = generateRandomArray();
        double sumPerMonth = 0;
        for (int i = 0; i < arr.length; i++) {
            sumPerMonth += arr[i];
        }
        System.out.println("Сумма трат за месяц составила " + sumPerMonth + " рублей");

        System.out.println("Задание 2");
        int minSum = 200_000;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minSum) {
                minSum = arr[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minSum +
                " рублей");

        int maxSum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxSum) {
                maxSum = arr[i];
            }
        }
        System.out.println("Максимальная сумма трат за день составила " + maxSum
        + " рублей");

        System.out.println("Задание 3");
        double averageExpense = sumPerMonth / 30;
        System.out.println("Средняя сумма трат за месяц составила " +
                averageExpense + " рублей");

        System.out.println("Задание 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        char rightOrder;
        for (int i = reverseFullName.length - 1; i <= reverseFullName.length && i >= 0; i--) {
            rightOrder = reverseFullName[i];
            System.out.print(rightOrder);
        }
    }
    int[] arr = generateRandomArray();

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}