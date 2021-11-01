
public class EnjoyRide {
	

	public void calculate(int n1, int n2, int h, int childfare, int adultfare) {
		
		int total_hours=(n1*h)+(n2*h);
		int adult_ride_fare=(n1*h*adultfare);
		int child_ride_fare=(n2*h*childfare);
		System.out.println("Total hours of ride: "+total_hours);
		System.out.println("Adults fare: "+adult_ride_fare);
		System.out.println("Children fare: "+child_ride_fare);
		System.out.println("Total fare: "+(adult_ride_fare+child_ride_fare));
	}
}
