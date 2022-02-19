package Package1;

public class ChemistryTeacher extends Teacher1{
	
	String mainSubject = "Chemistry";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChemistryTeacher ct = new ChemistryTeacher();
		System.out.println(ct.getcollegeName());
		System.out.println(ct.getDesignation());
		System.out.println(ct.mainSubject);
		ct.does();

	}

}
