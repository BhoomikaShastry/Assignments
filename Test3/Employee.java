import java.util.Scanner;

public class Employee {

	public void calculateNetSalary(double basics, double ta)
	{
		double hra, sa, netsalary;
		int tax=2500;
		if(basics<=10000)
		{
			hra=(0.20*basics);
			sa=(0.80*basics);
			System.out.println("HRA: "+hra+" Special Allowance: "+sa);
			netsalary=basics+hra+sa+ta-tax;
			System.out.println("Net Salary: "+netsalary);
			
		}
		else if(basics>=10001 && basics<=20000)
		{
			hra=(0.25*basics);
			sa=(0.90*basics);
			System.out.println("HRA: "+hra+" Special Allowance: "+sa);
			netsalary=basics+hra+sa+ta-tax;
			System.out.println("Net Salary: "+netsalary);
			
		}
		else if(basics>=20001)
		{
			hra=(0.30*basics);
			sa=(0.95*basics);
			System.out.println("HRA: "+hra+" Special Allowance: "+sa);
			netsalary=basics+hra+sa+ta-tax;
			System.out.println("Net Salary: "+netsalary);
			
		}
		else
		{
			System.out.println("Enter proper Basic Salary");
		}
		
		
	}
	
	
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		Employee e=new Employee();
		int empid;
		String empname;
		double basics, ta;
		System.out.println("Enter Employee ID");
		empid=s.nextInt();
		s.nextLine();
		System.out.println("Enter Employee Name");
		empname=s.nextLine();
		System.out.println("Enter basic salary");
		basics=s.nextDouble();
		System.out.println("Employee ID: "+empid+"\nEmployee Name: "+empname);
		System.out.println("--------------------------------------");
		ta=(0.20*basics);
		System.out.println("Transport Allowance is: "+ta);
		e.calculateNetSalary(basics, ta);
	}

}
