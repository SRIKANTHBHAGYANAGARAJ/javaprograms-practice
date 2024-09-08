/*import java.util.Scanner;
public class SumOfEvenAndOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        int sumEven = 0, sumOdd = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                sumEven = sumEven + i;
                } else {
                    sumOdd = sumOdd + i;
                    }
                    

}
System.out.println("Sum of even numbers: " + sumEven);
System.out.println("Sum of odd numbers: " +sumOdd);
}
}*/
import java.util.Scanner;

public class SumOfEvenAndOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        int sumEven = 0, sumOdd = 0;
        int i = 1;
        while (i <= n) {
            if (i % 2 == 0) {
                sumEven = sumEven + i;
            } else {
                sumOdd = sumOdd + i;
            }
            i++;
        }
        System.out.println("Sum of even numbers: " + sumEven);
        System.out.println("Sum of odd numbers: " + sumOdd);
    }
}