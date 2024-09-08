/*import java.util.Scanner;
public class SumOfNaturalNumbers {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number: ");   
    int n = sc.nextInt();
    int sum = 0;
    while (n>=1) {
        sum = sum + n;
        n--;
        System.out.println("Natural number sum is"+sum);
        
    }

        }
}*/
import java.util.Scanner;
public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        int sum = 0;
        int i = 1; 
        while (i<=n) {
            sum = sum + i;
            i++;
            
        }
    System.out.println("Natural number sum of " + n +"is"+sum);
    }

    }


