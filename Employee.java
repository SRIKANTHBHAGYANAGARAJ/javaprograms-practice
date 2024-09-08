class Employee{
	void work(){
	System.out.println("works");
	}
	void takeoff(){
	System.out.println("takeoff");
	}
	void resign(){
	System.out.println("resign");
	}
	public static void main(String args[]){
	Employee e = new Employee();
	e.work();
	e.takeoff();
	e.resign();	
	}
}