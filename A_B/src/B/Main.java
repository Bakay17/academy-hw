package com.company;

public class Main {

    public static void main(String[] args) {
	    Student bakay = new Student();
	    bakay.setName("Bakay");
	    bakay.setSoname("Berdibekov");
	    bakay.setAge(19);
	    bakay.setMan("Man\n");

	    Student emir = new Student();
	    emir.setName("Emir");
	    emir.setSoname("Chokoev");
	    emir.setAge(18);
	    emir.setMan("Man");

	    Student[] student = new Student[2];
	    student[0] = bakay;
	    student[1] = emir;

		Course course = new Course();
		course.setName("Java");
		course.setDate("17.02.2021");
		course.setId(21232142);
		course.setTeacherName("Aidin Sabyrov");

	    Group group = new Group();
	    group.setStudentArray(student);
		group.printStudentArray(group.getStudentArray());
		group.setCourseStudents(course);
		group.printCourseStudents(group.getCourseStudents());
		group.setMonth(9);
		group.setStartDay("17.02.2021");
		group.printInfoGroup();

    }
}
