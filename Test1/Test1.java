import java.util.HashMap;
import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		FlowerDemo fd = new FlowerDemo();
		System.out.println("Enter continent name (Asia/Europe/Africa)");
		String str=s.nextLine();
		fd.displayFlower(str);
	}

}
