package jpa.service;

import java.util.List;

import jpa.dao.AbstractDAO;
import jpa.dao.StudentDAO;
import jpa.entitymodels.Course;
import jpa.entitymodels.Student;

public class StudentService extends AbstractDAO implements StudentDAO {

	@Override
	public List<Student> getAllStudents() {
		
		List<Student> result = null;
		String sql = "SELECT e FROM Student e";
		try {
			connect();
			result = em.createQuery(sql, Student.class).getResultList();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			dispose();
		}

		System.out.println("Student RESULT" + result);
		return result;
	}

	@Override
	public Student getStudentByEmail(String email) {
		Object result = null;
		
		try {
			connect();
			result = em.createQuery("SELECT s FROM Student s WHERE s.sEmail = :email ").setParameter("email", email).getSingleResult();
					;
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			dispose();
		}
//		
		
		System.out.println(result);
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
