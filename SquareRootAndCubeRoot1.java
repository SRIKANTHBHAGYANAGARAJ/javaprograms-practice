public class SquareRootAndCubeRoot1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        double number = scanner.nextDouble();

        double squareRoot = findSquareRoot(number);
        double cubeRoot = findCubeRoot(number);

        System.out.println("Square Root of " + number + " is: " + squareRoot);
        System.out.println("Cube Root of " + number + " is: " + cubeRoot);
    }

    public static double findSquareRoot(double number) {
        return Math.sqrt(number);
    }

    public static double findCubeRoot(double number) {
        return Math.cbrt(number);
    }
}