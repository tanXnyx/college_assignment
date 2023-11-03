import java.util.Scanner;
public class adQ4 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("enter numder");
		int y = sc.nextInt();
		 int i,fact=1;  	    
		  for(i=1;i<=y;i++){    
		      fact=fact*i;    
		  }    
		  System.out.println("Factorial of "+y+" is: "+fact);  

	}

}
