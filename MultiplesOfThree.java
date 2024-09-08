/*import java.util.Scanner;
public class MultipleOfThrees {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = input.nextInt();
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            if (i % 3 == 0) {
                sum += i;
           }
        
        }
        System.out.println("The sum of multiples of 3 is: " + sum);
    }
}*/
import java.util.Scanner;

public class MultiplesOfThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = input.nextInt();
        int i = 3;

        System.out.println("Multiples of 3 within " + n + " are: ");
        while (i <= n) {
            System.out.print(i + " ");
            i += 3;
        }
    } 
}