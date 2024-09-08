/*import java.util.Scanner;
public class PowerOfN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of N and p: ");
        int n = sc.nextInt();
        int p = sc.nextInt();
        int result = 1;
        for (int i = 1; i <= p; i++) {
            result = result * n;
            }
            System.out.println("The result is: " + result);
            }
            
        

}*/
import java.util.Scanner;
public class PowerOfN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of N and p: ");
        int n = sc.nextInt();
        int p = sc.nextInt();
        int result = 1;
        int p1 = p;
       while(p>0){
        result = result * n;
        p--;
       }
            System.out.println(n+"to the power of"+p1+"is"+result);
            }
            
        

}
