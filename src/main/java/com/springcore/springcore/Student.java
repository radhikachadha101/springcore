package com.springcore.springcore;

public class Student {
	int studentId;
	String studentName;
	String StudentAddress;
	
	

	public Student(int studentId, String studentName, String studentAddress) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		StudentAddress = studentAddress;
	}
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}


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
	public String getStudentAddress() {
		return StudentAddress;
	}
	public void setStudentAddress(String studentAddress) {
		StudentAddress = studentAddress;
	}


	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", StudentAddress=" + StudentAddress
				+ "]";
	}
	
	
		
}
