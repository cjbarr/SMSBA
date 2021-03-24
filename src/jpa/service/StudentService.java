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

		return result;
	}

	@Override
	public Student getStudentByEmail(String email) {
		Student result = null;
		
		try {
			connect();
			result = em.find(Student.class, email);
					
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			dispose();
		}		
		return result;
	}

	@Override
	public boolean validateStudent(String email, String password) {
boolean result = false;
		Student qResult = null;
		try {
			connect();
			qResult = (Student) em.createQuery("SELECT s FROM Student s WHERE s.sEmail = :email AND s.sPass = :pass ").setParameter("email", email).setParameter("pass", password).getSingleResult();
			if(qResult != null) {
				result = true;
			}
		
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			dispose();
		}		

		return result;

	// don't forget this needs to be set up if the result does not get anything it is throwing an error	
		
		
		
		
	}

	@Override
	public void registerStudentToCourse(String email, int courseId) {
		try {
			connect();
			em.getTransaction().begin();
			Student studentR = em.find(Student.class, email);
			List<Course> currentCourses = studentR.getsCourses();
			Course addCourse = em.find(Course.class, courseId);
			currentCourses.add(addCourse);
			em.getTransaction().commit();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			dispose();
		}
	}

	@Override
	public List<Course> getStudentCourses(String email) {
		Student studentR = getStudentByEmail(email);
		List<Course> result = studentR.getsCourses();
		
		return result;

		
	}

}

