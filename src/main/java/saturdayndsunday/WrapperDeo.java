package saturdayndsunday;

public class WrapperDeo {

	public static void main(String[] args) {
		Integer in = Integer.valueOf(187);
		int a = in.intValue();
		double d = in.doubleValue();
		Integer in1 = Integer.valueOf(455);
		System.out.println(a);
		System.out.println(d);
		System.out.println(in1);
		//int to String
		String str1 = Integer.toString(2344);
		System.out.println(str1);
		System.out.println(Integer.toString(20,289));
		System.out.println(Integer.toBinaryString(78));
	}
}
