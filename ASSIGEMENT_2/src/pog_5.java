import java.util.Scanner;
public class pog_5
{

	public static void main(String[] args) 
	{
		double r,sa,va;
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter the radius of the hemisphere:");
		r=ob.nextFloat();
		sa=3*r*r*Math.PI;
		va=(2.0/3)*Math.PI*r*r*r;
		System.out.println("The surface area of the hemisphere is "+sa);
		System.out.println("The volume area of the hemisphere is"+va);
		
		
		
		

	}

}
