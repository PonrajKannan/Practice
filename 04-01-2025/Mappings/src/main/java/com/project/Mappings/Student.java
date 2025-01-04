package com.project.Mappings;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {

	@Id
	private int studentId;
	private String studentName;
	
//	private Subject studentSubject;

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

//	public Subject getStudentSubject() {
//		return studentSubject;
//	}
//
//	public void setStudentSubject(Subject studentSubject) {
//		this.studentSubject = studentSubject;
//	}
//
//	@Override
//	public String toString() {
//		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentSubject=" + studentSubject
//				+ "]";
//	}
	
}
