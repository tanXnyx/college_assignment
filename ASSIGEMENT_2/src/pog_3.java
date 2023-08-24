import java.util.Scanner;
public class pog_3 
{

	public static void main(String[] args) 
	{
		double bs,DA,HRA,GS;
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter basic salary:");
		bs=ob.nextFloat();
		DA= bs*(40.0/100);
		HRA= bs*(20.0/100);
		GS=DA+HRA+bs;
		System.out.println("DA is "+DA);
		System.out.println("HRA is "+HRA);
		System.out.println("Gross salary is "+GS);
		

	}

}
