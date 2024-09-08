import java.util.Scanner;
public class ZeroOrNonZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the integer values");
        int n = sc.nextInt();
        String rs = (n==0)? "Zero" : "Non-Zero";
        System.out.println(n+" is an "+rs);
    }

}
