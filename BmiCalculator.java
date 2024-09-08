import java.util.Scanner;
public class BmiCalculator{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double HeightInMeters=sc.nextDouble();
        Double WeightInKg=sc.nextDouble();
        System.out.println("Enter your height in meters");
        System.out.println("Enter your weight in kilograms ");
        Double bmi =(WeightInKg)/Math.pow(HeightInMeters,2);
        System.out.printf("your Bmi is :%.2f%n",bmi);
        String Category;
            if (bmi<18.5)
            {
                Category="Underweight";
            }
            else if(bmi<30){
                Category="Normal";
            } 
            else{
                Category="Overweight";
            }
            System.out.println("Your BMI Category is:"+Category);
        }
    }
