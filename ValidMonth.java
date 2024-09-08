//WRITE A JAVA PROGRAM TO DEFINE A METHOD TO RETURN TRUE IF MONTH IS VALID OTHERWISE RETURN FALSE
import java.util.Scanner;
public class ValidMonth{
    static Boolean validMonth(int m){
        if(m>1 && m<=12)
            return true;
            else
            return false;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the month number");
        int m = sc.nextInt();
        boolean rs = validMonth(m);
        if(rs==true)
            System.out.println("valid Month");
            else
            System.out.println("Invalid Month");
        
    }
}