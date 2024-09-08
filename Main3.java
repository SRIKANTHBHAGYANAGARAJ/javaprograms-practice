import java.util.Scanner;
public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Eneter 3 intger values:");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        int min = Math.min(Math.min(x, y), z);
        int max = Math.max(Math.max(x, y), z);
        int mid = (x + y + z) - (min + max);
System.out.println("Minimum value is: "+min);
System.out.println("Maximum value is: "+max);
System.out.println("Middle value is: "+mid);

    }

}
