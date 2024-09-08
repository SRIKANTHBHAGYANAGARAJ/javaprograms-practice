/*import java.util.Scanner;
public class Main34{
    public static void main(String[] args) {
    System.out.println(averageDigit(12345));
    System.out.println(averageDigit(54321));
    System.out.println(averageDigit(11111));
}
public static double averageDigit(int number){
    int sum = 0;
    int count = 0;
    while(number>0){
        int digit=number%10;
        sum=sum+digit;
        count++;
        number=number/10;
    }
    return (double)sum/count;
}
}*/
import java.util.Scanner;
public class Main34{
    public static void main(String[]args){
        System.out.println(averageDigit(12345));
        System.out.println(averageDigit(54321));
        System.out.println(averageDigit(11111));

    }
    public static double averageDigit(int number){
        int sum=0;
        int count=0;
        while(number>0){
            int digit=number%10;
            sum=sum+digit;
            count++;
            number=number/10;
        }
        return (double)sum/count;
    } 
}