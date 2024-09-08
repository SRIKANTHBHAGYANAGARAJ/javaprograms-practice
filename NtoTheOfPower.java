/*import java.util.Scanner;
public class NtoTheOfPower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p1=getPow(5,3);
        System.out.println("8 to the power of 3 is"+p1);
        System.out.println("5 to the power of 4 is"+getPow(8,2));
        int n = sc.nextInt();
        int p = sc.nextInt();
        System.out.println(n + " to the power of " + p + " is " + getpow(n,P));
        Static intgetPow(int n,int p){
            int pow=1;
            while (p>0) {
                pow *= n;
                p--;
                
            }
            return prod;
        }
        
    }

}
*/
import java.util.Scanner;

public class NtoTheOfPower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p1 = getPow(5, 3);
        System.out.println("5 to the power of 3 is " + p1);
        System.out.println("8 to the power of 2 is " + getPow(8, 2));
        int n = sc.nextInt();
        int p = sc.nextInt();
        System.out.println(n + " to the power of " + p + " is " + getPow(n, p));
    }

    public static int getPow(int n, int p) {
        int pow = 1;
        while (p > 0) {
            pow *= n;
            p--;
        }
        return pow;
    }
}