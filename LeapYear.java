import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year:");
        int m =sc.nextInt();
        if(m % 4 == 0 && m % 100!=0 || m % 400 == 0){
            System.out.println("Leap year");
              }else
              {
                System.out.println("not a leap yaer");
              }
    }

}
