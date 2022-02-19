package Package1;

public class String_Example {

	public static void main(String[] args) {
		
		String str = new String();
		String str1 = "I am teaching to uma";
		String str2 = "Uma lives in USA";
		int i = str1.length();
		System.out.println("Length of the string str1 is:"+i);
		System.out.println(str1.concat(  str2));
		System.out.println(str1.indexOf('t'));
		System.out.println(str1.indexOf('a', 10));
		System.out.println(str1.equals(str2));
		System.out.println(str1.contains("uma"));
		System.out.println(str1.substring(4, 17));
		
		

	}

}
