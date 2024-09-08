/*public class Main {

        public static void main(String[] args) {
            System.out.println(biggestDigit(12345));
            System.out.println(biggestDigit(54321));
            System.out.println(biggestDigit(11111));
        }
    
        public static int biggestDigit(int number){
            int max=0;
            while(number>0){
                int digit = number % 10;
                if(digit > max){
                    max = digit;
                }
                number = number / 10;
            }
            return max;
        }
    }*/

/*import java.util.Scanner;
public class Main{
    public static void main (String[] args){
        System.out.println(biggestDigit(12345));
        System.out.println(biggestDigit(54321));    
        System.out.println(biggestDigit(11111));
        }
        public static int biggestDigit(int number){
            int max=0;
            while(number>0){
                int digit=number%10;
                if(digit>max){
                    max=digit;
                }
                number=number/10;
                }
                return max;
            }
        }*/
import java.util.Scanner;
public class Main{
    System.out.println(biggestdigit(12345));
    System.out.println(biggestdigit(54321));
    System.out.println(biggestdigit(11111));
}
public static int biggestDigit(int number){
    int max=0;
    while(number>0){
        int digit=number%10;
        if(digit>max){
            max=digit;
        }
        number=number/10;
    }
    return max;
}




    




