package aufgabe2;

public class MVCPatternDemo {
	
	private static Course fetchCourse (){
	Course course = new Course(); 
	course.setCourseName("Software Engineering"); 
	course.setCourseId ("01");
	course.setCourseCategory (" Wirtschaftsinformatik "); 
	return course ;
	}

	public static void main(String[] args) {
		
		// fetch Course 
		Course model = fetchCourse ( ) ;
		//Create a view : to write course details on console 
		CourseView view = new CourseView ( ) ;
		CourseController controller = new CourseController(model, view);
		// update model data
		//controller . setCourseName(" Softwaretechnik ");

	}

}
