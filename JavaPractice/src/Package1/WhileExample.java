package Package1;

public class WhileExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int i=10;
//		while(i>1) {
//			System.out.println(i);
//			//i--;
//		}
		
//		int arr[] = {4,6,3,4,7};
//		int i=0;
//		while(i<arr.length) {
//			System.out.println(arr[i]);
//			i++;
//		}
		
		
//		int num = 5;
//		int fact = 1;
//		int i=1;
//		while(i<=num) {
//			
//			fact = fact*i;
//			i++;
//		}
//		System.out.println("The fact is="+fact);
		
		int count = 7,num1=0,num2=1;
		int i=0;
		while(i<=count) {
			System.out.println(num1+" ");
			int sumOfPreValues = num1+num2;
			num1 = num2;
			num2 = sumOfPreValues;
			i++;
		}
		
		
		
		
		
		
		
		

	}

}
