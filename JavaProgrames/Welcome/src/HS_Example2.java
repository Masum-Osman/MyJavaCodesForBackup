
public class HS_Example2 {
	public static void main(String[] args)
	{
		float num;
		num = 100;
		int i,j;
		
		System.out.println("This is num: "+num);
		
		num = num*2;
		
		System.out.println("This is the new value of Number: " + num);
		
		num = num/26;
		
		System.out.println("Now The num is devided by my date: " +num);
		
		int decimalNumber = 0, Remainder, HexadecimalNumber = 485;
		int count;
		
		System.out.println("Enter a Hexa Decimal Number: ");
		for(count = 0; HexadecimalNumber > 0; count++)
		{
			Remainder = HexadecimalNumber % 10;
			decimalNumber = decimalNumber + Remainder * 16;
			HexadecimalNumber = HexadecimalNumber/10;
		}
		
		System.out.println("Decimal Number: "+decimalNumber);
	}
}
