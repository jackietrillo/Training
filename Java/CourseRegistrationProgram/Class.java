import java.util.*;

public class Class
{
	private Course course;
	public Class(Course course)
	{
		this.course = course;
		
	}
			
	public void addStudent(Student student)
	{
		Student[] students = this.course.getStudents();
		int maxStudents = this.course.getMaxStudents();		
	    for(int i=0; i < maxStudents; i++){
			if (students[i] == null)
			{
				students[i] = student;					
				break;
			}			
	    }         		
	}
	
	public void dropStudent(Student student)
	{
		Student[] students = this.course.getStudents();
		int maxStudents = this.course.getMaxStudents();		
		for(int i=0; i < maxStudents; i++) {
			if (students[i] != null)
			{
				if (students[i].getFirstName() == student.getFirstName()					
					&& 
					students[i].getLastName() == student.getLastName())
				{
						students[i] =  null;					
				}
			}
		 }         		
	}
	
	public String toString()
	{	
		String roster = "";
		Student[] students = this.course.getStudents();
		int maxStudents = this.course.getMaxStudents();
		for(int i=0; i < maxStudents; i++)
		{ 
			if (students[i] != null)
			{
				roster += String.format("Student %s %s \n", students[i].getFirstName(),
				students[i].getLastName());				
			}			
		}			
		return roster;
	}
}