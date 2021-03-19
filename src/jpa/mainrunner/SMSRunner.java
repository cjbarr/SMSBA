package jpa.mainrunner;

import jpa.service.CourseService;
import jpa.service.StudentService;

public class SMSRunner {

	
	static StudentService studentService = new StudentService();
	static CourseService courseService = new CourseService();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			courseService.getAllCourses();
		

	}

}
