import java.util.Scanner;
public class Students {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter first grade: ");
        int a = sc.nextInt();

        System.out.print("Enter second grade: ");
        int b = sc.nextInt();

        System.out.print("Enter third grade: ");
        int c = sc.nextInt();

        System.out.print("Enter fourth grade: ");
        int d = sc.nextInt();

        if(a>=35 && b>=35 && c>=35 && d>35){
            System.out.println("pass");
        }
        else{
            System.out.println("fail");
        }
    }
    //if(a<=35 && b<=35 && c<=35 && d<35){
      //  System.out.println("fail");
   // }
   // else{
     //   System.out.println("pass");
    //}}


}