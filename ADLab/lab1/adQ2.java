import java.util.Scanner;

public class adQ2 {
	public static int max(int[] arr){ 
		int max=arr[0];
		int min=arr[0];
        for(int i=1;i<arr.length;i++){    
           if(max<arr[i]) { 
        	   max=arr[i];
           }
          
        }    
        return  max;
        
    }    
	public static int min(int[] arr){ 
		
		int min=arr[0];
        for(int i=1;i<arr.length;i++){    
           
           if(min>arr[i]) { 
        	   min=arr[i];
           }
        }    
       
        return min; 
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
            System.out.println(" max is "+max(a1)+" min is "+min(a1)); 
	}

}
