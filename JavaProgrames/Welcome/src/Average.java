
public class Average {
	public static void main(String args[])
	{
		int array[] = {10,20.5,30,45.02,40};
		int sum = 0;
		
		int i;
		
		for(i=0; i<5; i++)
		{
			sum = sum + array[i];
		}
		
		System.out.print("Sum is: "+sum);
	}
}
