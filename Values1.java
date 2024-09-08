import java.util.Scanner;
public class Values1 {
    public static void main(String[] args){
        System.out.println("Enter the values");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n>=-9 && n<=9){
            System.out.println(n+"is a digit");
         } else{
            System.out.println(n+"is a number");
        }
        
    }
}
