import java.util.Scanner;
public class NtoOne {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of n");
        int n = sc.nextInt();
        while(n>=1){
            System.out.println(n);
            n--;
        }

        
    }

}
