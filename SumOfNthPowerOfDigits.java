import java.util.Scanner;

public class SumOfNthPowerOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        System.out.print("Enter the power: ");
        int power = scanner.nextInt();
        scanner.close();

        int sum = sumOfNthPowerOfDigits(num, power);
        System.out.println("Sum of " + power + "th power of digits: " + sum);
    }

    /**
     * Calculates the sum of the Nth power of each digit in a given number.
     * 
     * @param number the input number
     * @param power  the power to which each digit should be raised
     * @return the sum of the Nth power of each digit
     */
    public static int sumOfNthPowerOfDigits(int num, int power) {
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            sum += (int) Math.pow(digit, power);
            num  /= 10;
        }
        return sum;
    }
}