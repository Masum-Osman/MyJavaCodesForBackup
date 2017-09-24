
public class OverLoadCons {
	public static void main(String args[])
	{
		// create boxes using the various constructors
		Boxs mybox1 = new Boxs(10, 20, 15);
		Boxs mybox2 = new Boxs();
		Boxs mycube = new Boxs(7);
		double vol;
		
		
		// get volume of first box
		vol = mybox1.volume();
		System.out.println("Volume of mybox1 is " + vol);
		
		
		// get volume of second box
		vol = mybox2.volume();
		System.out.println("Volume of mybox2 is " + vol);
		
		
		
		// get volume of cube
		vol = mycube.volume();
		System.out.println("Volume of mycube is " + vol);
		}
}
