package Package1;

import java.util.Scanner;

public class For_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		
//		for(int i=10;i>=1;i--) {
//			System.out.print(i);
//			
//		}
		
//		int table=5;
//		for(int j=1;j<=20;j++) {
//			System.out.println(table+"*"+j+"="+table*j);
//		}
//		

//	int number=5;
//	int fact=1;
//	for(int i=1;i<=number;i++) {
//		fact = fact*i;
//		
//	}
//	System.out.println("Factorial of "+number+" is="+fact);
//		
//		
//	}
		
//		//0 1 1 2 3 5 8
//		int count=7, num1=0,num2=1;
//		for(int i=1;i<=count;i++) {
//			System.out.println(num1+" ");
//			int sumOfPrevTwoNum = num1+num2;
//			num1 = num2;
//			num2 = sumOfPrevTwoNum;
//			
//		}
		
		//Prime number
		int temp;
		boolean isPrime = true;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter any number");
		int num = scan.nextInt();
		//scan.close();
		
		for(int i=2;i<=num/2;i++) {
			
			temp = num%i;
			if(temp==0) {
				isPrime = false;
				break;		
			}
		}
			if(isPrime) {
				System.out.println("num is prime number");
			}else {
				System.out.println("Num is not prime number");
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
	}
		
