package jpa.service;

import java.util.List;

import jpa.dao.AbstractDAO;
import jpa.dao.StudentDAO;
import jpa.entitymodels.Course;
import jpa.entitymodels.Student;

public class StudentService extends AbstractDAO implements StudentDAO {

	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student getStudentByEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean validateStudent(String email, String password) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void registerStudentToCourse(String email, int courseId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Course> getStudentCourses(String email) {
		// TODO Auto-generated method stub
		return null;
	}

}
