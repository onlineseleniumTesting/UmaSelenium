package Package1;

public class SuperSubClass extends SuperExample {
	
	int num = 300;
	
	void printNumber() {
		System.out.println("this is super sub class");
		super.printNumber();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SuperSubClass s=new SuperSubClass();
		s.printNumber();

	}

}
