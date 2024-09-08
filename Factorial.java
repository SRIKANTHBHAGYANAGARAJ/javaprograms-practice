/*import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {    
    Scanner sc = new Scanner(System.in);
    int n = 4;
    int fact = 1;
    while(n>=1){
        fact=fact*n;
        n--;
    System.out.println("factorial is:"+fact);
        }
    }
}*/
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int fact = 1;
        int i = 1;
        while (i <= num) {
            fact *= i;
            System.out.println("Current value: " + fact);
            i++;
        }
        System.out.println("Final factorial: " + fact);
    }
}

/*lass Factorial1{
    public static void main(String[] args) {
    int fact = 1,i=1;
    while(i<=10)
    System.out.println(i+"!="+(fact=fact*i++));
    }
}*/