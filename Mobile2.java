class Mobile2{
	double price;
	String brand;
	int ram;
	int rom;
		public static void main(String[] args){
			Mobile2 m1=new Mobile2();
			Mobile2 m2=new Mobile2();
			m1.displayDetails();
			m2.displayDetails();
			m2.brand="vivo";
			System.out.println(m2.brand);			
	}
void displayDetails(){
	brand="samsung";
	price=120000.0;
	ram=12;
	rom=256;
	System.out.println(brand+","+price+","+ram+","+rom);
   }
}