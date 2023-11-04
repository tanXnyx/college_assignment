import java.util.Scanner;

public class adQ5 {

	public static void main(String[] args) {
		int[]a1;
	      
       
       Scanner sc = new Scanner(System.in);
       System.out.println("enter size");
        int z = sc.nextInt();
       a1= new int[z];
    
       int max=a1[0];
       
        System.out.println("enter element of arr");
          for(int i=0;i<a1.length;i++){
          int y = sc.nextInt();
          a1[i]=y;
       }
          for(int i=1;i<a1.length;i++){    
              if(max<a1[i]) { 
           	   max=a1[i];
              }
             
           }    
          boolean []temp= new boolean[max];
          for(int i=0;i<temp.length;i++){
              temp[i]=false;
           }
          for(int i=1;i<a1.length;i++){    
             if(a1[i]>0) {
            	 temp[a1[i]-1]=true; 
             }
             
             
           }
          for(int i=1;i<temp.length;i++){
              if(temp[i]==false) {
            	  System.out.println(i+1);
            	  break;
              }
           }
         
 
	}

}
