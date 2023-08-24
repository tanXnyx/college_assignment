import java.util.Scanner;
public class pog_4 {

	public static void main(String[] args) 
	{
		int n,x,y,z;
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter a number between 0 and 1000:");
		n=ob.nextInt();
		x=n%10;
		n=n/10;
		y=n%10;
		n=n/10;
		z=n%10;
		System.out.println("the sum of the digits is:"+(x+y+z)); 
		

	}

}
