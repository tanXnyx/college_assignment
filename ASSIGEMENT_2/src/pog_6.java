import java.util.Scanner;
public class pog_6
{

	public static void main(String[] args) 
	{
		double t,g,d;
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter the number of seconds:");
		t=ob.nextFloat();
		g=32.174;
		d=(1.0/2)*g*t*t;
		System.out.println("Distance travelled: "+d);

	}

}
