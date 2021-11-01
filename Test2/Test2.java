import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		EnjoyRide er=new EnjoyRide();
		do {
		System.out.println("Enter the no. of Adults");
		int n1=s.nextInt();
		System.out.println("Enter the no. of Children");
		int n2=s.nextInt();
		s.nextLine();
		System.out.println("How many hours u want to take a ride?");
		int h=s.nextInt();
		System.out.println("Select- 1:Alibaba 2:Alpine Slide 3:Bumper Cars 4:Balloon Race");
		int i=s.nextInt();
		switch(i)
		{
		case 1: int adultfare1=50;
						int childfare1=40;
						er.calculate(n1, n2, h, childfare1, adultfare1);
						break;
		case 2: int adultfare2=60;
							 int childfare2=40;
							 er.calculate(n1, n2, h, childfare2, adultfare2);
							 break;
		case 3: int adultfare3=45;
		 					 int childfare3=25;
		 					 er.calculate(n1, n2, h, childfare3, adultfare3);
		 					 break;
		case 4: int adultfare4=70;
							 int childfare4=60;
							 er.calculate(n1, n2, h, childfare4, adultfare4);
							 break;
		case 5: System.exit(0);
		default: System.out.println("Enter number between 1 to 5");
				 break;
		
		}
		}while(true);
		
	}

}
