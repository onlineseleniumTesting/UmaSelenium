package Package1;

public class If_Examples {

	public static void main(String[] args) {
		
//		int i=5;
//		if(i>5) {
//			System.out.println("i is greater than 5");
//		}else if(i==5) {
//			System.out.println("i is equal 5");
//		}else {
//			System.out.println("I is less than 5");
//		}
		
		int s1=90, s2=85, s3=60, s4=34, s5=80, s6=90;
		int total = s1+s2+s3+s4+s5+s6;
		double avg = total/6;
		System.out.println("The average is:-"+avg);
		
		if(s1>35&s2>35&s3>35&s4>35&s5>35&s6>35&avg>60) {
			System.out.println("First Class");
		}else if(s1>35&s2>35&s3>35&s4>35&s5>35&s6>35&avg > 50 & avg <60) {
			System.out.println("Second class");
		}else if(s1>35&s2>35&s3>35&s4>35&s5>35&s6>35&avg<50 & avg>35) {
			System.out.println("Third Class");
		}else {
			System.out.println("Fail");
		}
		
		
		
		
		
		
		

	}

}
