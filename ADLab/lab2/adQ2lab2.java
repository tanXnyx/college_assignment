import java.util.Scanner;

public class adQ2lab2 {
    	public static int max(int[] arr,int n){ 
            if(n == 1) 
            return arr[0]; 
              
            return Math.max(arr[n-1], max(arr, n-1)); 
        
    }    
	public static int min(int[] arr,int n){ 
		
		 if(n == 1) 
            return arr[0]; 
              
            return Math.min(arr[n-1], min(arr, n-1)); 
        
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
            System.out.println(" max is "+max(a1,z)+" min is "+min(a1,z)); 
	}

}
