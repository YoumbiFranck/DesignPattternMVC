package aufgabe2;

public class CourseView {
	
	//se charge de l'affichage sur la console 
	
	public void printCourseDetails ( String CourseName ,String CourseId , String CourseCategory ){
		
		System.out.println ("");
		System.out.println("Course");
		System.out.println("--------      ");
		System.out.println("Name: " + CourseName); 
		System.out.println("ID: " + CourseId); 
		System.out.println("Category: " + CourseCategory);
		
}
}
