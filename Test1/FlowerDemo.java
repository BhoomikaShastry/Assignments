import java.util.HashMap;
import java.util.Set;

public class FlowerDemo {

	public void displayFlower(String continent)
	{
		System.out.println(continent);
		System.out.println("----------------------------------");
		if(continent.equalsIgnoreCase("Asia"))
		{
			HashMap<String,String> h1=new HashMap<>();
			h1.put("India\t", "\tLotus");
			h1.put("Pakistan ", "\tJasmine");
			h1.put("Nepal\t", "\tLali Gurans");
			System.out.println("Country Name \t National Flower");
			System.out.println("----------------------------------");
			Set set=h1.entrySet();
			for(Object data:set)
			System.out.println(data);
		}
		else if(continent.equalsIgnoreCase("Europe"))
		{
			HashMap<String,String> h2=new HashMap<>();
			h2.put("Germany\t", "\tCorn Flower");
			h2.put("France\t", "\tLily");
			h2.put("Greece\t", "\tAcanthus Mollis");
			System.out.println("Country Name \t National Flower");
			System.out.println("----------------------------------");
			Set set=h2.entrySet();
			for(Object data:set)
			System.out.println(data);
			}
		else if(continent.equalsIgnoreCase("Africa"))
		{
			HashMap<String,String> h3=new HashMap<>();
			h3.put("Egypt\t", "\tBlue Lotus");
			h3.put("Nigeria\t", "\tYellow Trumpet");
			h3.put("Kenya\t", "\tLali Orchid");
			System.out.println("Country Name \t National Flower");
			System.out.println("----------------------------------");
			Set set=h3.entrySet();
			for(Object data:set)
			System.out.println(data);
			}
		else
			System.out.println("Enter any one of the 3 continents");
	}
}
