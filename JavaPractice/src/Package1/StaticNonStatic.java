package Package1;

public class StaticNonStatic {
	
	static int i=10;
	int j=20;
	
	public static void test1() {
		//test2();
		System.out.println("Calling static method");
	}
	
	public void test2() {
		test1();
		System.out.println("Calling Non Static method");
	}

	public static void main(String[] args) {
		//test1();
		StaticNonStatic sc = new StaticNonStatic();
		sc.test2();
		System.out.println(sc.j);
		
		

	}

}
