
public class Convertion {
	public static void main(String[] args)
	{
		int a = 275;
		byte b;
		double c = 235.2458;
		
		System.out.println("Convertion from int to byte: ");
		b = (byte) a;
		System.out.println("a and b " + a +" to "+ b);
		
		System.out.println("Convertion from double to int: ");
		a = (int) c;
		System.out.println("a and c " + c +" to "+ a);
		
		System.out.println("Convertion from double to byte: ");
		b = (byte) c;
		System.out.println("c and b " + c +" to "+ b);
		
		System.out.println("Convertion from int to double: ");
		c = (double) a;
		System.out.println("a and c " + c +" to "+ a);
		
	}
}
