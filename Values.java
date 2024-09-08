import java.util.Scanner;
public class Values {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values");
        int n = sc.nextInt();
        if(n>9 && n<100 ||n< -99 && n>-100){
            System.out.println(n+"is a Two Digit Number");
        }
        else
        System.out.println(n+"is not a two digit number");
    }

}
