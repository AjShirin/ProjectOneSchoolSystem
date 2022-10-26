package Project1;

import java.util.*;

public class Student {
	private String studentName;
	private int enrolID;
	private String studentEmail;

	 List<Subject> listSubject=new ArrayList<>();

	// getter for student email
	public String getStudentEmail() {
		return studentEmail;
	}

	// setter for student email
	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}

	// getter for subjectlist
	public List<Subject> getListSubject() {
		return listSubject;
	}

	// setter for subjectlist
	public void setListSubject(List<Subject> listSubject) {
		this.listSubject = listSubject;
	}

	Student() {
		this.studentName = studentName;
		this.enrolID = enrolID;
	}

	// getter for student name
	public String getStudentName() {
		return studentName;
	}

	// setter for student name
	public void setstudentName(String studentName) {
		this.studentName = studentName;
	}

	// getter for student id
	public int getEnrolID() {
		return enrolID;
	}

	// setter for student id
	public void setEnrolID(int enrolID) {
		this.enrolID = enrolID;
	}
	// public void printInfo() {
	// System.out.println("hi" + getName() + " your id is " + getEnrolID());
	// }
}