public class Course
{
	private Student[] students;
	public Course(String name, int maxStudents)
	{
		this.name = name;
		this.maxStudents = maxStudents;
		this.students = new Student[maxStudents];
		
		for(int i = 0; i < maxStudents; i++)
		{			
			this.students[i] = null;
		}
	}
	
	private String name;
	
	public String getName() {
		
		return name;
	}
	
	public void setName(String name) {
		
		 this.name = name;
	}
			
	private int maxStudents;
	
	public int getMaxStudents() {
		
		return maxStudents;
	}
	
	public void setMaxStudents(int maxStudents) {
		
		 this.maxStudents = maxStudents;
	}
	
	public Student[] getStudents() {
		
		 return this.students;
	}
	
	public String toString()
	{
		return String.format("%s has %d max students ", this.getName(), this.getMaxStudents());		
	}
}