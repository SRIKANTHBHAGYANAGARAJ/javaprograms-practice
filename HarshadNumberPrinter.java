public class HarshadNumberPrinter {
    public static void printHarshadNumbers(int n) {
        int count = 0;
        int num = 1;

        while (count < n) {
            if (isHarshad(num)) {
                System.out.print(num + " ");
                count++;
            }
            num++;
        }
        System.out.println();
    }

    public static boolean isHarshad(int num) {
        int sum = sumOfDigits(num);
        return num % sum == 0;
    }

    public static int sumOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        int n = 10; // change this to the number of Harshad numbers you want
        System.out.print("First " + n + " Harshad numbers: ");
        printHarshadNumbers(n);
    }
}