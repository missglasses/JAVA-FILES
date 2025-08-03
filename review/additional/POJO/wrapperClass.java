public class ExamineWrappers {

	public static void main(String[] args) {
		Double pi = 3.14;
		Double eulers = 2.71828;
		//using compareTo()
		int x = pi.compareTo(eulers);
		System.out.println(x);

		// using Short 
		System.out.println(Short.MAX_VALUE);

		// using Boolean
		boolean y = Boolean.parseBoolean("true");
		System.out.println(y);
	}
}
