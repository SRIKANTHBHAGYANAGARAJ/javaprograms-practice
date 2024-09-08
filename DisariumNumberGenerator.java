public class DisariumNumberGenerator {
    
    public static int[] firstNDisariumNumbers(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("n must be a positive integer");
        }

        int[] disariumNumbers = new int[n];
        int num = 1;
        int index = 0;

        while (index < n) {
            if (isDisarium(num)) {
                disariumNumbers[index] = num;
                index++;
            }
            num++;
        }

        return disariumNumbers;
    }

    
    public static boolean isDisarium(int num) {
        int sum = 0;
        int temp = num;
        int digitCount = countDigits(num);

        for (int i = 1; i <= digitCount; i++) {
            int digit = temp % 10;
            sum += Math.pow(digit, i);
            temp /= 10;
        }

        return sum == num;
    }

   
    public static int countDigits(int num) {
        int count = 0;
        while (num > 0) {
            num /= 10;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int n = 10; 
        int[] disariumNumbers = firstNDisariumNumbers(n);

        System.out.print("First " + n + " Disarium numbers:  ");
        for (int disarium : disariumNumbers) {
            System.out.print(disarium + " ");
        }
        System.out.println();
    }
}