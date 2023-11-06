import java.util.*;
public class linear{
    public static void main(String[] args) {
        int [] arg;
        int i=0;
        arg= new int[5];
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        arg[0]=4;
         arg[1]=4;
          arg[2]=4;
           arg[3]=4;
            arg[4]=4;
            while(i< arg.length){
                if(i==a){
                    System.out.println("found");
                    break;
                }
                i++;
            }
    }
}