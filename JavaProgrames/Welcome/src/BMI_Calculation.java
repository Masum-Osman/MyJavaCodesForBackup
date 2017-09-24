import java.util.Scanner;
public class BMI_Calculation {
	public static void main(String args[])
   {
      int feet, inch, var;
      double weight, HeightInMeter, BMI;
      String Name;
 
      Scanner in = new Scanner(System.in);
 
      System.out.println("Enter your name: ");
      Name = in.nextLine();
 
      System.out.println("Your Height in feet");
      feet = in.nextInt();
      System.out.println("Remaining inch ");
      inch = in.nextInt();
      
      var= (feet*12) + inch;
      HeightInMeter = var * 0.0254;
      
      System.out.println("Your Height in Meter is: "+HeightInMeter);
 
      System.out.println("\nEnter your weight in KG: ");
      weight = in.nextFloat();
      
      BMI = weight/(HeightInMeter * HeightInMeter);
      
      System.out.println(Name +" Your BMI Result is: "+BMI);
      System.out.print("Your BMA Says about you: ");
      
      if(BMI < 18.5)
      {
    	  System.out.println("You are Under Weight. Eat food more. Eat!");
      }
      
      else if(BMI >= 18.5 && BMI <= 24.9)
      {
    	  System.out.println("Perfect! Keep this Habit.");
      }
      
      else if(BMI >= 25 && BMI <= 29.9)
      {
    	  System.out.println("Over Weight!!!\n Do excercise to reduce weight");
      }
      
      else if(BMI >= 30 && BMI <= 34.9)
      {
    	  System.out.println("First Step of getting Fat!\n Excercise is Mandatory. Be Aware about taking Food");
      }
      
      else if(BMI >= 35 && BMI <= 39.9)
      {
    	  System.out.println("Second Step of getting Fat!\n Excercise is Must Now. Taking Food is now Limited for you!");
      }
      
      else
      {
    	  System.out.println("Go To Doctor!!!");
      }
         
   }

}