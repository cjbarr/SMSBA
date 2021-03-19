package jpa.entitymodels;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Course {

@Id
	int cId;



@Basic
	String cName;
@Basic
	String cInstuctorName;
	
public Course() {
	super();
}
	
	public Course(int cId, String cName, String cInstuctorName) {
		super();
		this.cId = cId;
		this.cName = cName;
		this.cInstuctorName = cInstuctorName;
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
		return cInstuctorName;
	}


	public void setcInstuctorName(String cInstuctorName) {
		this.cInstuctorName = cInstuctorName;
	}
	
	
	
}
