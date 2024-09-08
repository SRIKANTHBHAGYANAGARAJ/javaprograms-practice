import java.util.Scanner;
public class EquilateralTriangle {
    static boolean EquilateralTriangle(int a,int b,int c){
        if(a == b && b == c)
        return true;
        else
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        Boolean  rs=EquilateralTriangle(a,b,c);
        if(rs==true)
        System.out.println("It is a Equilateral Triangle");
        else
        System.out.println("It is not a Equilateral Triangle");
    }
}
