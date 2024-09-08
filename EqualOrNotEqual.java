import java.util.Scanner; 
public class EqualOrNotEqual {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two integer value");
        int a = sc.nextInt();
        int b = sc.nextInt();
        String rs = (a==b)?"Equal":"NotEqual";
        System.out.println(a + " and " + b + " are " + rs);
    }
}
