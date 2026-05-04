package saturdayndsunday;

class Car implements Rentable {
	String brand;
	int dailyRate = 1000;

	Car(String brand) {
		this.brand = brand;
	}

	@Override
	public void caluculateRent(int days) {

		int total = 1000 * days;
		System.out.println("total rent for" + days + "is" + total);

	}

	@Override

	public void displayDetails() {
		System.out.println("Car brand:" + brand);
	}
}