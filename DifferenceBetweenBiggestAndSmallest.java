import java.util.Scanner;

public class DifferenceBetweenBiggestAndSmallest {
    public static void main(String[] args) {
        System.out.println(differenceBetweenBiggestAndSmallest(12345));
        System.out.println(differenceBetweenBiggestAndSmallest(54321));
        System.out.println(differenceBetweenBiggestAndSmallest(11111));
    }

    public static int differenceBetweenBiggestAndSmallest(int number) {
        int min = 9;
        int max = 0;
        while (number > 0) {
            int digit = number % 10;
            if (digit > max) {
                max = digit;
            }
            if (digit < min) {
                min = digit;
            }
            number = number / 10;
        }
        return max - min;
    }
}