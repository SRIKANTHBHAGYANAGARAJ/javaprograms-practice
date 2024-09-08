/*mport java.util.Scanner;
public class StrongNumber1 {
    public static int fact(int n){
        int fact = 1;
        while(n>0){
            fact=fact*n;
            n--;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int t=num;
        while(num!=0){
            int r=num%10;
            sum=sum+fact(r);
            num=num/10;

        }
        if(sum==t){
            System.out.println("Strong Number");
        }
        else{
            System.out.println("Not a Strong Number");
        }
        }
    }

}*/


/*import java.util.Scanner;
public class StrongNumber{
    public static int fact(int n){
        int fact=1;
        while(n>0){
            fact=fact*n;
            n--;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num=n;
        int sum = 0 ;
        int t =num;
        while(num!=0){
            int r = num%10;
            sum=sum+fact(r);
            num=num/10;
        }
        if(sum==t){
            System.out.println("Strong Number");
        }
            else{
            System.out.println("Not a Strong Number");
        }

    }
}*/

import java.util.Scanner;
public class StrongNumber1{
    public static int fact(int n){
        int fact=n;
        while(n>0){
            fact=fact*n;
            n--;
        }
        return fact;0
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter number");
        int num=0;
        int sum=0;
        int t=num;
        while(n!=0){
            int r=num%10;
            sum=sum+fact(r);
            num=num/10;
        }
        if(sum==t){
            System.out.println("Strong Number");
        }
        else{
            System.out.println("Not a Strong Number");
        }
        }
    }
