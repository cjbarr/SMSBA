package jpa.service;

import java.util.List;

import jpa.dao.AbstractDAO;
import jpa.dao.CourseDAO;
import jpa.entitymodels.Course;

public class CourseService extends AbstractDAO implements CourseDAO {
//	Gets all courses from course list
	@Override
	public List<Course> getAllCourses() {

		List<Course> result = null;
		String sql = "SELECT e FROM Course e";
		try {
			connect();
			result = em.createQuery(sql, Course.class).getResultList();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			dispose();
		}

		return result;

	}

}
