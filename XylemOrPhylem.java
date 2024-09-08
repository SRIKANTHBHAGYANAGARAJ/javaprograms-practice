import java.util.Scanner;

public class XylemOrPhylem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        String rs = checkXp(n);
        System.out.println(n + " is a " + rs);
    }

    public static String checkXp(int n) {
        int es = 0, ms = 0, t = n;

        do {
            int d = n % 10;
            if (t == n || n == d) {
                es += d;
            } else {
                ms += d;
            }
            n /= 10;
        } while (n != 0);

        if (es == ms) {
            return "Xylem";
        } else {
            return "Phylem";
        }
    }
}