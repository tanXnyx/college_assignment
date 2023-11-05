import java.util.Scanner;

public class adQ6Lab2 {
       public static int hex(int a){ 
		if (a== 0)             
           
        System.out.print(a % 16);     
       
        return hex( a / 16);
    }    
	public static void main(String[] args) {
		
	       
	        
         Scanner sc = new Scanner(System.in);
         System.out.println("enter 2 numder to find gcd");
          int z = sc.nextInt();
           
           
        System.out.println(hex(z)); 
        
         

	}
}
