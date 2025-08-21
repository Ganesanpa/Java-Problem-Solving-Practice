package Day9;
import java.util.*;
public class p2 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n=s.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("enter value: ");
            arr[i]=s.nextInt();
        }
        
for(int i=0;i<arr.length;i++){
    int l=arr[i];int f=0;
    for(int j=i+1;j<arr.length;j++){
        if(l<arr[j]){
            f=1;
           break;
        }
      
    }
  if(f==0)
        System.out.print(" " +l);}

   s.close(); }
    
}
