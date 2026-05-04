package saturdayndsunday;

public class ExceptionDemo {

	public static void main(String[] args) {
		int i = 0, j = 10;
		try {
			int result = j/i;
			System.out.println(result);
		}
		catch(ArithmeticException e) {
			System.out.println("Can't divisable by Zero" +e);
			
		}
	}

}
