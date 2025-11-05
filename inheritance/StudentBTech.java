package com.practice.inheritance;

public class StudentBTech extends Student01 {
	private String subject;
	private int subjectcode;
	private String studentId;
	
	public String getSubject() {
		return this.subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public int getSubjectcode() {
		return this.subjectcode;
	}
	public void setSubjectcode(int subjectcode) {
		this.subjectcode = subjectcode;
	}
	public String getStudentId() {
		return this.studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

}
