import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        int[] numbers = new int[6];
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int)(Math.random() * 100) + 1;

            sum += numbers[i];

            if (numbers[i] > max) {
                max = numbers[i];
            }
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        Arrays.sort(numbers);
        double average = (double) sum / numbers.length;

        int length = numbers.length;

        double median;
        if (length % 2 == 0) {
            median = (numbers[length / 2 - 1] + numbers[length / 2]) / 2.0;
        } else {
            median = numbers[length / 2];
        }

        System.out.println("The numbers are: " + Arrays.toString(numbers));
        System.out.println("The sum of the numbers is: " + (sum));
        System.out.println("The maximum number is: " + max);
        System.out.println("The minimum number is: " + min);
        System.out.println("The average is: " + average);
        System.out.println("The median is: " + median);

    }

}