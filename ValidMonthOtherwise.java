import java.util.Scanner;
public class ValidMonthOtherwise{
    static boolean isValidDate(int d,int m,int y){
        if(d<1||d>31||m<1||m>12||y<1){
            return false;
        }
        else if(m==4||m==6||m==9||m==11&&d>30){
            return false;
        }
        else if(!(y%400==0||y%4==0&&y%100!=0)==false &&m==2&&d>28){
            return false;
        }
        else{
            return true;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the date (dd mm yyyy)");
        int dd = sc.nextInt();
        int mm = sc.nextInt();
        int yy = sc.nextInt();
        boolean isValid = isValidDate(dd, mm, yy);
        if(isValid){
            System.out.println("Date is valid");}
            else{
            System.out.println("Date is not valid");
                }
    }
}







































