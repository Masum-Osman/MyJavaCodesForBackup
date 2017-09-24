
public class OverLoad {
	public static void main(String args[])
	{
		OverLoadDemo NoV = new OverLoadDemo();
		
		double result;
		
		NoV.test();
		NoV.test(10);
		NoV.test(10,20);
		
		result = NoV.test(123.456);
		
		System.out.println("Result of ob.test(123.25): " + result);
	}
}
