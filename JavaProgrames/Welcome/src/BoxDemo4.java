
public class BoxDemo4 {
	public static void main(String args[])
	{
		Boxs mybox1 = new Boxs(10,15,5);
		Boxs mybox2 = new Boxs(45,87,2554);
		
		double vol;
		
		vol = mybox1.volume();
		System.out.println("Volume is "+ vol);
		
		vol = mybox2.volume();
		System.out.println("Second Volume is "+ vol);
	}
}
