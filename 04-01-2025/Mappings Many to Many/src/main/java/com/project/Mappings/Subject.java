package com.project.Mappings;

import java.util.LinkedList;
import java.util.List;

import javax.persistence.*;

@Entity
public class Subject {
	
	@Id
	private int subjectId;
	private String subjectName;
	
	@ManyToMany(mappedBy="studentSubject")
	private List<Student> student = new LinkedList<Student>();

	public int getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(int subjectId) {
		this.subjectId = subjectId;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public List<Student> getStudent() {
		return student;
	}

	public void setStudent(List<Student> student) {
		this.student = student;
	}

	@Override
	public String toString() {
		return "Subject [subjectId=" + subjectId + ", subjectName=" + subjectName + ", student=" + student + "]";
	}
	
}
