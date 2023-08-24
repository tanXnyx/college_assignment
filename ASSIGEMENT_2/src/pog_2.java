import java.util.Scanner;
public class pog_2 
{

	public static void main(String[] args) 
	{
		double km,meters,feet,inch,centimetres;
		Scanner ob=new Scanner(System.in);
		System.out.println("The distance between two cities (in km.):");
		km=ob.nextFloat();
		meters=1000*km;
		feet=3280.8399*km;
		inch=39370.0787*km;
		centimetres=100000*km;
		System.out.println(km+"km is "+meters+"meters");
		System.out.println(km+"km is "+feet+"feet");
		System.out.println(km+"km is "+inch+"inch");
		System.out.println(km+"km is "+centimetres+"centimetres");
		
		
		
		

	}

}
