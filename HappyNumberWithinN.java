/*import java.util.Scanner;

public class HappyNumberWithinN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Happy number within " + n + " : ");
        for (int i = 1; i <= n; i++) {
            if (isHappy(i)) {
                System.out.println(i + " ");
            }
        }
    }

    public static boolean isHappy(int num) {
        int slow = num;
        int fast = num;
        do {
            slow = getSumOfSquare(slow);
            fast = getSumOfSquare(getSumOfSquare(fast));
        } while (slow != fast);
        return slow == 1;
    }

    public static int getSumOfSquare(int num) {
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            sum = sum + digit * digit;
            num = num / 10;
        }
        return sum;
    }
}*/

import java.util.Scanner;
public class HappyNumberWithinN{
    public static void main(String[] args){
        Scanner sc= new Scanner(system.in);
        int n = sc.nextInt();
        System.out.println("Happy number within :"+" n "+ " :");
        for (int i=1;i<=n;i++){
            if(isHappy(i)){
                System.out.println(i+" ");
            }
        }

    }
}
public static boolean isHappy(int num){
    int slow = num;
    int fast = num;
    do{
        slow=getSumOfSquare(slow);
        fast=getSumOfSquare(getSumOfSquare(fast));
    }while{}
}