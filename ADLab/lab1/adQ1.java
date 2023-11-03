import java.util.Scanner;
public class adQ1 {
	public static int sum(int[] arr){ 
		int sum=0;
        for(int i=0;i<arr.length;i++){    
            sum=sum+arr[i];   
        }    
        return sum;    
    }    
	public static void main(String[] args) {
		 int[]a1;
	       
	        
         Scanner sc = new Scanner(System.in);
         System.out.println("enter size");
          int z = sc.nextInt();
         a1= new int[z];
        
        
         System.out.println("enter element of arr");
            for(int i=0;i<a1.length;i++){
            int y = sc.nextInt();
            a1[i]=y;
         }
           
        System.out.println(" sum of n "+sum(a1)); 
        
         

	}

}
