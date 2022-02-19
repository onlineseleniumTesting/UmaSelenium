package Package1;

public class Employee {
	
	int empId;
	String empName;
	
	public Employee(int id,String name) {
		this.empId = id;
		this.empName = name;
	}
	
	public Employee() {
		System.out.println("Default Constructor");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Employee e = new Employee(1,"uma");
	System.out.println(e.empId+" "+e.empName);
	Employee e1=new Employee();
	
	

	}

}
