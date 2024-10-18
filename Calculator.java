public class Calculator {
    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Method to add two doubles
    public double add(double a, double b) {
        return a + b;
    }

    // Method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method to add a string and an integer
    public String add(String str, int num) {
        return str + num;
    }
}

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        // Calling the method with two integers
        int result1 = calculator.add(10, 20);
        System.out.println("Result 1: " + result1);

        // Calling the method with two doubles
        double result2 = calculator.add(10.5, 20.5);
        System.out.println("Result 2: " + result2);

        // Calling the method with three integers
        int result3 = calculator.add(10, 20, 30);
        System.out.println("Result 3: " + result3);

        // Calling the method with a string and an integer
        String result4 = calculator.add("Hello, ", 20);
        System.out.println("Result 4: " + result4);
    }
}