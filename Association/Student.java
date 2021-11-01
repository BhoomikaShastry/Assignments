package com.association;

public class Student {
	
	public String name;
	public int rollno;
	public String city;
	public void setName(String name) {
		this.name = name;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	public void studentDetails()
	{
		System.out.println("Name: "+name+" Roll No.: "+rollno+" City: "+city);
	}
	public void studentBranch()
	{
		Branch b=new Branch();
		b.studiesBranch();
	}
	public void studentSociety()
	{
		Society s=new Society();
		s.collegeSociety();
	}
	
}
