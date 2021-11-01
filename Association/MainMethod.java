package com.association;

public class MainMethod {

	public static void main(String[] args) {
		
		UndergradStudent ug = new UndergradStudent();
		ug.setName("Bhoomika");
		ug.setRollno(101);
		ug.setCity("Bangalore");
		ug.setYear(2021);
		ug.studentDetails();
		ug.getYear();
		ug.studentBranch();
		ug.studentSociety();
		
		UndergradStudent ug1 = new UndergradStudent();
		ug1.setName("Deepa");
		ug1.setRollno(102);
		ug1.setCity("Bangalore");
		ug1.setYear(2020);
		ug1.studentDetails();
		ug1.getYear();
		ug1.studentBranch();

	}

}
