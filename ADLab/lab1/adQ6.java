import java.util.Scanner;

public class adQ6 {

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
            int n = a1.length;  
            int temp = 0;  
             for(int i=0; i < n; i++){  
                     for(int j=1; j < (n-i); j++){  
                              if(a1[j-1] > a1[j]){  
                                    
                                     temp = a1[j-1];  
                                     a1[j-1] = a1[j];  
                                     a1[j] = temp;  
                              }
                     }
                     
                              
                     }
             for(int i=0;i<a1.length;i++){
       		  System.out.println(  a1[i]); 
       	         }
             System.out.println("min max");
             int m = a1.length;
             for(int i=0; i < m/2; i++) {
            	 System.out.println(a1[n-1-i]);
            	 System.out.println(a1[i]);
             }
             if(m%2==1) {
            	 System.out.println(a1[m/2]);
             }
             
           
 
	}

}
