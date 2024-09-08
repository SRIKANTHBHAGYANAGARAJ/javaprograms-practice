import java.util.Scanner;
public class HappyNumber{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n =sc.nextInt();
        System.out.println("Happy numbers within"+n+":");
        for(int i =1;i<=n;i++){
            if(isHappy(i)){
                System.out.println(i+" ");
            }
        }
    }
}