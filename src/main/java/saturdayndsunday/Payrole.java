package saturdayndsunday;

public class Payrole {

	public static void main(String[] args) {
		Manager m1 = new Manager("Alice", 90000);
		Developer d1 = new Developer("Bob", 60000);
		Developer d2 = new Developer("Charlie", 50000);
		m1.DisplayDetails();
		d1.DisplayDetails();
		d2.DisplayDetails();
	}
}
