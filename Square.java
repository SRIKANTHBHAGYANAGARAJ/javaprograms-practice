import java.util.Scanner;
public class Square{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of square");
        int a = sc.nextInt();
        int area = a * a;
        int perimeter=4*a;
        System.out.println("Area of square is "+area);
        System.out.println("Area of Perimeter is "+perimeter);
}