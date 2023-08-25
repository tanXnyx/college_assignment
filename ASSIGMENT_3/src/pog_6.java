import java.util.Scanner;
public class pog_6 
{

	public static void main(String[] args) 
	{
		double x;
		Scanner ob=new Scanner(System.in);
		x=ob.nextFloat();
		if(x<=50)
			System.out.println(x*3);
		else if(x>50 && x<=200)
		System.out.println(50*3+(4.80*(x-50)));
		else if(x>200 && x<=400)
			System.out.println(50*3+4.80*150+(5.80*(x-200)));
		else if(x>200 && x<=400)
			System.out.println(50*3+4.80*150+5.80*200+(6.80*(x-200)));
	}

}
