import java.util.HashMap;
import java.util.Set;

public class FlowerDemo {

	public void displayFlower(String continent)
	{
		System.out.println(continent);
		System.out.println("----------------------------------");
		HashMap<String,String> h=new HashMap<>();
		if(continent.equalsIgnoreCase("Asia"))
		{
			
			h.put("India\t", "\tLotus");
			h.put("Pakistan ", "\tJasmine");
			h.put("Nepal\t", "\tLali Gurans");
			System.out.println("Country Name \t National Flower");
			System.out.println("----------------------------------");
			for(String data:h.keySet())
			System.out.println(data+" "+h.get(data));
		}
		else if(continent.equalsIgnoreCase("Europe"))
		{
			
			h.put("Germany\t", "\tCorn Flower");
			h.put("France\t", "\tLily");
			h.put("Greece\t", "\tAcanthus Mollis");
			System.out.println("Country Name \t National Flower");
			System.out.println("----------------------------------");
			for(String data:h.keySet())
				System.out.println(data+" "+h.get(data));
			}
		else if(continent.equalsIgnoreCase("Africa"))
		{
			h.put("Egypt\t", "\tBlue Lotus");
			h.put("Nigeria\t", "\tYellow Trumpet");
			h.put("Kenya\t", "\tLali Orchid");
			System.out.println("Country Name \t National Flower");
			System.out.println("----------------------------------");
			for(String data:h.keySet())
				System.out.println(data+" "+h.get(data));
			}
		else
			System.out.println("Enter any one of the 3 continents");
	}
}
