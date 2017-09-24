
public class BoxDemo5 {
	public static void main(String args[])
	{
		Boxs mybox1 = new Boxs();
		Boxs mybox2 = new Boxs();
		
		double vol;
		
		mybox1.setDim(10, 20, 15);
		mybox2.setDim(3, 6, 9);
		
		vol = mybox1.volume();
		System.out.println("Volume is "+ vol);
		
		vol = mybox2.volume();
		System.out.println("Second Volume is "+ vol);
	}
}
