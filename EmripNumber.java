import java.util.Scanner;

public class EmripNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        boolean rs = isEmripNumber(n);
        if (rs) {
            System.out.println(n + " is a emrip number");
        } else {
            System.out.println(n + " is not a emrip number");
        }
    }

    public static boolean isEmripNumber(int n) {
        return isPrime(n) && isPrime(reverse(n));
    }

    public static boolean isPrime(int n) {
        if (n == 0 || n == 1) {
            return false;
        }
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int reverse(int n) {
        int rev = 0;
        do {
            int d = n % 10;
            rev = rev * 10 + d;
            n = n / 10;
        } while (n != 0);
        return rev;
    }
}