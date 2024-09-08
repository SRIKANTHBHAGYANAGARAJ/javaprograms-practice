import java.util.Scanner;
public class ArmstrongOrNot1{
    public static int getpow(int p,int n){
        int pow=1;
        while(p>0){
            pow=pow*n;
            p--;
 
        }
        return pow;
    }
static int numberOfDigits(int num){
    int count=0;
    do{
        count++;
        num=num/10;
    }while(num!=0);
    return count;
}
static boolean isArmstrong(int num){
    int sum=0;
    int temp=num;
    int n = numberOfDigits(num);
    do{
        int digit =num%10;
        sum=sum+getpow(digit,num);
        num=num/10;
    }while(num!=0);
    return temp==sum;
} 
 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        boolean rs = isArmstrong(n);
        if (rs)
            System.out.println(n + " is an Armstrong number.");
        else
            System.out.println(n + " is not an Armstrong number.");
  sc.close();
        }
}
