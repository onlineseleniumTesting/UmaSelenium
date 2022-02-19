package Package1;

public class Boy extends Human {
	
	public void eat() {
		System.out.println("Boy is eating");
		//super.eat();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Human h = new Human();
		h.eat();
		
		Human obj = new Boy();
		obj.eat();

	}

}
