/*import java.util.Scanner;
public class MultiplicationOfTables {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of tables you want to print: ");
        int n = sc.nextInt();
        int i =1;
        int mul = 0;
        while(i<=20){
            mul = i*n;
            System.out.println(mul);
            i++;

        }
    }
}*/
import java.util.Scanner;

public class MultiplicationOfTables {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of tables you want to print: ");
        int n = sc.nextInt();
        
        for(int i = 1; i <= 5; i++) {
            int mul = i * n;
            System.out.println(mul);
        }
    }
}

