import java.util.Scanner;
public class MainProduct{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		System.out.println("Enter the number of products and price:");
		String name1 = sc.next();
		Double Price1=sc.nextDouble();
		String name2 = sc.next();
		Double Price2=sc.nextDouble();
		String name3 = sc.next();
		Double Price3=sc.nextDouble();
		double dis1=0.0;
		double dis2=0.0;
		double dis3=0.0;
		if(Price1>9999){
			dis1=Price1*0.08;
		}
		if(Price1>9999){
			dis2=Price2*0.08;	
		}
		if(Price3>9999){
			dis3=Price3*0.08;
		}
double tmrp=Price1+Price2+Price3;
double tdis=dis1+dis2+dis3;
double tp=tmrp-tdis;
System.out.println("Pname MRP Discount fPrice");
System.out.println("----------------------------");
System.out.println(name1+" "+Price1+" "+dis1+" "+(Price1-dis1));
System.out.println(name2+" "+Price2+" "+dis2+" "+(Price2-dis2));
System.out.println(name3+" "+Price3+" "+dis3+" "+(Price3-dis3));
System.out.println("----------------------------");
System.out.println("TotalPrice"+tmrp+" "+tdis+" "+tp);
System.out.println("Netpay:"+tp);
System.out.println("you have saved:"+tdis);
	}
}