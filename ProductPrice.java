import java.util.Scanner;

public class ProductPrice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the price: ");
        double Price = sc.nextDouble();
        double price = Price - Price * 0.08;
        
        if(price > 9999) {
            System.out.println("The price is greater than 9999");
        } else {
            System.out.println("The price is less than or equal to 9999");
        }
        
        System.out.println("payable amount is " + price); // concatenate the String and double value
    }
}