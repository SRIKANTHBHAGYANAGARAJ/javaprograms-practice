import java.util.Scanner;
public class Reverse123 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int x = sc.nextInt();
        int rv = getReverse123(x);
        System.out.println("Reverse of" + x + "is "+rv);
    }
        static int getReverse123(int n){
            int rev = 0;
            int d;
            do{
                 d = n % 10;
                rev = rev * 10 + d;
                n = n / 10;
            }while(n!=0);
            return rev;
        }
    }
  
/*import java.util.Scanner;

public class Reverse123 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int x = sc.nextInt();
        int rv = getReverse123(x);
        System.out.println("Reverse of " + x + " is " + rv);
    }

    static int getReverse123(int n) {
        int rev = 0;
        int d;
        do {
            d = n % 10;
            rev = rev * 10 + d;
            n = n / 10;
        } while (n != 0);
        return rev;
    }
}
  /*import java.util.Scanner;

    public class Reverse123 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number");
            int x = sc.nextInt();
            int rv = getReverse123(x);
            System.out.println("Reverse of " + x + " is " + rv);
        }
    
        static int getReverse123(int n) {
            int rev = 0;
            while (n != 0) {
                int d = n % 10;
                rev = rev * 10 + d;
                n = n / 10; // not n % 10
            }
            return rev;
        }
    }*/
