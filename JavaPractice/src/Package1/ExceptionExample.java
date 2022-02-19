package Package1;

public class ExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Program Started");
		try {
		int num=34;
		int a = num/0;
		System.out.println(a);
		}catch(ArithmeticException e) {
			System.out.println("Warning! Arithmetic exception occured");
		}finally {
			System.out.println("finally block is executed");
		}
		System.out.println("i am our of the try and catch block");
		
		
		
	}

}
