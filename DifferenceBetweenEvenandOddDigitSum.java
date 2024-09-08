import java.util.Scanner;
public class DifferenceBetweenEvenandOddDigitSum{
public static void main(String[]args) {
    System.out.println(DifferenceBetweenEvenandOddDigitSum(12345));
    System.out.println(DifferenceBetweenEvenandOddDigitSum(54321));
    System.out.println(DifferenceBetweenEvenandOddDigitSum(11111));

}
public static int DifferenceBetweenEvenandOddDigitSum(int number){
    int evenSum = 0;
    int oddSum = 0;
    while (number>0) {
        int digit = number % 10;
        if(digit%2==0){
            evenSum += digit;
        }
        else{
            oddSum += digit;
        }
        number=number/10;
        
    }
    return evenSum-oddSum;
}
}