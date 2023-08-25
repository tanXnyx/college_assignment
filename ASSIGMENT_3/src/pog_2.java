import java.util.Scanner;
public class pog_2 
{

	public static void main(String[] args) 
	{
		double x;
		Scanner ob=new Scanner(System.in);
		x=ob.nextFloat();
		if(x==5000)
			System.out.println("Yes, Alice is following doctor’s advice");
		else
			System.out.println("No, Alice is not following doctor’s advice");
	}

}
