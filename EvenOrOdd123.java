import java.util.Scanner;

public class EvenOrOdd123 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int EvenSum = 0;
        int OddSum = 0;
        while (n > 0) {
            int rem = n % 10;
            if (rem % 2 == 0) {
                EvenSum += rem;
            } else {
                OddSum += rem;
            }
            n /= 10;
        }
        System.out.println("Even sum: " + EvenSum);
        System.out.println("Odd sum: " + OddSum);
    }
}