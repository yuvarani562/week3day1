package org.student;

import org.department.Department;

public class Student extends Department {
	public void studentName() {
		System.out.println("Student Name is yuvarani");

	}

	public void studentDept() {
		System.out.println("Dept Name is Maths");

	}

	public void studentId() {
		System.out.println("student id yuva");

	}

	public static void main(String[] arg) {

		Student studentDetail = new Student();
		studentDetail.studentName();
		studentDetail.studentDept();
		studentDetail.studentId();
		studentDetail.deptName();
		studentDetail.collegename();
		studentDetail.collegecode();
		studentDetail.collegeRank();
	}

}
