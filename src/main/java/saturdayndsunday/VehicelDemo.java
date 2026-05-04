package saturdayndsunday;

public class VehicelDemo {
		public static void main(String[] args) {
			Car cr = new Car("honda");
			Bike bk =new Bike("Pulsar");
			cr.displayDetails();
			cr.caluculateRent(4);
            bk.displayDetails();
            bk.caluculateRent(7);

	 }
}
