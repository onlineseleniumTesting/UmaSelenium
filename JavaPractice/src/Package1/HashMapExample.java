package Package1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer, String> hmap = new HashMap<Integer, String>();
		hmap.put(1, "Uma");
		hmap.put(2, "Tom");
		hmap.put(3, "Rock");
		
//		System.out.println(hmap.get(1));
//		
//		//Set set=hmap.entrySet();
//		Iterator iter = set.iterator();
//		while(iter.hasNext()) {
//			Map.Entry mentry = (Map.Entry)iter.next();
//			System.out.println(mentry.getKey()+"---"+mentry.getValue());
//		}
		
		boolean flag = hmap.containsKey(4);
		System.out.println(flag);
		

	}

}
