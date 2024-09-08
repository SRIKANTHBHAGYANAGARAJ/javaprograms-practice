import java.util.Scanner;
public class ProductOfDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();   
        int product = 1;
        do{
            product = product * (n%10);
            n = n/10;
            }while(n!=0);
            System.out.println("The product of digits is: "+product);

        }
    }


