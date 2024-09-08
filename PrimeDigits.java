import java.util.Scanner;
public class PrimeDigits {
    static int CountPrimeDigits(int num){
        int count = 0;
        do{
            int d = num%10;
            if(d==2||d==3||d==5||d==7)
            count++;
            num=num/10;
        }while(num!=0);
        return count;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n =sc.nextInt();
        int pc=CountPrimeDigits(n);
        System.out.println("number of PrimeDigits:"+pc);
    }
}
