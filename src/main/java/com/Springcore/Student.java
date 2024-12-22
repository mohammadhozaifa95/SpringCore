package com.Springcore;

public class Student {
	private int studentId;
	private String studentName;
	private String studentAddress; // Corrected spelling

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

	public String getStudentAddress() { // Corrected spelling
		return studentAddress;
	}

	public void setStudentAddress(String studentAddress) { // Corrected spelling
		this.studentAddress = studentAddress;
	}

	public Student(String studentName, String studentAddress) { // Corrected spelling
		super();
		this.studentName = studentName;
		this.studentAddress = studentAddress; // Corrected spelling
	}

	public Student() {
		super();
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentAddress=" + studentAddress
				+ "]"; // Corrected spelling
	}
}
