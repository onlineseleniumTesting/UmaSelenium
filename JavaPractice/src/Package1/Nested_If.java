package Package1;

public class Nested_If {

	public static void main(String[] args) {
		
//		int num=40;
//		if(num<100) {
//			System.out.println("number is less than 100");
//			if(num>50) {
//				System.out.println("Greater than 50");
//			}
//			
//			
//		}
		
		int num1=100, num2=40, num3=300;
		if(num1>num2 & num1>num3) {
			System.out.println(num1+"- is largest number");
		}else if(num2>num1 & num2>num3) {
			System.out.println(num2+"-is largest number");
		}else {
			System.out.println(num3+"-is the largest number");
		}
		
		

	}

}
