import java.util.Scanner;

public class adQ3 {
	
	public static int sum(int[] arr){ 
		int sum=0;
        for(int i=0;i<arr.length;i++){    
            sum=sum+arr[i];   
        }    
        return sum;    
	}
	public static void main(String[] args) {
		int[]a1;
	     int []temp;  
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size");
         int z = sc.nextInt();
        a1= new int[z];
        temp= new int[z];
       
        
         System.out.println("enter element of arr");
           for(int i=0;i<a1.length;i++){
           int y = sc.nextInt();
           a1[i]=y;
        }
        System.out.println("enter pos");
        int key =sc.nextInt(); 
//        int j=0;
// 		while(j<=key) {
// 			 
// 	         int x=a1[0];
// 	 		
//         for(int i=1;i<a1.length;i++){
//         
//             a1[i-1] = a1[i]  ;
//            
//                   
//               
//         } 
//         a1[a1.length-1]=x;
//         j++;
// 		}
// 		 for(int i=0;i<a1.length;i++){
// 			  System.out.println(   a1[i]); 
// 	         }
        
        for(int i=0;i<a1.length;i++){
           
         temp[i]=   a1[key];
         key= ++key%(a1.length);
         }     
         
        for(int i=0;i<a1.length;i++){
		  System.out.println(  temp[i]); 
	         }

	}

}
