import java.util.Scanner;
class VotingEligibility {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = sc.nextInt();
        if(age>=18){
            System.out.println("you are eleigible to vote");
        }
            else{
                System.out.println("you are not eligible to vote.you must be less tahn 18 years old:");
            }
        }
}


