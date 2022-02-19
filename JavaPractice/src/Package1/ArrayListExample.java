package Package1;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample {
	
	public static void main(String[] args) {
		
		ArrayList<String> al=new ArrayList<String>();
		al.add("C");
		al.add("D");
		al.add("A");
		al.add("A");

		//al.set(0, "Nate");
		//al.remove(0);
//		Collections.sort(al);
		
		//System.out.println(al.get(0));
		System.out.println(al.size());
		
		for(String str:al) {
			System.out.println(str);
		}
		
		
	}

}
