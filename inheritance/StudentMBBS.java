package com.practice.inheritance;

public class StudentMBBS extends Student01{
	private String subject;
	private int subjectcode;
	private String studentId;
	private int passward;
	
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
	public void setStudentId(String studentId ) {
		this.studentId = studentId;
	}
	public int getPassward() {
		return this.passward;
	}
	public void setPassward(int passward) {
		this.passward = passward;
	}

}
