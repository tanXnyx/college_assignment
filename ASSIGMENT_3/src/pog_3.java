import java.util.Scanner;

public class pog_3 
{

	public static void main(String[] args)
    {
		int n1,n2,n3;
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter 1st number :");
		n1=ob.nextInt();
		System.out.println("Enter 2st number :");
		n2=ob.nextInt();
		System.out.println("Enter 3st number :");
		n3=ob.nextInt();
		if(n1<n2 && n2<n3)
			System.out.println("Increasing");
	    else if(n1>n3 && n2>n3)
			System.out.println("decreasing");
		else
			System.out.println("Neither Increasing nor decreasing");
		
		{ 
			
				
		}
	}

}
