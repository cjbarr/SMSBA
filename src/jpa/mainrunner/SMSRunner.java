package jpa.mainrunner;

import jpa.service.CourseService;
import jpa.service.StudentService;


public class SMSRunner {

	
	static StudentService studentService = new StudentService();
	static CourseService courseService = new CourseService();
	public static void main(String[] args) {
		
//			studentService.getAllStudents();
//			courseService.getAllCourses();
			studentService.getStudentByEmail("aiannitti7@is.gd");
			studentService.validateStudent("aiannitti7@is.gd", "TWP4hf5j");
			// don't forget this needs to be set up if the result does not get anything it is throwing an error	
			studentService.getStudentCourses("aiannitti7@is.gd");
			
	}

}
