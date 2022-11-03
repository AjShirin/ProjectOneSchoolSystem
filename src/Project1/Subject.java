package Project1;

import java.util.*;

public class Subject implements Isubject{

	private String subjectName;
	List<Mark> marksArryList = new ArrayList<>();
	
	public void subjectAvailable() {
		System.out.println("\n The subject is already available");
	}

	// getter for subject name
	public String getSubjectName() {
		return subjectName;
	}

	// setter for subject name
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	// getter for Marks Array list
	public List<Mark> getMarksArryList() {
		return marksArryList;
	}

	// setter for Marks Array list
	public void setMarksArryList(List<Mark> marksArryList) {
		this.marksArryList = marksArryList;
	}
}
