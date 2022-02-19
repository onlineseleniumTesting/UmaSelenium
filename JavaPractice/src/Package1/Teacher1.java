package Package1;

public class Teacher1 {
	
	private String designation  = "Teacher";
	private String collegeName = "CBIT";
	
	protected void setDesignation(String designation) {
		this.designation = designation;
		
	}
	
	protected String getDesignation() {
		return designation;
	}
	
	protected void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
		
	}
	
	protected String getcollegeName() {
		return collegeName;
	}
	
	void does() {
		System.out.println("Teaching");
	}

}
