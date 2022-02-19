package Package1;

public class AccessModifier {
	public static void test_pub() {
		System.out.println("calling Public method");
	}
	private static void test_pri() {
		System.out.println("calling private method");
	}
	protected static void test_pro() {
		System.out.println("calling protected method");
	}
	static void test_noaccmod() {
		System.out.println("calling noaccmod method");
	}
	
	public static void main(String[] args) {
		test_pub();
		test_pri();
		test_pro();
		test_noaccmod();


	}

}
