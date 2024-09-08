import java.util.Scanner;
public class MainClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the integers value");
        int n = sc.nextInt();
        String rs = (n<0)?"Negative":"positive";
        System.out.println(n+"is an "+rs);
    }

}
*