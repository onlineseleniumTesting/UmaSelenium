package Package1;

public class BMW extends Car {
	
	String carBody = "Iron";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BMW b = new BMW();
		System.out.println(b.carColor);
		System.out.println(b.carType);
		System.out.println(b.noOfSeats);
		System.out.println(b.carBody);
		b.does();


	}

}
