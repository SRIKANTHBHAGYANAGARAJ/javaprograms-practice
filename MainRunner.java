//* Write a java program to define a method to return fizz if number is divisible by 5,print buzz if number is divisible by 7,print fizz and buzz 
//if number is divisible by both 5 and 7 otherwise return false**//
import java.util.Scanner;
public class MainRunner {
    static String getMessage(int n){
        if(n%5 == 0 && n%7 == 0)
            return"Fizz and Buzz";
        else if(n%5==0)
            return "Fizz";
        else if(n%7==0)
            return "Buzz";
            else
            return " None";
            }
public static void main(String[]args){
    String res = getMessage(35);
    System.out.println("Result is:"+res);
}
    }

