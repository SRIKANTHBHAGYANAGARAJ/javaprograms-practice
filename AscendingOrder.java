import java.util.Scanner;

public class AscendingOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = scanner.nextInt();

        System.out.print("Enter second number: ");
        int b = scanner.nextInt();

        System.out.print("Enter third number: ");
        int c = scanner.nextInt();

        int small, mid, big;

        // Find the smallest number
        if (a <= b && a <= c) {
            small = a;
        } else if (b <= a && b <= c) {
            small = b;
        } else {
            small = c;
        }

        // Find the largest number
        if (a >= b && a >= c) {
            big = a;
        } else if (b >= a && b >= c) {
            big = b;
        } else {
            big = c;
        }

        // Find the middle number
        if (a != small && a != big) {
            mid = a;
        } else if (b != small && b != big) {
            mid = b;
        } else {
            mid = c;
        }

        System.out.println("Numbers in ascending order: " + small + " " + mid + " " + big);
    }
}