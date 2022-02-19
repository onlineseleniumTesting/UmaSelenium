package Package1;

public class MethodExample {
	
	public static void test1() {
		System.out.println("Test1 is executed");
	}
	
	public static void test2() {
		System.out.println("Test2 is executed");
	}
	
	public static void add(int a, int b) {
		int c=a+b;
		System.out.println("The addition is --"+c);
	}

	public static void main(String[] args) {
		
		test1();
		//test2();
		
		MethodExample.test1();
		//MethodExample.test2();
		MethodExample.add(455,577);
		
		



	}

}
