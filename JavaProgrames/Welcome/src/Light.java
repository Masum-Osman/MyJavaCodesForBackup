
public class Light {
	public static void main(String [ ] args)
	{
		int LightSpeed;
		long days;
		long seconds;
		long distance;
		
		LightSpeed = 336000;
		days = 1000;
		seconds = days*24*60*60;
		
		distance = LightSpeed*seconds;
		
		System.out.print("In " +days);
		System.out.print(" Days Light will travel about ");
		System.out.println(distance + " KiloMeters.");
	}
}
