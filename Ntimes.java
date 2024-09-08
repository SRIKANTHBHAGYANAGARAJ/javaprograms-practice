import java.util.Scanner;
public class Ntimes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = sc.next();
        System.out.println("Enter the number of times you want to print your name:");
        int num = sc.nextInt();
        int i = 1;
        while (i<=num) {
            System.out.println(name);
            i++;
            
        }
        
            }
}
