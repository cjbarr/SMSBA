package jpa.entitymodels;

import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
@Id
	private String sEmail;
@Basic
	private String sName;
@Basic
	private String sPass;
@Basic
	private List sCourses;
	
	
	public Student() {
		super();
	}


	public Student(String sEmail, String sName, String sPass, List sCourses) {
		super();
		this.sEmail = sEmail;
		this.sName = sName;
		this.sPass = sPass;
		this.sCourses = sCourses;
	}


	public String getsEmail() {
		return sEmail;
	}


	public void setsEmail(String sEmail) {
		this.sEmail = sEmail;
	}


	public String getsName() {
		return sName;
	}


	public void setsName(String sName) {
		this.sName = sName;
	}


	public String getsPass() {
		return sPass;
	}


	public void setsPass(String sPass) {
		this.sPass = sPass;
	}


	public List getsCourses() {
		return sCourses;
	}


	public void setsCourses(List sCourses) {
		this.sCourses = sCourses;
	}
	
	
	
}
