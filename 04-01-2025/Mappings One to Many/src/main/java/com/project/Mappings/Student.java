package com.project.Mappings;

import java.util.LinkedList;
import java.util.List;

import javax.persistence.*;

@Entity
public class Student {

	@Id
	private int studentId;
	private String studentName;
	
	@OneToMany
	private List<Subject> studentSubject = new LinkedList<Subject>();

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

	public List<Subject> getStudentSubject() {
		return studentSubject;
	}

	public void setStudentSubject(List<Subject> studentSubject) {
		this.studentSubject = studentSubject;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentSubject=" + studentSubject
				+ "]";
	}
	
}
