public class FactorCounter {
    public static void main(String[] args) {
        int num = 24; // change this to the number you want to count factors for
        int factorCount = 0;

        System.out.print("Factors of " + num + ": ");
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.print(i + " ");
                factorCount++;
            }
        }
        System.out.println();
        System.out.println("Number of factors: " + factorCount);
    }
}