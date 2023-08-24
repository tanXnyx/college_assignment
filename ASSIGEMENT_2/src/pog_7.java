import java.util.Scanner;
public class pog_7 
{

	public static void main(String[] args) 
	{
		int a,b,x;
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter the starting number a:");
		System.out.println("Enter the starting power b:");
		a=ob.nextInt();
		b=ob.nextInt();
		x=(int) Math.pow(a, b);
		System.out.println("a      b      pow(a,b)");
		System.out.println(a+"      "+b+"      "+x);
		a=a+1;
		b=b+1;
		x=(int) Math.pow(a, b);
		System.out.println(a+"      "+b+"      "+x);
		a=a+1;
		b=b+1;
		x=(int) Math.pow(a, b);
		System.out.println(a+"      "+b+"      "+x);
		a=a+1;
		b=b+1;
		x=(int) Math.pow(a, b);
		System.out.println(a+"      "+b+"      "+x);
		a=a+1;
		b=b+1;
		x=(int) Math.pow(a, b);
		System.out.println(a+"      "+b+"      "+x);
				

	}

}
