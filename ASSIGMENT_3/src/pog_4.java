import java.util.Scanner;
public class pog_4 
{

	public static void main(String[] args) 
	{
		int x,y,min,max;
		Scanner ob=new Scanner(System.in);
		x=ob.nextInt();
		min=1;
		max=2;
		y=(int) (min+(max)*Math.random());
		System.out.println(x);
		System.out.println(y);
		if(x==y)
			System.out.println("You got it right");
	    else if(x==y-1 || x==y+1)
	    	System.out.println("“Almost got it”");	
		else
			System.out.println("You got it wrong");

	}

}
