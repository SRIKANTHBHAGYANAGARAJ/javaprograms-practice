import java.util.Scanner;
public class ConvertCmToFoot{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length in centimeters:");
        double cm = sc.nextDouble();
        double feet = cm / 30.48;
        System.out.printf("%2f centimeters is equal to %.2f%n",cm,feet);
    }
}
