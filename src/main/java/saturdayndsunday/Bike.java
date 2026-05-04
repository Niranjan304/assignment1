package saturdayndsunday;

public class Bike implements Rentable {

	String brand;
	int dailyRate = 400;

	Bike(String brand) {
		this.brand = brand;
		}
	
	@Override
	 public void caluculateRent(int days) {
		int total= 400*days;
	    System.out.println("total rent for" + days+ " is" +total);
}
	@Override
	 public void displayDetails() {
		System.out.println("Bike brand: "+ brand);


	}
}