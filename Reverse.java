import java.util.Scanner;
public class Reverse {
    static int Reverse (int n){
    int sum=0;
    while(n!=0){
        int d = n%10;
        sum=sum*10+d;
        n=n/10;
    }
    return sum;
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        int rs= Reverse(n);
        System.out.println(rs);
    }

}
