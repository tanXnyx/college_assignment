import java.util.Scanner;

public class adQ5Lab2 {
   
     public static int gcd(int a,int b){ 
		if (b== 0)             
             return a;
       
        return gcd(b, a % b);
    }    
	public static void main(String[] args) {
		
	       
	        
         Scanner sc = new Scanner(System.in);
         System.out.println("enter 2 numder to find gcd");
          int z = sc.nextInt();
            int y = sc.nextInt();
        
           
        System.out.println(" gcd of n "+gcd(z,y)); 
        
         

	}
}
