import java.util.Scanner;
class LargeNumber1{
public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers");
		int a =sc.nextInt();
		int b =sc.nextInt();
		if(a>b)
			System.out.println(a+"is larger");
			else
			System.out.println(b+"is *larger");
	}
}