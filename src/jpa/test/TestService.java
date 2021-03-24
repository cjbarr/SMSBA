package jpa.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import jpa.service.StudentService;

class TestService {

	StudentService studentService = new StudentService();

	@Test
	void testValidateStudentPass() {

		String studentEmail = "aiannitti7@is.gd";
		String studentPassword = "Fakepass";

		Boolean expectedResult = false;
		Boolean actualResult = studentService.validateStudent(studentEmail, studentPassword);
		assertEquals(expectedResult, actualResult);

	}

	@Test
	void testValidateStudentEmail() {

		String studentEmail = "FakeEmail";
		String studentPassword = "TWP4hf5j";

		Boolean expectedResult = false;
		Boolean actualResult = studentService.validateStudent(studentEmail, studentPassword);
		assertEquals(expectedResult, actualResult);

	}

	@Test
	void testValidateStudentCorrectInfo() {

		String studentEmail = "aiannitti7@is.gd";
		String studentPassword = "TWP4hf5j";

		Boolean expectedResult = true;
		Boolean actualResult = studentService.validateStudent(studentEmail, studentPassword);
		assertEquals(expectedResult, actualResult);

	}

}
