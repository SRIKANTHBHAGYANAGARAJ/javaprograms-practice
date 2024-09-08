public class PrimeNumberGenerator {
    public static int[] firstNPrimes(int n) {
        int[] primes = new int[n];
        int num = 2;
        int index = 0;

        while (index < n) {
            if (isPrime(num)) {
                primes[index] = num;
                index++;
            }
            num++;
        }

        return primes;
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        int i = 2;
        while (i * i <= num) {
            if (num % i == 0) {
                return false;
            }
            i++;
        }
        return true;
    }

    public static void main(String[] args) {
        int n = 10; // change this to the number of prime numbers you want
        int[] primes = firstNPrimes(n);

        System.out.print("First " + n + " prime numbers: ");
        for (int prime : primes) {
            System.out.print(prime + " ");
        }
        System.out.println();
    }
}