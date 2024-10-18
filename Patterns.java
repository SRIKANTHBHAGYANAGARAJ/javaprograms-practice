import java.util.Scanner;

public class Patterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 4; // remove this line, as it's redefining n
        int m = 5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(" * "); // use print instead of println to print on the same line
            }
            System.out.println(); // move to the next line
        }
    }
}