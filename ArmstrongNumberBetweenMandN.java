import java.util.Scanner;

public class ArmstrongNumberBetweenMandN {
    static boolean isArmStrong(int n) {
        int sum = 0, temp = n;
        int dc = (n + " ").length();
        do {
            int d = n % 10;
            sum = sum + (int) Math.pow(d, dc);
            n = n / 10;
        } while (n != 0);
        return (sum == temp);
    }

    static int countArmstrong(int m, int n) {
        int count = 0;
        for (int i = m; i <= n; i++) {
            if (isArmStrong(i)) {
                System.out.println(i);
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of m and n:");
        int m = sc.nextInt();
        int n = sc.nextInt();
        int count = countArmstrong(m, n);
        System.out.println("Armstrong numbers between " + m + " and " + n + " are " + count);
    }
}