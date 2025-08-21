package Day9;
import java.util.*;
public class p1 {
    
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int min=n%10;
        int max=n%10;
        n/=10;
        while(n!=0){
           int l=n%10;
         if(l>max ){
max=l;
        }else if(l<min){
            min=l;
        }
        n=n/10;
        }
        System.out.println("max: "+max);
        System.out.println("max: "+min);

   s.close(); }
}
