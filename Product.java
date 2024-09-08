class Product{
	String type;
	int quantity;
	float price;
		Product(String t ,int q,float p){
			this.type = t;
			this.quantity=q;
			this.price=p;
		}
public static void main(String[] args){
	Product p1=new Product("Colgate",20,5.3f);
	System.out.println(p1.type+" "+p1.quantity+" "+p1.price);
	Product p2=new Product("brush",10,5.4f);
	System.out.println(p2.type+" "+p2.quantity+" "+p2.price);
	Product p3=new Product("domex",15,5.6f);
	System.out.println(p3.type+" "+p3.quantity+" "+p3.price);

}
	}