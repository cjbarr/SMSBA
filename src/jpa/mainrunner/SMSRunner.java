package jpa.mainrunner;

import jpa.service.CourseService;
import jpa.service.StudentService;


public class SMSRunner {

	
	static StudentService studentService = new StudentService();
	static CourseService courseService = new CourseService();
	public static void main(String[] args) {
		
			studentService.getAllStudents();
			courseService.getAllCourses();

	}

}
