import java.util.Scanner;

public class SpecialNumberOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a two-digit integer value:");
        int num = sc.nextInt();
        String rs = (num >= 10 && num <= 99)? "Special Number" : "Not a Special Number";
        System.out.println(num + " is " + rs);
    }
}
