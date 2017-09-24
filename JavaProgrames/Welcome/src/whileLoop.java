import java.util.Scanner;
public class whileLoop {
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		int digit;
		
		System.out.println("Enter digit: ");
		digit = input.nextInt();
		
		System.out.println();
		
		while(digit > 0)
		{
			System.out.println(digit);
			digit--;
		}
	}
}
