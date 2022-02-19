package Package1;

public class DemoInterface implements MyInterface{
	
	@Override
	public void method1() {
		System.out.println("method1 is executing");
		
	}

	@Override
	public void method2() {
		System.out.println("method2 is executing");
		
	}

	public static void main(String[] args) {
		MyInterface obj = new DemoInterface();
		obj.method1();
		obj.method2();
		
		

	}

	

}
