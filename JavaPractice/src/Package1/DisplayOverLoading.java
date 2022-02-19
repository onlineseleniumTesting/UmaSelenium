package Package1;

public class DisplayOverLoading {
	
	public void display(int i) {
		System.out.println(i);
	}
	public void display(char c) {
		System.out.println(c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DisplayOverLoading d = new DisplayOverLoading();
		d.display('r');

	}

}
