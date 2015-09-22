public class Student
{
	public Student(String studentId, String firstName, String lastName, Boolean tuitionPaid)
	{
		this.studentId = studentId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.tuitionPaid = tuitionPaid;
	}
	
	private String studentId;
	
	public String getStudentId() {
		
		return studentId;
	}
	
	public void setStudentId(String studentId) {
		
		this.studentId = studentId;
	}
	
	private String firstName;
	
	public String getFirstName() {
		
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		
		this.firstName = firstName;
	}
	
	private String lastName;
	
	public String getLastName() {		
		return lastName;
	}
	
	public void setLastName(String lastName) {
		
		this.lastName = lastName;
	}
	
	private boolean tuitionPaid;
	
	public boolean TuitionPaid() {
		
		return tuitionPaid;
	}
	
	public void setTuitionPaid(boolean tuitionPaid) {
		
		this.tuitionPaid = tuitionPaid;
	}
	
	public String toString() {
		if (this.tuitionPaid) {		
			return String.format("Student %s %s has paid tuition.", this.getFirstName(), this.getLastName());
		}
		else {
			return String.format("Student %s %s has not paid tuition.", this.getFirstName() , this.getLastName());
		}
	}
}