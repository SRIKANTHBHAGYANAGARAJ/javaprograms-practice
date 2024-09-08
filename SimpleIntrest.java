import java.util.Scanner;
public class SimpleIntrest{
    static int p =100000;
    static int r = 5;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Eneter the time to calculate SI");
        int t = sc.nextInt() ;
        long si = (p*r*t)/100 ;
        System.out.println("Simple Interest is "+si);
    }
}
