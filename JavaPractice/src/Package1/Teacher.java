package Package1;

public class Teacher {
	String name;
	
	public Teacher() {
		this.name = "Test";//Current class object
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Teacher t = new Teacher();
		System.out.println(t.name);

	}

}
