public class CourseRegistrationProgram
{
	public static void main(String[] args)
	{		
		Course course = new Course("Introduction to java", 10);
		Student student1 = new Student("0001", "Connor", "Cheng", true);
		Student student2 = new Student("0002", "Judy", "Cheng", false);
		
		Class theClass = new Class(course);
		theClass.addStudent(student1);
		theClass.addStudent(student2);
		
		theClass.dropStudent(student1);
		System.out.println(theClass.toString());
	}	
}