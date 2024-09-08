class Employee1
{
	int id;
	String name;
	double sal;
	public static void main(String args[])
	{
		System.out.println("start");
		Employee1 e = new Employee1();
		e.id = 25;
		e.name = "tom";
		e.sal = 25000.0;
		e.displayDetails();
		System.out.println("stop");
	}
void displayDetails()
{
	System.out.println("name :"+name);
	System.out.println("id:"+id);
	System.out.println("sal:"+sal);
}
}