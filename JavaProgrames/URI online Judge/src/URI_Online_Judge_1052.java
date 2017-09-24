import java.util.Scanner;
public class URI_Online_Judge_1052 {
	public static void main(String args[])
	{
		int month;
		
		Scanner sc=new Scanner(System.in); 
		month = sc.nextInt();
		
		if(month == 1)
			System.out.println("January\n");
		
		else if(month == 2)
			System.out.println("February\n");
		
		else if(month == 3)
			System.out.println("March\n");
		
		else if(month == 4)
			System.out.println("April\n");
		
		else if(month == 5)
			System.out.println("May\n");
		
		else if(month == 6)
			System.out.println("June\n");
		
		else if(month == 7)
			System.out.println("July\n");
		
		else if(month == 8)
			System.out.println("August\n");
		
		else if(month == 9)
			System.out.println("September\n");
		
		else if(month == 10)
			System.out.println("October\n");
		
		else if(month == 11)
			System.out.println("November\n");
		
		else 
			System.out.println("December\n");
	}
}
