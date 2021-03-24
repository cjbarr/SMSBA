package jpa.entitymodels;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Course {

	@Override
	public String toString() {
		return cId + " " + cName + " " + cInstructorName;
	}

	@Id
	int cId;

	@Column(nullable = false)
	String cName;
	@Column(nullable = false)
	String cInstructorName;

	public Course() {
		super();
	}

	public Course(int cId, String cName, String cInstructorName) {
		super();
		this.cId = cId;
		this.cName = cName;
		this.cInstructorName = cInstructorName;
	}

	public int getcId() {
		return cId;
	}

	public void setcId(int cId) {
		this.cId = cId;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public String getcInstuctorName() {
		return cInstructorName;
	}

	public void setcInstuctorName(String cInstuctorName) {
		this.cInstructorName = cInstuctorName;
	}

}
