import java.util.Scanner;
public class Prime {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number");
    int n = sc.nextInt();
    boolean rs = isPrime(n);
    if(rs)
    System.out.println(n+"is a prime number");
    else
    System.out.println(n+"is not a prime number");
}
static boolean isPrime(int x){
int count = 1;
for(int i =1;i<=x/2;i++){
    if(x % i == 0)
    count++;
}
return count == 2;
}
}