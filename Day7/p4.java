
package Day7;
import java.util.*;
public class p4 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        int ss=s.nextInt();
        int f=-1;
        for(int i=0;i<n;i++){
            if(ss==arr[i]){
f=1;
break;
            }
          
        }
     System.out.println(f);
    s.close(); }

}
