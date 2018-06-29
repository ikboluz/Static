package staticVariable;

public class MallParking {
	public static void main(String[] args) {
		Parking.numberOfSpacesAvailible=5;
		Parking p1 = new Parking();
		p1.parkACar("Tesla S");
		p1.parkACar("Benz");
		p1.parkACar("BMW X6");
		
		System.out.println(p1.numberOfSpacesAvailible);
		
		Parking p2 = new Parking();
		p2.parkACar("MiniCooper S");
		
		System.out.println(p2.numberOfSpacesAvailible);
		System.out.println(p1.numberOfSpacesAvailible);
		
		System.out.println("=================================");
		
		System.out.println(Parking.numberOfSpacesAvailible);
	}

}
