import java.util.Scanner;

public class MainArmStrong {
    static int getpow(int n, int p) {
        int prod = 1;
        while (p > 0) {
            prod = prod * n;
            p--;
        }
        return prod;
    }

    static int numberOfDigits(int n) {
        int count = 0;
        do {
            count++; 
            n = n / 10;
        } while (n != 0);
        return count; // also fixed the variable name here (was 'Count')
    }

    static boolean isArmStrong(int x) {
        int sum = 0, temp = x;
        int n = numberOfDigits(x);
        do {
            int d = x % 10;
            sum = sum + getpow(d, n); // fixed the variable name here (was 'Count')
            x = x / 10;
        } while (x != 0);
        return temp == sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        boolean rs = isArmStrong(n);
        if (rs)
            System.out.println(n + " is an Armstrong number:");
        else
            System.out.println(n + " is not an Armstrong number:");
    }
}