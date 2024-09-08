import java.util.Scanner;
class EvenOrOddd
{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter  number");
		int n = sc.nextInt();
		if(n%2*2==n)
		System.out.println(n+"is a Even no");
		else
		System.out.println(n+"is aodd no");
	}
}