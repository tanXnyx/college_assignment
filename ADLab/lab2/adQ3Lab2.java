import java.util.Scanner;

public class adQ3Lab2 {
    public static int fib(int a){ 
        if (a <= 1){
            return a;
        }
       
    return fib(a - 1) + fib(a - 2);
        
    }    
	public static void main(String[] args) {
		
	       
	        
         Scanner sc = new Scanner(System.in);
         System.out.println("enter n term ");
          int z = sc.nextInt();
        
           
        System.out.println(" fib of n "+fib(z)); 
    }
}
