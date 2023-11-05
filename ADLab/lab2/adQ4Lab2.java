import java.util.Scanner;

public class adQ4Lab2 {
    public static int mul(int a){ 
		if (a==1) {
            return 1;
        }
        else{
            return a*mul(a-1);    
        }
        
    }    
	public static void main(String[] args) {
		
	       
	        
         Scanner sc = new Scanner(System.in);
         System.out.println("enter n");
          int z = sc.nextInt();
        
           
        System.out.println(" sum of n "+mul(z)); 
        
         

	}

}
