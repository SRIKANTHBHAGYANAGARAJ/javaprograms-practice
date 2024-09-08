import java.util.Scanner;
public class Rectangle {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Eneter the length and width of rectangle:");
        int l = sc.nextInt();
        int w = sc.nextInt();
        int area=l*w;
        int perimeter=2*(l+w);
        System.out.println("area of Rectangle is"+area);
        System.out.println("area of Rectangle is"+perimeter);
    }

}
