package staticVariable;

public class Parking {
	
	static int numberOfSpacesAvailible=20;
	
	public void parkACar(String model) {
		System.out.println("Parking: "+model);
		numberOfSpacesAvailible--;
	}
	
	public boolean parkingAvailibel() {
		if(numberOfSpacesAvailible>0) {
			return true;
		}
		return false;
	}

}
