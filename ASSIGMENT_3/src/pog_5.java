import java.util.Scanner;
public class pog_5 
{

	public static void main(String[] args)
	{
		int y;
		Scanner ob=new Scanner(System.in);
		System.out.println("Input the year :");
		y=ob.nextInt();
		if( ((y % 4 == 0 && y % 100!= 0) || y%400 == 0))
				System.out.println("true");
		else
				System.out.println("false");
				
		

	}

}
