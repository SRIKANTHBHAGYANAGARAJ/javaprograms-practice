public class NeonNumberPrinter {
    public static void printNeonNumbers(int n) {
        int count = 0;
        int num = 1;

        while (count < n) {
            if (isNeon(num)) {
                System.out.print(num + " ");
                count++;
            }
            num++;
        }
        System.out.println();
    }

    public static boolean isNeon(int num) {
        int square = num * num;
        int sum = 0;

        while (square > 0) {
            int digit = square % 10;
            sum += digit;
            square /= 10;
        }

        return sum == num;
    }

    public static void main(String[] args) {
        int n = 100; // change this to the number of Neon numbers you want
        System.out.print("First " + n + " Neon numbers: ");
        printNeonNumbers(n);
    }
}